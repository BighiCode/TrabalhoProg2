package Produto;

public class Produto {

    protected String nome;
    protected String codigo;
    protected double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public Produto() {}


    @Override
    public String toString() {
        return "\nnome: " + this.nome + " codigo: " + this.codigo + " preco: " + this.preco;
    }

    public void setDescricao(String descricao) {
        this.codigo = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}

