package com.chsu.watervessels.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Port {

    private String portName;

    private String countryName;

    private List<Ship> ships;

    public Port() {
        ships = new ArrayList<>();
    }
}
