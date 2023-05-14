package com.lista2.exercicio1.services;

import com.lista2.exercicio1.models.Tarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefaQueSeraSalva) {
        tarefas.add(tarefaQueSeraSalva);

    }

    public List<Tarefa> ListarTudo() {
        return tarefas;
    }

    public Optional<Tarefa> buscarPorCodigo(Integer titulo) {
        return tarefas.stream().filter(t -> titulo .equals(t.getTitulo())).findFirst();

    }
}
