package org.Proyecto.SprintBoot_Reserva.aplicacion.servicios;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Libro;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Reserva;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.Proyecto.SprintBoot_Reserva.dominio.repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaServicio {
    @Autowired
    private ReservaRepositorio reservaRepositorio;
    public List<Reserva> obtenerTodos(){
        return reservaRepositorio.findAll();
    }
    public Reserva realizarReserva(Libro libro, Usuario usuario){
        Reserva reserva = new Reserva();
        reserva.setLibro(libro);
        reserva.setUsuario(usuario);
        reserva.setFechaReserva(LocalDate.now());

        return reservaRepositorio.save(reserva);
    }
}