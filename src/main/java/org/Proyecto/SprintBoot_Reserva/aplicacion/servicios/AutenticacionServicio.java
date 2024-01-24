package org.Proyecto.SprintBoot_Reserva.aplicacion.servicios;


import org.Proyecto.SprintBoot_Reserva.aplicacion.excepcion.Excepciones;
import org.Proyecto.SprintBoot_Reserva.aplicacion.lasting.EMessage;
import org.Proyecto.SprintBoot_Reserva.aplicacion.mapper.UsuarioMapper;
import org.Proyecto.SprintBoot_Reserva.dominio.dto.AutenticacionDTO;
import org.Proyecto.SprintBoot_Reserva.dominio.dto.UsuarioDTO;
import org.Proyecto.SprintBoot_Reserva.dominio.entidades.Usuario;
import org.Proyecto.SprintBoot_Reserva.dominio.repositorio.UsuarioRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;




@Slf4j
@Service
public record AutenticacionServicio (UsuarioRepositorio usuarioRepositorio, JWTservicio jwtService,
 PasswordEncoder passwordEncoder, UsuarioMapper mapper, AuthenticationManager authenticationManager) {

public String register(UsuarioDTO userDto) throws Excepciones {
        try{
        Usuario user = mapper.toEntity(userDto);
        user.setPassword(passwordEncoder.encode(userDto.password()));
        usuarioRepositorio.save(user);
        return jwtService.generateToken((UserDetails) user);}
        catch (DataIntegrityViolationException e){
        throw new Excepciones(EMessage.USER_EXISTS);}
        }

public String authenticate(AutenticacionDTO authenticationDto) throws Excepciones {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
        authenticationDto.correo(), authenticationDto.password()));
        User user = usuarioRepositorio.findUserByEmail(authenticationDto.correo())
        .orElseThrow(() -> new Excepciones(EMessage.INVALID_CREDENTIALS));
        return jwtService.generateToken(user);
        }
}
