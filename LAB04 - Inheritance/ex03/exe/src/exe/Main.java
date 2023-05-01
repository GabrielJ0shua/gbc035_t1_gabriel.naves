package exe;

/**
# Ex03
- Modifique a classe Figurinha, transformando os atributos *protected* para *private*
- Entenda o erro que ocorre em MostrarFigurinha() da classe FigurinhaExtra com essa modificação
- Modifique o método MostrarFigurinha() para ser possível vizualizar os atributos privados de Figurinha. Para isso use *super.MostrarFigurinha()*
- Crie um novo construtor, que terá como parâmetro uma Figurinha (normal) e os dois atributo adicionais de FigurinhaExtra. Esse construtor permitirá criar um novo objeto de FigurinhaExtra a partir de um objeto já existente de Figurinha (ou seja, uma figurinha extra de um jogador que já foi criado)

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas

 * 
 * 
 * 
 * @author Joshua
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        Figurinhas[] A = new Figurinhas[10];
        FigurinhaExtra[] B = new FigurinhaExtra[10];
        
        A[0] = new Figurinhas("Ronaldo", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[1] = new Figurinhas("Neymar", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[2]  = new Figurinhas("Socrates", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[3] = new Figurinhas("Ronaldo", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[4] = new Figurinhas("Neymar", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[5]  = new Figurinhas("Socrates", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[6] = new Figurinhas("Ronaldo", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[7] = new Figurinhas("Neymar", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[8]  = new Figurinhas("Socrates", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[9] = new Figurinhas("Ronaldo", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        
        
        B[0] = new FigurinhaExtra( A[0], "Raro", "Ouro");
        B[1] = new FigurinhaExtra( A[1], "Omega raro", "Branco");
        B[2] = new FigurinhaExtra( A[2], "Comum", "Bronze");
        B[3]  = new FigurinhaExtra( A[3], "Comum", "Bronze");
        B[4] = new FigurinhaExtra( A[4],"Comum", "Bronze");
        B[5]  = new FigurinhaExtra( A[5], "Raro", "Ouro");
        B[6] = new FigurinhaExtra( A[6], "Incomum", "Prata");
        B[7] = new FigurinhaExtra( A[7], "Incomum", "Prata");
        B[8]  = new FigurinhaExtra( A[8], "Incomum", "Prata");
        B[9] = new FigurinhaExtra( A[9], "Omega raro", "Branco");
        
        for(FigurinhaExtra i : B)
            if(i != null)
                System.out.println(i.toString());
    }
    
}
