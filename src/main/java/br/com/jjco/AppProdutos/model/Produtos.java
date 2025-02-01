package br.com.jjco.AppProdutos.model;

public class Produtos {
    private String codigoBarras;
    private String nome;
    private Double preco;

    public Produtos(){}

    Produtos(String codigoBarras, String nome, Double preco){
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {

        String retorno = "[" +
                "Nome: " + this.nome + ", " +
                "Código de barras: " + this.codigoBarras + ", " +
                "Preço: " + this.preco +
                "]";

        return retorno;
    }
}
