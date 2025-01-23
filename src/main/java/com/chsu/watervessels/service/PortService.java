package com.chsu.watervessels.service;

import com.chsu.watervessels.entity.Country;
import com.chsu.watervessels.entity.Port;
import com.chsu.watervessels.mapper.EntityToPojoMapper;
import com.chsu.watervessels.mapper.PojoToEntityMapper;
import com.chsu.watervessels.pojo.request.CreatePortRequest;
import com.chsu.watervessels.pojo.response.BaseResponse;
import com.chsu.watervessels.pojo.response.CreatePortResponse;
import com.chsu.watervessels.pojo.response.GetAllPortsResponse;
import com.chsu.watervessels.repositiry.CountryRepository;
import com.chsu.watervessels.repositiry.PortRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PortService {

    @Autowired
    PortRepository portRepository;

    @Autowired
    CountryRepository countryRepository;

    public ResponseEntity<GetAllPortsResponse> getAllPorts() {
        GetAllPortsResponse response = new GetAllPortsResponse();
        response.setPortList(portRepository.findAll().stream().map(EntityToPojoMapper.INSTANCE::portToPojo).toList());
        return ResponseEntity.ok(response);
    }

    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<CreatePortResponse> addPort(@Valid CreatePortRequest request) throws IllegalAccessException {
        CreatePortResponse response = new CreatePortResponse();

        com.chsu.watervessels.entity.Port port = PojoToEntityMapper.INSTANCE.createPortRequestToEntity(request);
        Country country = countryRepository.findCountryByCountryName(request.getCountryName());
        if (Objects.isNull(country)) {
            throw new IllegalArgumentException(String.format("Страна с названием %s не найдена", request.getCountryName()));
        }
        port.setCountry(country);
        country.getPorts().add(port);
        portRepository.save(port);

        response.setCreatedPort(EntityToPojoMapper.INSTANCE.portToPojo(port));
        return ResponseEntity.ok(response);
    }

    @Transactional(rollbackOn = Exception.class)
    public ResponseEntity<BaseResponse> deletePort(String portName) {
        Port port = portRepository.findPortByPortName(portName);
        if (Objects.isNull(port)) {
            throw new IllegalArgumentException(String.format("Порт с названием %s не найден", portName));
        }
        portRepository.delete(port);
        return ResponseEntity.ok().body(new BaseResponse());
    }
}
