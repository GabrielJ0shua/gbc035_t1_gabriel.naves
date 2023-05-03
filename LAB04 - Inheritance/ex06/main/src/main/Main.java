package main;
import java.util.ArrayList;
/**
 *
 * @author Joshua
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
        
        ingressos.add(new Normal(100F));
        ingressos.add(new VIP(100F, 50F));
        ingressos.add(new CamaroteInferior("Casteli Master", "A10", "25", 150F, 100F));
        ingressos.add(new CamaroteSuperior("Casteli Master", "A10", "25", 150F, 100F,100F));
        
        System.out.println("Show do Jão sla o q");
        
        for(Ingresso i : ingressos){
            i.escreveValor();
            if(i instanceof CamaroteInferior){
                ((CamaroteInferior) i).ConsultaLocal();
            }
            else if(i instanceof CamaroteSuperior){
                ((CamaroteSuperior) i).ConsultaLocal();
            }
        }
          
    }
    
}
