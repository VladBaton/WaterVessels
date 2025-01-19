package com.chsu.watervessels.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "PORT")
@NoArgsConstructor
@AllArgsConstructor
public class Port {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portId;

    private String portName;

    @OneToMany(mappedBy = "port", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Ship> ships;

    @ManyToOne
    @JoinColumn(name = "countryId", nullable = false)
    Country country;

}
