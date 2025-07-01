package Produto;

public class ProdutoEletronico extends Produto {
    private int garantia;

    public ProdutoEletronico(String nome, String codigo, double preco, int garantia) {
        super(nome, codigo, preco);
        this.garantia = garantia;
    }

    public ProdutoEletronico() {}


    @Override
    public String toString() {
        return super.toString() +" Garantia: " + this.garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

}
