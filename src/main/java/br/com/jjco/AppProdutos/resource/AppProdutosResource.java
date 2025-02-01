package br.com.jjco.AppProdutos.resource;

import br.com.jjco.AppProdutos.model.Produtos;
import br.com.jjco.AppProdutos.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api") //http://localhost:8080/api
public class AppProdutosResource {

    @Autowired //injeção de dependência
    private ProdutosRepository produtosRepository;

    @GetMapping("lista")
    public List<Produtos> listar(){
        List<Produtos> listProdutos = produtosRepository.findAll();
        return listProdutos;
    }

    @GetMapping
    public String getAppi(){
        return  "API Java funcionando 😎";
    }

    @GetMapping("getProduto")
    public Produtos getProduto(){
        Produtos produto = new Produtos();
        produto.setCodigoBarras("65478305564301");
        produto.setNome("Monitor Del 29p");
        produto.setPreco(1000.0);

        System.out.println(produto);

        return produto;
    }

    @GetMapping("getProdutos")
    public List<Produtos> getProdutos(){
        List<Produtos> listProdutos = new ArrayList<Produtos>();

        Produtos produto1 = new Produtos();
        produto1.setCodigoBarras("65478305564301");
        produto1.setNome("Monitor Del 29p");
        produto1.setPreco(1000.0);
        listProdutos.add(produto1);

        Produtos produto2 = new Produtos();
        produto2.setCodigoBarras("76839673076");
        produto2.setNome("HD 1tb Samsung SSD");
        produto2.setPreco(800.0);
        listProdutos.add(produto2);

        Produtos produto3 = new Produtos();
        produto3.setCodigoBarras("45216741490");
        produto3.setNome("Mouse Gamer Long Tech");
        produto3.setPreco(150.0);
        listProdutos.add(produto3);

        return listProdutos;
    }
}
