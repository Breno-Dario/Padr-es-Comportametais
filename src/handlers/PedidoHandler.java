package handlers;

import models.Pedido;

public abstract class PedidoHandler {
    private PedidoHandler next;

    public PedidoHandler linkWith(PedidoHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handler(Pedido pedido);

    protected boolean handlerNext(Pedido pedido) {
        if (next == null) {
            return true;
        }
        return next.handler(pedido);
    }
}
