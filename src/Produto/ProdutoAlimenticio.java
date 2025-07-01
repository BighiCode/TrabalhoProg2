package Produto;

public class ProdutoAlimenticio extends Produto {
    private String validade;

    public ProdutoAlimenticio(String nome, String codigo, double preco, String validade) {
        super(nome, codigo, preco);
        this.validade = validade;
    }

    public String toString() {
        return super.toString() + " Validaede: " + this.validade;
    }


    public ProdutoAlimenticio() {}

    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }


}
