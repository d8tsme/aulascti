package com.primeira.api.filmes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepositorio extends JpaRepository<Filme, Long> {
}
