package org.Proyecto.SprintBoot_Reserva.aplicacion.controller;

import org.Proyecto.SprintBoot_Reserva.aplicacion.servicios.UsuarioServicio;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioServicio.create(usuario);
    }

    @PutMapping("/{id}")
    public Usuario update(@PathVariable String id, @RequestBody Usuario usuario) {
        return usuarioServicio.update(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        usuarioServicio.delete(id);
    }

}
