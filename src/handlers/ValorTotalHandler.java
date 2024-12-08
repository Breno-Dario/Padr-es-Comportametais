package handlers;

import models.Pedido;

public class ValorTotalHandler extends PedidoHandler {

    @Override
    public boolean handler(Pedido pedido) {
        if (pedido.valorTotal < 100){
            System.out.println("Pedido não aceito: O valor total deve ser no mínimo R$100.");
            return false;
        }
        return handlerNext(pedido);
    }
}
