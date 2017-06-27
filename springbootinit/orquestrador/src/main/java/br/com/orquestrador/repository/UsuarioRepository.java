package br.com.orquestrador.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.meusprocessos.entidades.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
