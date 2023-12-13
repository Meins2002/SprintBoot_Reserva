package org.Proyecto.SprintBoot_Reserva.aplicacion.controller.health;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {

   @RequestMapping("/health/{name}")

    public String checkAPI(@PathVariable (value = "name")String name){

       return String.format("<h1>The API is working ok!</h1>");

   }
}
