package handlers;

import models.Pedido;

public class QuantidadeItensHandler extends PedidoHandler{

    @Override
    public boolean handler(Pedido pedido) {
        if(pedido.quantidadeItens <= 0){
            System.out.println("Pedido não aceito: deve haver pelo menos 1 item.");
            return false;
        }
        return handlerNext(pedido);
    }
}
