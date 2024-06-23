package com.cjava.ejemplo.model.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cursos")
public record Curso(String id, String nombre, int creditos) {
}
