package org.Proyecto.SprintBoot_Reserva.aplicacion.servicios;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.Proyecto.SprintBoot_Reserva.dominio.interfase.interfaseUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;


@Service
public class UsuarioServicio implements interfaseUsuario {

   private Map<String, Usuario> usuarios;
    @Autowired
   public UsuarioServicio(Map<String, Usuario> usuarios){
        this.usuarios =usuarios;
    }
    @Override
    public Usuario create(Usuario usuario) {
    usuarios.put(String.valueOf(usuario.getId()), usuario);
        return usuario;
    }

    @Override
    public Usuario read(String id) {
    return usuarios.get(id);
    }

    @Override
    public Usuario update(Usuario usuario) {
        usuarios.put(String.valueOf(usuario.getId()), usuario);
        return usuario;
    }

    @Override
    public void delete(String id) {
        usuarios.remove(id);
    }

}
