package org.Proyecto.SprintBoot_Reserva.aplicacion.mapper;

import org.Proyecto.SprintBoot_Reserva.dominio.dto.UsuarioDTO;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.mapstruct.Mapper;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Mapper(componentModel = "spring")

public interface UsuarioMapper {
    Usuario toEntity(UsuarioDTO dto);

    UsuarioDTO toDto(Usuario entity);

    List<Usuario> toEntityList(List<UsuarioDTO> dtoList);

    List<UsuarioDTO> toDtoList(List<User> entityList);
}
