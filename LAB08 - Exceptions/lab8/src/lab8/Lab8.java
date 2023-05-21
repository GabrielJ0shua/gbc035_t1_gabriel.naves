package lab8;

/**
 *
 * @author Joshua
 */
public class Lab8 {

    public static void main(String[] args) {
        Funcionarios f = new Funcionarios("Gabriel", "123.456.789.10", 1000);
        
        System.out.println(f.toString());
        
        try{
            f.aumentaSalario(10.9F);
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
        
        System.out.println(f.toString());
        
        try{
            f.aumentaSalario(100);
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
        
        System.out.println(f.toString());
        
        try{
            f.aumentaSalario(-10.9F);
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
        
        System.out.println(f.toString());
    }
    
}
