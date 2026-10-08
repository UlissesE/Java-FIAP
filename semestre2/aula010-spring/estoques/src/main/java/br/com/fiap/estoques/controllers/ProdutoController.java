package br.com.fiap.estoques.controllers;

import br.com.fiap.estoques.entities.Produto;
import br.com.fiap.estoques.services.ProdutoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public void cadastrarProduto(@RequestBody Produto produto) {
        produtoService.cadastrarProduto(produto);
    }

    @PutMapping
    public void atualizarProduto(@RequestBody Produto produto) {
        produtoService.atualizarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void removerProduto(@PathVariable Integer id) {
        produtoService.removerProduto(id);
    }

    @GetMapping("/{id}")
    public Produto buscarProdutoPorId(@PathVariable Integer id) {
        return produtoService.buscarProdutoPorId(id);
    }

    public Iterable<Produto> buscarProdutos(@RequestParam(required = false) String nome) {
        if (nome != null && !nome.isEmpty()) {
            return produtoService.buscarProdutosPorNome(nome);
        }
        return produtoService.buscarTodosProdutos();
    }
}
