package com.lista2.exercicio1.controllrs;

import com.lista2.exercicio1.models.Tarefa;
import com.lista2.exercicio1.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TarefaController {

    @Autowired
    private TarefaService service;

    @PostMapping(value = "/tarefa/nova")
    public ResponseEntity novaTarefa(@RequestBody Tarefa tarefa) {
        service.adicionar(tarefa);
        return new ResponseEntity<>(tarefa, HttpStatus.CREATED);

    }

    @GetMapping(value = "/tarefa")
    public ResponseEntity ListarTodos() {
        return new ResponseEntity(service.ListarTudo(), HttpStatus.OK);
    }


    @GetMapping(value = "/tarefa/{titulo}")
    public ResponseEntity ListarPorTitulo(@PathVariable Integer titulo) {

        Optional<Tarefa> T = service.buscarPorCodigo(titulo);

        if (T == null) {
            return new ResponseEntity<>("codigo inválido", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(T, HttpStatus.OK);


    }
}
