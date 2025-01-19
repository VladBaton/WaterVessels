package com.chsu.watervessels.pojo;

import com.chsu.watervessels.entity.Country;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Ship {

    private String countryName;

    private String shipOwner;

    private String portName;

    private String name;

    private Long imo;

    private String callSign;

    private Date launchDate;

    private Double length;

    private Double width;

    private Double draft;

    private Double displacement;
}
