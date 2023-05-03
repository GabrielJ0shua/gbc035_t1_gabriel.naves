package main;

/**
 *
 * @author Joshua
 */
public class CamaroteInferior extends VIP{
    private String local, fileira, assento;

    public CamaroteInferior(String local, String fileira, String assento, float valorAdicional, float valor) {
        super(valorAdicional, valor);
        this.local = local;
        this.fileira = fileira;
        this.assento = assento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
    
    public void ConsultaLocal(){
        System.out.println("Camarote inferior \nLocal: " + local + "\nFileira: " + fileira + "\nAssento: " + assento);
    }

    @Override
    public String toString() {
        return "CamaroteInferior{" + "local=" + local + ", fileira=" + fileira + ", assento=" + assento + '}';
    }
    
    
}
