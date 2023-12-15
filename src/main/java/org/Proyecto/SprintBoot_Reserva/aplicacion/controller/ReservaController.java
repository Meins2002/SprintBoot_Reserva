package org.Proyecto.SprintBoot_Reserva.aplicacion.controller;


import org.Proyecto.SprintBoot_Reserva.aplicacion.servicios.ReservaServicio;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/reservas")
public class ReservaController {
    @Autowired
    private ReservaServicio reservaServicio;

    @GetMapping
    public List<Reserva> obtenerReserva(){
        return reservaServicio.obtenerTodos();
    }
    /*@PostMapping
    public Reserva realizarReserva(@RequestParam long idLibro,@RequestParam long idUsuario){
        Libro libro = libroServicio.obtenerPorId(idLibro);
        Usuario usuario = usuarioServicio.obtenerPorId(idUsuario);

        return reservaServicio.realizarReserva(libro,usuario);
    }*/
}
