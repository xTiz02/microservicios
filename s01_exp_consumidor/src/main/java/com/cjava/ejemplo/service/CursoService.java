package com.cjava.ejemplo.service;

import com.cjava.ejemplo.model.Curso;

import java.util.List;

public interface CursoService {

    public List<Curso> listar();
    public Curso buscar(String id);
    public void registrar(Curso curso);

}
