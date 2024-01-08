package org.Proyecto.SprintBoot_Reserva.aplicacion.servicios;


import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
        import org.Proyecto.SprintBoot_Reserva.dominio.repositorio.UsuarioRepositorio;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;

@Service
public class UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    @Autowired
    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public Usuario crear(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public Usuario actualizar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public void eliminar(Long id) {
        usuarioRepositorio.deleteById(id);
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepositorio.findById(id);
    }

    public List<Usuario> obtenerTodos() {
        return usuarioRepositorio.findAll();
    }
}