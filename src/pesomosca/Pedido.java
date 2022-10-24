package pesomosca;
/**
 *
 * @author Vinicius Corte
 */

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens = new ArrayList<Item>();
    
    public ArrayList<Item> getItens(){
        return this.itens;
    }
    public void addItemPedido(Item item){
        this.itens.add(item);
    }
    public void setItens(ArrayList<Item> item){
        this.itens = iitem;
    }
}
