package figurinhas;

/**
 *
 * @author Joshua
 */
public class Figurinhas {
    //Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País
    String nomeDoJogador, dataDeNascimento, pais, posicao;
    float altura, peso;
    
    public void setInfoInit(String nomeDoJogador, String dataDeNascimento, String pais, String posicao, float altura, float peso){
        this.nomeDoJogador = nomeDoJogador;
        this.dataDeNascimento = dataDeNascimento;
        this.pais = pais;
        this.posicao = posicao;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Figurinhas{" + "nomeDoJogador=" + nomeDoJogador + ", dataDeNascimento=" + dataDeNascimento + ", pais=" + pais + ", posicao=" + posicao + ", altura=" + altura + ", peso=" + peso + '}';
    }
}
