package br.com.alura.forum.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
@RequestMapping("topicos")
//Usar @RestController indica que é uma  é indicar que todos os metodos vai ter o @ResponseBody 

public class TopicoController {
	
	
	
	// @ResponseBody
	public  List<TopicoDto> getAllTopicos () {
		Topico topico = new Topico("Duvida" , "Mensagem" , new Curso ("Spring Boot" , "Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico , topico , topico));
		
	}
	

}
