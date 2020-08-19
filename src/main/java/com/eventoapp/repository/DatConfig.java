package com.eventoapp.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.models.Evento;

@Configuration
public interface DatConfig extends JpaRepository<Evento, Long>{
	Evento findByCodigo(long codigo);
}