package exe;

/**
 *
 * @author Joshua
 */
public class FigurinhaExtra  extends Figurinhas{
    //Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País
    private String raridade, cor;
    
    public FigurinhaExtra(Figurinhas figurinha, String raridade, String cor){
        super( figurinha.getNomeDoJogador(),  figurinha.getDataDeNascimento(),  figurinha.getPais(),  figurinha.getPosicao(),  figurinha.getAltura(),  figurinha.getPeso());
        setRaridade(raridade);
        setCor(cor);
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "FigurinhaExtra{" + "nomeDoJogador=" + super.getNomeDoJogador() + ", dataDeNascimento=" + super.getDataDeNascimento() + ", pais=" + super.getPais() + ", posicao=" + super.getPosicao() + ", raridade=" + raridade + ", cor=" + cor + ", altura=" + super.getAltura() + ", peso=" + super.getPeso() + '}';
    }
}
