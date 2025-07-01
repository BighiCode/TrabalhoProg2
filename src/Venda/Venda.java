package Venda;
import Produto.*;
public class Venda {

    private Produto produto;
    private int QuantidadeVendida;


    public Venda(Produto produto, int QuantidadeVendida) {
        this.produto = produto;
        this.QuantidadeVendida = QuantidadeVendida;
    }

    public Venda() {}

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeVendida() {
        return QuantidadeVendida;
    }
    public void setQuantidadeVendida(int QuantidadeVendida) {
        this.QuantidadeVendida = QuantidadeVendida;
    }

    public double getValorTotalDaVenda() {
        return this.produto.getPreco() * this.QuantidadeVendida;
    }

    @Override
    public String toString() {
        return produto.toString() + "\nQuantidade Vendida: " + QuantidadeVendida;
    }
}
