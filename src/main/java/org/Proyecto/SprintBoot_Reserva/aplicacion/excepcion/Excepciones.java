package org.Proyecto.SprintBoot_Reserva.aplicacion.excepcion;

import lombok.Getter;
import org.Proyecto.SprintBoot_Reserva.aplicacion.lasting.EMessage;
import org.springframework.http.HttpStatus;
@Getter
public class Excepciones extends Exception {
    private final HttpStatus status;
    private final String message;

    public Excepciones(EMessage eMessage) {
        this.status = eMessage.getStatus();
        this.message = eMessage.getMessage();
    }
}
