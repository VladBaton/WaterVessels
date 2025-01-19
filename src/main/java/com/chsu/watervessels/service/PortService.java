package com.chsu.watervessels.service;

import com.chsu.watervessels.mapper.EntityToPojoMapper;
import com.chsu.watervessels.pojo.Port;
import com.chsu.watervessels.repositiry.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortService {

    @Autowired
    PortRepository portRepository;

    public List<Port> getAllPorts() {
        return portRepository.findAll().stream().map(EntityToPojoMapper.INSTANCE::portToPojo).toList();
    }
}
