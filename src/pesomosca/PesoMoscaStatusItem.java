package pesomosca;

/**
 *
 * @author Vinicius Corte
 */

import java.util.HashMap;

import pesomosca.StatusItem.Estado;

public class PesoMoscaStatusItem {
    private static HashMap<StatusItem.Estado, StatusItem> HashPedidos = new HashMap<>();
    
    public PesoMoscaStatusItem(){
       this.HashPedidos.put(StatusItem.Estado.CARRINHO,new StatusItem(Estado.CARRINHO, true, false));
       this.HashPedidos.put(StatusItem.Estado.FECHADO,new StatusItem(Estado.FECHADO, true, false));
       this.HashPedidos.put(StatusItem.Estado.PAGO,new StatusItem(Estado.PAGO, true, true));
       this.HashPedidos.put(StatusItem.Estado.ENVIADO,new StatusItem(Estado.ENVIADO, false, true));
       this.HashPedidos.put(StatusItem.Estado.ENTREGUE,new StatusItem(Estado.ENTREGUE, false, true));

    }
    public static StatusItem get(Estado carrinho) {
        return HashPedidos.get(carrinho);
    }
}
