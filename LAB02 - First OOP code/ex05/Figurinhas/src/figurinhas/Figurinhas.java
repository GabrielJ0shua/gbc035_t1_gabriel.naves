package figurinhas;

/**
 *
 * @author Joshua
 */
public class Figurinhas {

    private String nomeDoJogador, dataDeNascimento, pais, posicao;
    private float altura, peso;

    public Figurinhas(String pais){
        setNomeDoJogador("Calango");
        setAltura(1.90F);
        setDataDeNascimento("1/1/2000");
        setPais(pais);
        setPeso(79F);
        setPosicao("Zagueiro");
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
    
    @Override
    public String toString() {
        return "Figurinhas{" + "nomeDoJogador=" + nomeDoJogador + ", dataDeNascimento=" + dataDeNascimento + ", pais=" + pais + ", posicao=" + posicao + ", altura=" + altura + ", peso=" + peso + '}';
    }
}
