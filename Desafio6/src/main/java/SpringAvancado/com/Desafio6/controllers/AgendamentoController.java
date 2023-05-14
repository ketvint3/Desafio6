package SpringAvancado.com.Desafio6.controllers;

import SpringAvancado.com.Desafio6.models.AgendamentoModel;
import SpringAvancado.com.Desafio6.models.VeterinarioModel;
import SpringAvancado.com.Desafio6.services.AgendamentoService;
import SpringAvancado.com.Desafio6.services.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/agendamento")
public class AgendamentoController {
    @Autowired
    private AgendamentoService service;

    //LISTANDO...
    @GetMapping(value = "/listar")
    public ResponseEntity ListarPorId(){
        return new ResponseEntity(service.Listar(), HttpStatus.OK);

    }
    //ADICIONANDO...
    @PostMapping(value = "/adicionar")
    public ResponseEntity novoId(@RequestBody AgendamentoModel agendamento, @RequestParam Integer crm,
                                 @RequestParam Integer cpf){

    // 1-achar o paciente e o veterinario
        //2- pegar paciente e veterinario e adicionar no agendamento

        service.adicionar(agendamento);
        return new ResponseEntity(agendamento, HttpStatus.CREATED);
    }
    //ALTERANDO...
    @PutMapping(value = "/alterar/agendamento")
    public ResponseEntity alterar (@PathVariable Integer Id, @RequestBody AgendamentoModel agendamento){
        return new ResponseEntity<>(Id, HttpStatus.OK);

    }
    //DELETANDO...
    @DeleteMapping(value = "/deletar/{Id}")
    public ResponseEntity deletar (@PathVariable String Id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
