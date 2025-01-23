package com.chsu.watervessels.mapper;

import com.chsu.watervessels.pojo.Port;
import com.chsu.watervessels.pojo.Ship;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EntityToPojoMapper {

    EntityToPojoMapper INSTANCE = Mappers.getMapper(EntityToPojoMapper.class);

    @Mapping(target = "countryName", expression = "java(ship.getCountry().getCountryName())")
    @Mapping(target = "shipOwner", expression = "java(ship.getShipOwner().getOwnerName())")
    @Mapping(target = "portName", expression = "java(ship.getPort().getPortName())")
    Ship shipToPojo(com.chsu.watervessels.entity.Ship ship);

    @Mapping(target = "countryName", expression = "java(port.getCountry().getCountryName())")
    @Mapping(target = "ships", expression = "java(java.util.Objects.isNull(port.getShips())? new java.util.ArrayList<>(): port.getShips().stream().map(this::shipToPojo).toList())")
    Port portToPojo(com.chsu.watervessels.entity.Port port);
}
