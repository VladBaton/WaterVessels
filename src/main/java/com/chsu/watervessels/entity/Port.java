package com.chsu.watervessels.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
@Data
@Table(name = "PORT")
@NoArgsConstructor
@AllArgsConstructor
public class Port {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long portId;

    @Column(unique = true)
    private String portName;

    @OneToMany(mappedBy = "port", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    List<Ship> ships;

    @ManyToOne
    @JoinColumn(name = "countryId", nullable = false)
    Country country;

}
