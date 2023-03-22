package figurinha;

/**
 *
 * @author Joshua
 * As figurinhas da copa do mundo são compostas pelas seguintes informações sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País.
 */
public class Main {

    public static void main(String[] args) {
        Figurinhas A,B,C;
        
        A = new Figurinhas("Ronaldo", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        B = new Figurinhas("Neymar", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        C  = new Figurinhas("Socrates", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }
    
}
