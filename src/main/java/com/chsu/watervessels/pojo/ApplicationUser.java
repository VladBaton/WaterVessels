package com.chsu.watervessels.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ApplicationUser {

    private String login;

    private List<Ship> favoriteShips = new ArrayList<>();
}
