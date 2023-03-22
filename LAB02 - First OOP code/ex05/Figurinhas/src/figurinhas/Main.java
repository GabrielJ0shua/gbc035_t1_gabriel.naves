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
        
        A[0] = new Figurinhas("Brasil");
        A[1] = new Figurinhas("Brasil");
        A[2]  = new Figurinhas("Brasil");
        A[3] = new Figurinhas("Brasil");
        A[4] = new Figurinhas("Brasil");
        A[5]  = new Figurinhas("Brasil");
        A[6] = new Figurinhas("Brasil");
        A[7] = new Figurinhas("Brasil");
        A[8]  = new Figurinhas("Brasil");
        A[9] = new Figurinhas("Brasil");
        A[10] = new Figurinhas("Brasil");
        
        selecao[0] = new Selecao( "Jinx", 500);
        
        //________________________________________________________________
        
        A[0] = new Figurinhas("Brasil");
        A[1] = new Figurinhas("Brasil");
        A[2]  = new Figurinhas("Brasil");
        A[3] = new Figurinhas("Brasil");
        A[4] = new Figurinhas("Brasil");
        A[5]  = new Figurinhas("Brasil");
        A[6] = new Figurinhas("Brasil");
        A[7] = new Figurinhas("Brasil");
        A[8]  = new Figurinhas("Brasil");
        A[9] = new Figurinhas("Brasil");
        A[10] = new Figurinhas("Brasil");
        
        selecao[1] = new Selecao( "Caitlyn", 458);
        
        for(Selecao i : selecao) System.out.println(i.toString());
    }
    
}
