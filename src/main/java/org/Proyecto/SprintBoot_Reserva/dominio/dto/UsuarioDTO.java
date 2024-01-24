package org.Proyecto.SprintBoot_Reserva.dominio.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record UsuarioDTO (long id, String name, String correo,String password) {

}
