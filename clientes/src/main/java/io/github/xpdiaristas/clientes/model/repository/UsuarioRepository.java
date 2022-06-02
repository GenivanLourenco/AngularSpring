package io.github.xpdiaristas.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.xpdiaristas.clientes.model.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername(String username);

    boolean existsByUsername(String username);
}
