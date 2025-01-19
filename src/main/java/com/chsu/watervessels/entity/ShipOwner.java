package com.chsu.watervessels.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "SHIPOWNER")
@NoArgsConstructor
@AllArgsConstructor
public class ShipOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    private String ownerName;

    @OneToMany(mappedBy = "shipOwner", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Ship> ships;
}
