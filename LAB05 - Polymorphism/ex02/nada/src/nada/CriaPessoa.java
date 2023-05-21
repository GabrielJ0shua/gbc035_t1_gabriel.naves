package nada;

/**
 *
 * @author Joshua
 */
public class CriaPessoa {
    public static Pessoa Cria(String nome, String cpf, String endereco){
        return new Pessoa(nome, cpf, endereco);
    }
}
