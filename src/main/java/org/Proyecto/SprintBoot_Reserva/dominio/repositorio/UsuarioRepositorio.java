package org.Proyecto.SprintBoot_Reserva.dominio.repositorio;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}