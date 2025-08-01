package com.primeira.api.animais;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepositorio extends JpaRepository <Animal, Long> {
}
