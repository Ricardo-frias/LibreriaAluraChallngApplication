package com.alura.libreria.modelos.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(@JsonAlias("results") List<DatosLibros> resultados
) {
    public List<DatosLibros> getResultadoLibros(){
    return resultados;
    }
}
