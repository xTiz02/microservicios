package com.cjava.ejemplo.ws;

import com.cjava.ejemplo.model.Curso;
import com.cjava.ejemplo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CursoRestCotroller {


    @Autowired
    private CircuitBreakerFactory cbFactory;
    @Autowired
    @Qualifier("cursoService")
    //@Qualifier("cursoService")
    private CursoService cursoService;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/cursos")
    public List<Curso> getCursos(){
        //return cursoService.listar();
        return cbFactory.create("cbPrueba1")
                .run(()-> cursoService.listar(), e -> metodoAlternativo(e));
    }


    public List<Curso> metodoAlternativo(Throwable e) {

        List<Curso> lista = new ArrayList<>();
        lista.add(new Curso("1","Programmer 17", 10));
        lista.add(new Curso("2","Developer 3.0", 10));

        //String url ="http://cjava-cursos-respaldo/cursos";
        //return restTemplate.getForObject(url,List.class);
        return lista;
    }
}
