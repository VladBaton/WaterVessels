package com.chsu.watervessels.controller;

import com.chsu.watervessels.pojo.Port;
import com.chsu.watervessels.pojo.request.CreatePortRequest;
import com.chsu.watervessels.pojo.response.BaseResponse;
import com.chsu.watervessels.pojo.response.CreatePortResponse;
import com.chsu.watervessels.pojo.response.GetAllPortsResponse;
import com.chsu.watervessels.service.PortService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ports")
@RequiredArgsConstructor
public class PortController {

    @Autowired
    PortService portService;

    @GetMapping
    ResponseEntity<GetAllPortsResponse> getAllPorts() {
        return portService.getAllPorts();
    }

    @PostMapping("/add")
    ResponseEntity<CreatePortResponse> addPort(@RequestBody CreatePortRequest request) throws Exception {
        return portService.addPort(request);
    }

    @DeleteMapping("/{portName}")
    ResponseEntity<BaseResponse> deletePort(@PathVariable("portName") String portName) {
        return portService.deletePort(portName);
    }
}
