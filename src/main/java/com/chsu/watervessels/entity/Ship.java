package com.chsu.watervessels.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "SHIP")
@NoArgsConstructor
@AllArgsConstructor
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long shipId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COUNTRYID", nullable = false)
    private Country country;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "OWNERID", nullable = false)
    private ShipOwner shipOwner;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PORTID", nullable = false)
    private Port port;

    @ManyToMany(mappedBy = "favoriteShips", fetch = FetchType.EAGER)
    private List<ApplicationUser> shipLovers;

    private String name;

    private Long imo;

    private String callSign;

    private Date launchDate;

    private Double length;

    private Double width;

    private Double draft;

    private Double displacement;
}
