package com.chsu.watervessels.mapper;

import com.chsu.watervessels.entity.Port;
import com.chsu.watervessels.entity.Ship;
import com.chsu.watervessels.pojo.request.CreatePortRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PojoToEntityMapper {

    PojoToEntityMapper INSTANCE = Mappers.getMapper(PojoToEntityMapper.class);

    Port createPortRequestToEntity(CreatePortRequest request);
}
