/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurinhas;

/**
 *
 * @author Joshua
 */
public class Selecao {
    private Figurinhas[] Time = new Figurinhas[11];
    private String nomeDoTecnico;
    private int numeroDeGolsDaSelecao;

    public int getNumeroDeGolsDaSelecao() {
        return numeroDeGolsDaSelecao;
    }

    public void setNumeroDeGolsDaSelecao(int numeroDeGolsDaSelecao) {
        this.numeroDeGolsDaSelecao = numeroDeGolsDaSelecao;
    }

    public Figurinhas[] getTime() {
        return Time;
    }

    public void setTime(Figurinhas[] Time) {
        this.Time = Time;
    }

    public String getNomeDoTecnico() {
        return nomeDoTecnico;
    }

    public void setNomeDoTecnico(String nomeDoTecnico) {
        this.nomeDoTecnico = nomeDoTecnico;
    }

    @Override
    public String toString() {
        return "Selecao{" + "Time=" + Time[0].toString()+ Time[1].toString()+ Time[2].toString()+ Time[3].toString()+Time[4].toString()+ Time[5].toString()+ Time[6].toString()+ Time[7].toString() + Time[8].toString()+ Time[9].toString()+ Time[10].toString() + ", nomeDoTecnico=" + nomeDoTecnico + ", numeroDeGolsDaSelecao=" + numeroDeGolsDaSelecao + '}';
    }
    
    
}
