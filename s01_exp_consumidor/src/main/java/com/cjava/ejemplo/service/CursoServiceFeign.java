package com.cjava.ejemplo.service;

import com.cjava.ejemplo.model.Curso;
import com.cjava.ejemplo.wsclient.CursoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cursoServiceFeign")
public class CursoServiceFeign implements CursoService{

    @Autowired
    private CursoFeignClient cursoFeignClient;

    @Override
    public List<Curso> listar() {
        return cursoFeignClient.listar();
    }

    @Override
    public Curso buscar(String id) {
        return null;
    }

    @Override
    public void registrar(Curso curso) {

    }
}
