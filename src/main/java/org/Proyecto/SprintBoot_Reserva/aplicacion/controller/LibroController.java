package org.Proyecto.SprintBoot_Reserva.aplicacion.controller;


import org.Proyecto.SprintBoot_Reserva.aplicacion.servicios.LibroServicio;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    private final LibroServicio libroServicio;

    @Autowired
    public LibroController(LibroServicio libroServicio) {
        this.libroServicio = libroServicio;
    }

    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroServicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Libro> optionalLibroPorId(@PathVariable Long id) {
        return libroServicio.obtenerPorId(id);
    }

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroServicio.guardarLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void borrarLibro(@PathVariable Long id) {
        libroServicio.borrarLibro(id);
    }
}
