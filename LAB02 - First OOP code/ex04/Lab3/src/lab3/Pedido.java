package lab3;

/**
 *
 * @author Joshua
 * # Ex01 
 *   - Faça um pequeno programa que utiliza o conceito de Associação
 *   
 *
 */
public class Pedido {
    
    private ItensDePedido[] itensDePedido;
    private Cliente Cliente;
    private String endereco, codigoDeVerificacao;

    public ItensDePedido[] getItensDePedido() {
        return itensDePedido;
    }

    public void setItensDePedido(ItensDePedido[] itensDePedido) {
        this.itensDePedido = itensDePedido;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoDeVerificacao() {
        return codigoDeVerificacao;
    }

    public void setCodigoDeVerificacao(String codigoDeVerificacao) {
        this.codigoDeVerificacao = codigoDeVerificacao;
    }
}
