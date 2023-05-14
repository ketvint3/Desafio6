package SpringAvancado.com.Desafio6.controllers;

import SpringAvancado.com.Desafio6.models.VeterinarioModel;

import SpringAvancado.com.Desafio6.services.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/veterinario")
public class VeterinarioController {
    @Autowired
    private VeterinarioService service;

    //LISTANDO...
    @GetMapping(value = "/listar")
    public ResponseEntity ListarPorCrm(){
        return new ResponseEntity(service.Listar(), HttpStatus.OK);

    }
    //ADICIONANDO...
    @PostMapping(value = "/adicionar")
    public ResponseEntity novoVeterinario(@RequestBody VeterinarioModel veterinario) {
        service.adicionar(veterinario);
        return new ResponseEntity(veterinario, HttpStatus.CREATED);
    }
    //ALTERANDO...
    @PutMapping(value = "/alterar")
    public ResponseEntity alterar (@PathVariable Integer crm, @RequestBody VeterinarioModel veterinario){
        return new ResponseEntity<>(crm, HttpStatus.OK);

    }
    //DELETANDO...
    @DeleteMapping(value = "/deletar/{crm}")
    public ResponseEntity deletar (@PathVariable Integer crm){
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
