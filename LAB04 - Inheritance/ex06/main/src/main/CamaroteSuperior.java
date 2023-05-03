package main;

/**
 *
 * @author Joshua
 */
public class CamaroteSuperior extends VIP{
    private String local, fileira, assento;
    private float valorAMais;

    public CamaroteSuperior(String local, String fileira, String assento, float valorAMais, float valorAdicional, float valor) {
        super(valorAdicional, valor);
        this.local = local;
        this.fileira = fileira;
        this.assento = assento;
        this.valorAMais = valorAMais;
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

    public float getValorAMais() {
        return valorAMais;
    }

    public void setValorAMais(float valorAMais) {
        this.valorAMais = valorAMais;
    }
    
    @Override
    public void escreveValor(){
        System.out.println(this.getValor() + this.getValorAdicional()+this.getValorAMais());
    }
    
    public void ConsultaLocal(){
        System.out.println("Camarote superior \nLocal: " + local + "\nFileira: " + fileira + "\nAssento: " + assento);
    }

    @Override
    public String toString() {
        return "CamaroteSuperior{" + "local=" + local + ", fileira=" + fileira + ", assento=" + assento + ", valorAMais=" + valorAMais + '}';
    }
}
