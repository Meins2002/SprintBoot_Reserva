package org.Proyecto.SprintBoot_Reserva.dominio.repositorio;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Page<Usuario> findAll(Pageable pageable);
    Optional<User> findUserByEmail(String email);
}