package com.projeto.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findById(Long id);
	
	Optional<Usuario> findByEmail(String email);
	
	Optional<Usuario> findByNome(String nome);

	//Optional<Usuario> findByEmailAndNome(String email, String nome);
	
	//Saber se existe o email informado na base de dados
	boolean existsByEmail(String email);
}
