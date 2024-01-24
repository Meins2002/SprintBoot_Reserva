package org.Proyecto.SprintBoot_Reserva.aplicacion.controller;

import lombok.extern.slf4j.Slf4j;
import org.Proyecto.SprintBoot_Reserva.aplicacion.excepcion.Excepciones;
import org.Proyecto.SprintBoot_Reserva.dominio.dto.AutenticacionDTO;
import org.Proyecto.SprintBoot_Reserva.dominio.dto.UsuarioDTO;
import org.Proyecto.SprintBoot_Reserva.aplicacion.servicios.AutenticacionServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
public record AutenticacionController   (AutenticacionServicio autenticacionServicio) {

@PostMapping("/register")
public ResponseEntity<?> register(@RequestBody UsuarioDTO userDto) throws Excepciones {
        String token = autenticacionServicio.register(userDto);
        return new ResponseEntity<>(token, HttpStatus.CREATED);
        }

@PostMapping("/authenticate")
public ResponseEntity<?> authenticate(@RequestBody AutenticacionDTO authenticationDto) throws Excepciones {

        String token = autenticacionServicio.authenticate(authenticationDto);
        return new ResponseEntity<>(token, HttpStatus.OK);
        }

        }
