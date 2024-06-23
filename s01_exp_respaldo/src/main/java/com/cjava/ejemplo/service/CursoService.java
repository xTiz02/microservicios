package com.cjava.ejemplo.service;

import com.cjava.ejemplo.model.entities.Curso;

import java.util.List;

public interface CursoService {
    public void registrarCurso(Curso curso);
    public void actualizarCurso(Curso curso);
    public void eliminarCurso(String id);
    public List<Curso> listarCurso();
    public Curso buscarCurso(String id);

}
