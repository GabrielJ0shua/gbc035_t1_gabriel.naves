package exe;

/**
 *
 * @author Joshua
 */
public class Figurinhas{
    //Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País
    private String nomeDoJogador, dataDeNascimento, pais, posicao;
    private float altura, peso;
    
    public Figurinhas(String nomeDoJogador, String dataDeNascimento, String pais, String posicao, float altura, float peso){
        setNomeDoJogador(nomeDoJogador);
        setAltura(altura);
        setDataDeNascimento(dataDeNascimento);
        setPais(pais);
        setPeso(peso);
        setPosicao(posicao);
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String MostrarFigurinha() {
        return "Figurinhas{" + "nomeDoJogador=" + nomeDoJogador + ", dataDeNascimento=" + dataDeNascimento + ", pais=" + pais + ", posicao=" + posicao + ", altura=" + altura + ", peso=" + peso + '}';
    }
}
