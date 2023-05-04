package main;

/**
 *
 * @author Joshua
 */
public class Funcionario{
    private String nome, dataNascimento;
    private float salario;
    
    public Funcionario(String nome, String dataNascimento, float salario){
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "funcionario{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", salario=" + salario + '}';
    }
    
    public float calculoDoSalario(){
        return this.salario;
    }
}
