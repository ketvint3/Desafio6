package SpringAvancado.com.Desafio6.controllers;

import SpringAvancado.com.Desafio6.models.ClinicaModel;
import SpringAvancado.com.Desafio6.services.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clinica")
public class ClinicaController {
    @Autowired
    private ClinicaService service;

    //LISTANDO...
    @GetMapping(value = "/listar")
    public ResponseEntity ListarPorCnpj(){
        return new ResponseEntity(service.Listar(), HttpStatus.OK);

    }
    //ADICIONANDO...
    @PostMapping(value = "/adicionar")
    public ResponseEntity novaClinica(@RequestBody ClinicaModel clinica) {
        service.adicionar(clinica);
        return new ResponseEntity(clinica, HttpStatus.CREATED);
    }
    //ALTERANDO...
    @PutMapping(value = "/alterar/{cnpj}")
    public ResponseEntity alterar (@PathVariable Integer cnpj,  @RequestBody ClinicaModel clinica){
        service.atualizar(cnpj, clinica);
        return new ResponseEntity<>(cnpj, HttpStatus.OK);

    }
    //DELETANDO...
    @DeleteMapping(value = "/deletar/{cnpj}")
    public ResponseEntity deletar (@PathVariable Integer cnpj){
        service.remove(cnpj);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
