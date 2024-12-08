import handlers.*;
import models.Pedido;


public class Test {
    public static void main(String[] args) {

        PedidoHandler handler = new ValorTotalHandler();
        handler.linkWith(new QuantidadeItensHandler());

        Pedido pedido1 = new Pedido(20.0, 2);
        if(handler.handler(pedido1)) {
            System.out.println("Pedido Aprovado!");
        }

        Pedido pedido2 = new Pedido(100.0, 2);
        if(handler.handler(pedido2)) {
            System.out.println("Pedido Aprovado!");
        }

        Pedido pedido3 = new Pedido(10.0, 2);
        if(handler.handler(pedido3)) {
            System.out.println("Pedido Aprovado!");
        }
        Pedido pedido4 = new Pedido(100.0, 2);
        if (handler.handler(pedido4)) {
            System.out.println("Pedido Aprovado!");
        }
    }
}
