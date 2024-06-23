package com.cjava.ejemplo.model.repositories;

import com.cjava.ejemplo.model.entities.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {
}
