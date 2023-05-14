package br.com.edusync.api.services;

import br.com.edusync.api.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    // METODO QUE VAI ADICIONAR UM PROFUTO DENTRO DA MINHA A LISTA
    private List<Produto> produtos = new ArrayList<>();
    public void  adicionar(Produto produtoQueSeraSalvo){

        produtos.add(produtoQueSeraSalvo);
    }

    public List<Produto> ListarTudo() {

        return produtos;
    }


    //PEGA TODOS OS PRODUTOS E APLICA UM FILTRO (VAI SER CHAMADO DE P)
    public Optional<Produto> buscarPorCodigo(Integer codigo){
        return produtos.stream().filter(p-> codigo.equals(p.getCodigo())).findFirst();
    }
    public void remove(Integer codigo) {
        Optional<Produto> codigoPesquisa = buscarPorCodigo(codigo);
        if (codigoPesquisa != null){
            produtos.remove(codigo);
        }
        produtos.remove(codigoPesquisa);
    }
    public void atualizar(Integer codigo, Produto empresa) {
        Optional<Produto> empresaPesquisar = buscarPorCodigo(codigo);
    }
}
