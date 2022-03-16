package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.repository.UsuarioRepository;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {
	
	UsuarioRepository usuarioRepository;
	
	

}
