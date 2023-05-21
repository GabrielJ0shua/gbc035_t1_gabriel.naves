package nada;

/**
 *
 * @author Joshua
 */
public class Nada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Pessoa p = new Pessoa("Gabriel", "1234", "Santa Monica");
       Pessoa p = CriaPessoa.Cria("Gabriel", "1234", "Santa Monica");
       Pessoa a = CriaPessoa.Cria("Jose", "1234", "Santa Monica");
       
       System.out.println(p.toString());
       System.out.println(a.toString());
    }
    
}
