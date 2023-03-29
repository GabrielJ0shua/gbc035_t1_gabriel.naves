package figurinhas;

/**
 *
 * @author Joshua
 * As figurinhas da copa do mundo são compostas pelas seguintes informações sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País.
 */
public class Main {

    public static void main(String[] args) {
        Figurinhas[] A = new Figurinhas[11];
        Selecao[] selecao = new Selecao[2];
        
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
        A[10] = new Figurinhas("Neymar", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        
        selecao[0] = new Selecao(A.clone(), "Jinx", 500);
        
        //________________________________________________________________
        
        A[0] = new Figurinhas("Rogerio Skylab", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[1] = new Figurinhas("Ygao 3k", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[2]  = new Figurinhas("Mano Brown", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[3] = new Figurinhas("Samira", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[4] = new Figurinhas("Leon", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[5]  = new Figurinhas("Git", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[6] = new Figurinhas("Kuntaquinte", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[7] = new Figurinhas("Mastodonte", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[8]  = new Figurinhas("jun ji to", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[9] = new Figurinhas("ET bilu", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        A[10] = new Figurinhas("Totoro", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        
        selecao[1] = new Selecao(A.clone(), "Caitlyn", 458);
        
        for(Selecao i : selecao) System.out.println(i.toString());
    }
    
}
