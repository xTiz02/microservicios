package com.cjava.ejemplo.ws;

import com.cjava.ejemplo.model.entities.Curso;
import com.cjava.ejemplo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class CursoRestController {

    @Autowired
    CursoService cursoService;

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()
    {
        return "{ \"todoOk\" : true }";
    }

    @GetMapping("/cursos")
    public List<Curso> getCursos(){
        List<Curso> lista = cursoService.listarCurso();
        return lista;
    }

    @GetMapping("/curso/{id}")
    public Curso getCurso(@PathVariable String id) {
        Curso curso = cursoService.buscarCurso(id);
        return curso;
    }

    @PostMapping("/curso")
    public Curso addCurso(@RequestBody Curso newCurso){
        String id = String.valueOf(new Random().nextInt());
        Curso curso = new Curso(id, newCurso.getNombre(), newCurso.getCreditos());
        cursoService.registrarCurso(curso);
        return curso;
    }


}
