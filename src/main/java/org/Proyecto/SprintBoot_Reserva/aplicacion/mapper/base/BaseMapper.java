package org.Proyecto.SprintBoot_Reserva.aplicacion.mapper.base;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BaseMapper {
    BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);
}
