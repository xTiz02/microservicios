package com.cjava.ejemplo.service;

import com.cjava.ejemplo.model.entities.Curso;
import com.cjava.ejemplo.model.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public void registrarCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void actualizarCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void eliminarCurso(String id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public List<Curso> listarCurso() {
        return (List<Curso>)cursoRepository.findAll();
    }

    @Override
    public Curso buscarCurso(String id) {
        return cursoRepository.findById(id).orElse(null);
    }
}
