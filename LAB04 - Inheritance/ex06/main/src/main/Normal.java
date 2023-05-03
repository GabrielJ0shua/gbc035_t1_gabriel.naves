package main;

/**
 *
 * @author Joshua
 */
public class Normal extends Ingresso{

    public Normal(float valor) {
        super(valor);
    }
    
    @Override
    public void escreveValor(){
        System.out.println("Ingresso Normal: " + this.getValor());
    }
}
