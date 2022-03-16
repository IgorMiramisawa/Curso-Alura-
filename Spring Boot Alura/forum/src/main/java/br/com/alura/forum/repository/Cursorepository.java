package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

public interface Cursorepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);


}
