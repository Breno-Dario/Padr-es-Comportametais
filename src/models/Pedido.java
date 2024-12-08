package models;

public class Pedido {
    public double valorTotal;
    public int quantidadeItens;

    public Pedido(double valorTotal, int quantidadeItens){
        this.valorTotal = valorTotal;
        this.quantidadeItens = quantidadeItens;
    }
}
