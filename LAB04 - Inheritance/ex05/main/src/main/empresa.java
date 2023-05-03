package main;
/**
 *
 * @author Joshua
 */
public class empresa {

    public static void main(String[] args) {
        Funcionario[] funcionarios;
        
        System.out.println("Quantos funcionarios existe: ");
        
        funcionarios = new Funcionario[20];
        
        funcionarios[0] = new Chefe("Geraldo", "10/01/1995", 5000F);
        ((Chefe) funcionarios[0]).setPredefinido(7000F);
        
        funcionarios[1] = new Vendedor("Jose", "10/01/1995", 1200F);
        funcionarios[2] = new Vendedor("Maria", "10/01/1995", 1200F);
        
        funcionarios[3] = new Operario("Chobon yo", "10/01/1995", 1200F);
        funcionarios[4] = new Operario("Hoshi", "10/01/1995", 1200F);
        funcionarios[5] = new Operario("Asus", "10/01/1995", 1200F);
        
        funcionarios[6] = new Horistas("Oracio", "10/01/1995", 1200F);
        funcionarios[7] = new Horistas("League of Legends", "10/01/1995", 1200F);
        funcionarios[8] = new Horistas("Ingrid", "10/01/1995", 1200F);
        
        funcionarios[9] = new Chefe("Helen", "01/01/1998", 7000F);
        
        funcionarios[10] = new Vendedor("Pedro", "10/01/1995", 1200F);
        funcionarios[11] = new Vendedor("Caio", "10/01/1995", 1200F);
        
        funcionarios[12] = new Operario("Gabriel", "10/01/1995", 1200F);
        funcionarios[13] = new Operario("João", "10/01/1995", 1200F);
        funcionarios[14] = new Operario("Ailton", "10/01/1995", 1200F);
        
        funcionarios[15] = new Horistas("Cora", "10/01/1995", 1200F);
        funcionarios[16] = new Horistas("Yuumi", "10/01/1995", 1200F);
        funcionarios[17] = new Horistas("Sona", "10/01/1995", 1200F);
        
        for(Funcionario i : funcionarios){
            if(i != null){
                System.out.println(i.toString());
                System.out.println(i.calculoDoSalario());
            }
        }
        
        for(Funcionario i : funcionarios)
            i = null;
        funcionarios = null;
    }
    
}
