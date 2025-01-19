package com.chsu.watervessels.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ShipOwner {

    private String ownerName;

    List<Ship> ships;
}
