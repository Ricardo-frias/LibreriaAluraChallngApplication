package com.alura.libreria.repository;

import com.alura.libreria.modelos.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibrosRepository extends JpaRepository<Libros, Long> {

    boolean existsByTitulo(String titulo);

    Libros findByTituloContainsIgnoreCase(String titulo);

    List<Libros> findByIdioma(String idioma);
}
