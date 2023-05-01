package main;

/**
 *
 * @author Joshua
 */
public class Chefe extends Funcionario{
    private float salarioFixo, predefinido;
    
    public Chefe(String nome, String dataNascimento, float salario){
        super(nome, dataNascimento, salario);
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public float getPredefinido() {
        return predefinido;
    }

    public void setPredefinido(float predefinido) {
        this.predefinido = predefinido;
    }
    
    
}
