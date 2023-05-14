package br.com.edusync.api.controllrs;

import br.com.edusync.api.models.Produto;
import br.com.edusync.api.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


// CRUD - (CREATE,READ,UPDATE,DELETE)
//CREATE = POST
//READ = GET
//UPDATE = PUT
//DELETE = DELETE

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired // @Autowired faz tudo automatico (ex: se estiver nulo ele resolve, cria variavel)
    private ProdutoService service;


    // INCLUIR PRODUTOS
    @PostMapping(value = "/novo")

    // ResponseEntity É UMA ENTIDADE DE RESPOSTA
    public ResponseEntity novoProduto(@RequestBody Produto produto){
        service.adicionar(produto);
        return new ResponseEntity(produto, HttpStatus.CREATED);
    }

    // LISTAR PRODUTOS
    @GetMapping
    public ResponseEntity ListarTodos(){

        return new ResponseEntity(service.ListarTudo(), HttpStatus.OK);
    }

    // OS @GETMAPPING NAO PODEM TER OS MESMOS MAPEAMENTOS (NAO PODE TER DOIS @GETMAPPING IGUAIS)
    // ASSISTIR 12:34 DA  CRU= AULA LISTANDO REGISTROS VIA API (PRA ENTENDER O @PATHVARIABLE)
    // PESQUISAR UM UNICO PRODUTO DE CADA VEZ
    @GetMapping(value = "/{codigo}")
    public ResponseEntity ListarPorCodigo(@PathVariable Integer codigo) {

        Optional<Produto> P = service.buscarPorCodigo(codigo);

        if(P == null){
            return new ResponseEntity<>("codigo inválido", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity( P , HttpStatus.OK);

    }
    @PutMapping(value = "/alterar/{codigo}")
    public ResponseEntity alterar(@PathVariable Integer codigo , @RequestBody Produto empresa){
        service.atualizar(codigo, empresa);
        return new ResponseEntity(empresa, HttpStatus.OK);
    }
    @DeleteMapping(value = "/deletar/{codigo}")
    public ResponseEntity deletar(@PathVariable Integer codigo){
        service.remove(codigo);
        return new ResponseEntity(HttpStatus.OK);
    }
}
