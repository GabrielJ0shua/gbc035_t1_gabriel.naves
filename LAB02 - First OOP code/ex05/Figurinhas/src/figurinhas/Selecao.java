package figurinhas;

/**
 *
 * @author Joshua
 */
public class Selecao {
    private Figurinhas[] time = null;
    private String nomeDoTecnico;
    private int numeroDeGolsDaSelecao;

    public Selecao( String nomeDoTecnico, int numeroDeGolsDaSelecao) {
        setNomeDoTecnico(nomeDoTecnico);
        setNumeroDeGolsDaSelecao(numeroDeGolsDaSelecao);
        this.time = new Figurinhas[11];
    }

    public int getNumeroDeGolsDaSelecao() {
        return numeroDeGolsDaSelecao;
    }

    public void setNumeroDeGolsDaSelecao(int numeroDeGolsDaSelecao) {
        this.numeroDeGolsDaSelecao = numeroDeGolsDaSelecao;
    }

    public Figurinhas[] getTime() {
        return time;
    }

    public void setTime(Figurinhas[] Time) {
        this.time = Time;
    }

    public String getNomeDoTecnico() {
        return nomeDoTecnico;
    }

    public void setNomeDoTecnico(String nomeDoTecnico) {
        this.nomeDoTecnico = nomeDoTecnico;
    }

    @Override
    public String toString() {
        return "Selecao{" + "Time=" + time[0].toString()+ time[1].toString()+ time[2].toString()+ time[3].toString()+time[4].toString()+ time[5].toString()+ time[6].toString()+ time[7].toString() + time[8].toString()+ time[9].toString()+ time[10].toString() + ", nomeDoTecnico=" + nomeDoTecnico + ", numeroDeGolsDaSelecao=" + numeroDeGolsDaSelecao + '}';
    }
    
    
}
