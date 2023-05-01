package lab3;

/**
 *
 * @author Joshua
 * # Ex01 
 *   - Faça um pequeno programa que utiliza o conceito de Associação
 *   
 *
 */
public class Cliente {
    private String nome, numero, cpf;

    public Cliente(String nome, String numero, String cpf) {
        this.nome = nome;
        this.numero = numero;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
