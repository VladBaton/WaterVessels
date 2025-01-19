package com.chsu.watervessels.controller;

import com.chsu.watervessels.pojo.Port;
import com.chsu.watervessels.service.PortService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ports")
@RequiredArgsConstructor
public class PortController {

    @Autowired
    PortService portService;

    @GetMapping
    List<Port> getAllPorts() {
        return portService.getAllPorts();
    }

}
