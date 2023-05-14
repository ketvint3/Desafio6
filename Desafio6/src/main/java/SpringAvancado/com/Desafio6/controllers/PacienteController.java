package SpringAvancado.com.Desafio6.controllers;

import SpringAvancado.com.Desafio6.models.PacienteModel;
import SpringAvancado.com.Desafio6.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {
    @Autowired
    private PacienteService service;

   //LISTANDO...
    @GetMapping(value = "/listar")
    public ResponseEntity ListarPorNomeDoAnimal(){
        return new ResponseEntity(service.Listar(),HttpStatus.OK);

    }
    //ADICIONANDO...
    @PostMapping(value = "/adicionar")
    public ResponseEntity novoPaciente(@RequestBody PacienteModel paciente) {
        service.adicionar(paciente);
        return new ResponseEntity(paciente, HttpStatus.CREATED);
    }
    //ALTERANDO...
    @PutMapping(value = "/alterar")
    public ResponseEntity alterar (@PathVariable Integer cpj, @RequestBody PacienteModel paciente){
       return new ResponseEntity<>(paciente, HttpStatus.OK);

    }
    //DELETANDO...
    @DeleteMapping(value = "/deletar/{agendamento}")
    public ResponseEntity deletar (@PathVariable Integer cpf){
        service.remove(cpf);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
