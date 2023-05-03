package main;

/**
 *
 * @author Joshua
 */
public class Horistas extends Funcionario{
    private float  valorPorHora, totalDeHorasTrabalhadas, folhaDePagamento;
    
    public Horistas(String nome, String dataNascimento, float salario){
        super(nome, dataNascimento, salario);
    }

    public float getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public float getTotalDeHorasTrabalhadas() {
        return totalDeHorasTrabalhadas;
    }

    public void setTotalDeHorasTrabalhadas(float totalDeHorasTrabalhadas) {
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
    }
    
    public float calculaSalario(){
        this.folhaDePagamento = super.getSalario() + this.getValorPorHora() * this.getTotalDeHorasTrabalhadas();
        return this.folhaDePagamento;
    }
}
