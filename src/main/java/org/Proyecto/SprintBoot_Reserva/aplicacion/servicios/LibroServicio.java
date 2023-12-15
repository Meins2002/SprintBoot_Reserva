package org.Proyecto.SprintBoot_Reserva.aplicacion.servicios;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Libro;
import org.Proyecto.SprintBoot_Reserva.dominio.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServicio {

    private final LibroRepositorio libroRepositorio;

    @Autowired
    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    public List<Libro> obtenerTodos() {
        return libroRepositorio.findAll();
    }

    public Optional<Libro> obtenerPorId(Long id) {
        return libroRepositorio.findById(id);
    }

    public Libro guardarLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    public void borrarLibro(Long id) {
        libroRepositorio.deleteById(id);
    }
}

