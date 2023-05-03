package main;

/**
 *
 * @author Joshua
 */
public class Operario extends Funcionario{
    private float valorPorProducao, quantidadeProduzida, folhaDePagamento;
    
    public Operario(String nome, String dataNascimento, float salario){
        super(nome, dataNascimento, salario);
    }

    public float getValorPorProducao() {
        return valorPorProducao;
    }

    public void setValorPorProducao(float valorPorProducao) {
        this.valorPorProducao = valorPorProducao;
    }

    public float getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(float quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }
    
    public float calculaSalario(){
        this.folhaDePagamento = super.getSalario() + this.getQuantidadeProduzida() * this.getValorPorProducao();
        return this.folhaDePagamento;
    }
}
