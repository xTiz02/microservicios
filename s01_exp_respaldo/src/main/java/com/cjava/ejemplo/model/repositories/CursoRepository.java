package com.cjava.ejemplo.model.repositories;

import com.cjava.ejemplo.model.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, String> {
}
