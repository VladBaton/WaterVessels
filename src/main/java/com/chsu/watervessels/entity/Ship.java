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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipId;

    @ManyToOne
    @JoinColumn(name = "COUNTRYID", nullable = false)
    private Country country;

    @ManyToOne
    @JoinColumn(name = "OWNERID", nullable = false)
    private ShipOwner shipOwner;

    @ManyToMany(mappedBy = "favoriteShips")
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
