package pesomosca;

/**
 *
 * @author Vinicius Corte
 */

import java.util.ArrayList;

public class PesoMosca {
    public static void main(String[] args) {            
        ArrayList<Pedido> listaPedidos = new ArrayList();        
        for(int i=0; i< 200000; i++){             
            Pedido pedido = new Pedido();
            Item item1 = new Item();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis");                        
            item1.setStatus(PesoMoscaStatusItem.get(StatusItem.Estado.CARRINHO));
            Item item2 = new Item();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            item2.setStatus(PesoMoscaStatusItem.get(StatusItem.Estado.CARRINHO));
            Item item3 = new Item();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            item3.setStatus(PesoMoscaStatusItem.get(StatusItem.Estado.CARRINHO));                       
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);          
            listaPedidos.add(pedido);                         
        }
        //calcula a quantidade de memória consumida pelo programa java
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(listaPedidos.size());
    }
    /* Desempenho
     * KB: 35948.65625
     * 200000
     */
}
