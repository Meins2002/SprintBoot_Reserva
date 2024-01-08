package org.Proyecto.SprintBoot_Reserva.dominio.repositorio;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {
}
