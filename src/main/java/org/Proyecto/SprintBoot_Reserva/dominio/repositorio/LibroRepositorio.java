package org.Proyecto.SprintBoot_Reserva.dominio.repositorio;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {

}
