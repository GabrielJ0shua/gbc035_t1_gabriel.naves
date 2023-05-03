package main;

/**
 *
 * @author Joshua
 */
public class Chefe extends Funcionario{
    private float predefinido, folhaDePagamento;
    
    public Chefe(String nome, String dataNascimento, float salario){
        super(nome, dataNascimento, salario);
    }

    public float getPredefinido() {
        return predefinido;
    }

    public void setPredefinido(float predefinido) {
        this.predefinido = predefinido;
    }
    
    public float calculaSalario(){
        this.folhaDePagamento = super.getSalario() + this.getPredefinido();
        return this.folhaDePagamento;
    }
}
