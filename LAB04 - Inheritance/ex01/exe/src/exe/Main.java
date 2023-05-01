package exe;

/**
 *# Ex01 

**não utilizar herança no ex01**

Relembre o exercício da prática anterior. Nele indicamos que as figurinhas da copa são compostas pelas seguintes informações sobre os jogadores: Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País. Todos criaram a classe Figurinha, que continha todas as informações das figurinhas. Modifique o exercício para que inclua um construtor que inicialize todos os atributos. Crie também na classe um métodos MostrarFigurinha(), que imprime na tela todos os dados da Figurinha.

Agora crie a classe para as figurinhas extras. Essas são bem mais raras e não fazem parte da coleção regular, sendo caracterizadas como uma coleção à parte. Além de todos os atributos das figurinhas regulares, as raras são divididas em duas categorias, "Legends" e "Rookies", e possuem quatro variações de cor: bordô, bronze, prata e ouro". Crie uma classe chamada FigurinhaExtra, que contenha todos atributos da classe Figurinha e acrescente os dois novos atributos. Utilize boas práticas de POO (atributos privados, métodos get/set), crie um construtor que inicializa todos os parâmetros e crie também o método MostrarFigurinha().

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas

 * 
 * 
 * 
 * @author Joshua
 * 
 */
public class Main {

    public static void main(String[] args) {
        Figurinhas[] A = new Figurinhas[21];
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
        A[10] = new Figurinhas("Neymar", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F);
        
        //________________________________________________________________

        B[0] = new FigurinhaExtra("Totoro", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Raro", "Ouro");
        B[1] = new FigurinhaExtra("Rogerio Skylab", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Omega raro", "Branco");
        B[2] = new FigurinhaExtra("Ygao 3k", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Comum", "Bronze");
        B[3]  = new FigurinhaExtra("Mano Brown", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Comum", "Bronze");
        B[4] = new FigurinhaExtra("Samira", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Comum", "Bronze");
        B[5]  = new FigurinhaExtra("Git", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Raro", "Ouro");
        B[6] = new FigurinhaExtra("Kuntaquinte", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Incomum", "Prata");
        B[7] = new FigurinhaExtra("Mastodonte", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Incomum", "Prata");
        B[8]  = new FigurinhaExtra("jun ji to", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Incomum", "Prata");
        B[9] = new FigurinhaExtra("ET bilu", "1/1/2000", "Brasil", "Atacante", 1.83F, 74F, "Omega raro", "Branco");
        
        for(Figurinhas i : A)
            if(i != null)
                System.out.println(i.toString());
        
        for(FigurinhaExtra i : B)
            if(i != null)
                System.out.println(i.toString());
    }
    
}
