package org.Proyecto.SprintBoot_Reserva.aplicacion.controller;

import org.Proyecto.SprintBoot_Reserva.aplicacion.servicios.UsuarioServicio;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioServicio usuarioServicio;

    @Autowired
    public UsuarioController(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioServicio.crear(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);

// Asegúrate de establecer el ID antes de actualizar
        return usuarioServicio.actualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioServicio.eliminar(id);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obtenerPorId(@PathVariable Long id) {
        return usuarioServicio.findById(id);
    }

    @GetMapping
    public List<Usuario> obtenerTodos() {
        return usuarioServicio.obtenerTodos();
    }
}