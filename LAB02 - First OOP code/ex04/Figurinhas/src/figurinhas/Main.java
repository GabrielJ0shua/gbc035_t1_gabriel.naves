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
        
        A[0] = new Figurinhas();
        A[1] = new Figurinhas();
        A[2]  = new Figurinhas();
        A[3] = new Figurinhas();
        A[4] = new Figurinhas();
        A[5]  = new Figurinhas();
        A[6] = new Figurinhas();
        A[7] = new Figurinhas();
        A[8]  = new Figurinhas();
        A[9] = new Figurinhas();
        A[10] = new Figurinhas();
        
        selecao[0] = new Selecao();
        
        //________________________________________________________________
        
        A[0] = new Figurinhas();
        A[1] = new Figurinhas();
        A[2]  = new Figurinhas();
        A[3] = new Figurinhas();
        A[4] = new Figurinhas();
        A[5]  = new Figurinhas();
        A[6] = new Figurinhas();
        A[7] = new Figurinhas();
        A[8]  = new Figurinhas();
        A[9] = new Figurinhas();
        A[10] = new Figurinhas();
        
        selecao[1] = new Selecao();
        
        for(Selecao i : selecao) System.out.println(i.toString());
    }
    
}
