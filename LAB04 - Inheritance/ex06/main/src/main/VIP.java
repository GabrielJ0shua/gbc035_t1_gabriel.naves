package main;

public class VIP extends Ingresso{
    private float valorAdicional;

    public VIP(float valorAdicional, float valor) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public void escreveValor(){
        System.out.println("Ingresso VIP: " + this.getValor() + this.getValorAdicional());
    }
}
