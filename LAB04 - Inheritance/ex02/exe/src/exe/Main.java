package exe;

/**
# Ex02
O conceito de herança (inheritance) em POO é muito utilizado para reaproveitamento de código.

- Modifique a classe Figurinha, transformando os atributos *private* para *protected*
- Modifique a classe FigurinhaExtra, eliminando todos os atributos e métodos reduntantes de Figurinha. Obtenha os valores desses atributos por herança utilizando a palavra chave *extends*, isto é: "public class FigurinhaExtra extends Figurinha {".
- Note que a herança irá trazer os atributos e os métodos para a classe FigurinhaExtra.
- Note que o método MostrarFigurinha() deve continuar em FigurinhaExtra, pois ele é diferente do método FigurinhaExtra() da classe Figurinha
- O construtor deve ser modificado, de forma a inicializar somente os atributos de FigurinhaExtra. Os atributos que são originais de classe Figurinha (chamada de superclasse ou classe mãe/pai) deverão ser inicializados por meio da chamada do construtor original de Figurinha. Isso é feito usando a palavra reservada *super*

Faça um programa principal que cria uma Figurinha e uma FigurinhaExtra, e mostre os dados das figurinhas criadas

 * 
 * 
 * 
 * @author Joshua
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        FigurinhaExtra[] B = new FigurinhaExtra[10];
        
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
        
        for(FigurinhaExtra i : B)
            if(i != null)
                System.out.println(i.toString());
    }
    
}
