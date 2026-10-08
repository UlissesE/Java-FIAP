package br.com.fiap.estoques.services;

import br.com.fiap.estoques.entities.Produto;
import br.com.fiap.estoques.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {this.produtoRepository = produtoRepository;}

    public void cadastrarProduto(Produto produto) {this.produtoRepository.save(produto);}

    public void atualizarProduto(Produto produto) {this.produtoRepository.save(produto);}

    public void removerProduto(Integer id) {this.produtoRepository.deleteById(id);}

    public Produto buscarProdutoPorId(Integer id) {return this.produtoRepository.findById(id).orElse(null);}

    public Iterable<Produto> buscarProdutosPorNome(String nome) {
        return this.produtoRepository.findByNomeContaining(nome);
    }

    public Iterable<Produto> buscarTodosProdutos() {return this.produtoRepository.findAll();}
}
