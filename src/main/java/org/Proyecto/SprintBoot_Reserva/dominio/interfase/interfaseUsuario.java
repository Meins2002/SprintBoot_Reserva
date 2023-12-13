package org.Proyecto.SprintBoot_Reserva.dominio.interfase;

import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;



public interface interfaseUsuario {

    Usuario create(Usuario usuario);

    Usuario read(String id);

    Usuario update(Usuario usuario);

    void delete(String id);


}
