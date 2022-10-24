package pesomosca;

/**
 *
 * @author Vinicius Corte
 */

public class StatusItem {
    public enum Estado { CARRINHO, FECHADO, PAGO, ENVIADO, ENTREGUE };
    private Estado estado;
    private boolean podeCancelar;
    private boolean compraConcluida;
    
    public StatusItem(Estado estado, boolean podeCancelar, boolean compraConcluida){
        this.estado =  estado;
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;
    }
    public Estado getEstado(){
        return this.estado;
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public boolean getPodeCancelar(){
        return this.podeCancelar;
    }
    public void setPodeCancelar(boolean podeCancelar){
        this.podeCancelar = podeCancelar;
    }
    public boolean getCompraConcluida(){
        return this.compraConcluida;
    }
    public void setCompraConcluida(boolean compraConcluida){
        this.compraConcluida = compraConcluida;
    }
}
