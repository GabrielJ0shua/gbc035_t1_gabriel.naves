package lab3;

/**
 *
 * @author Joshua
 * # Ex01 
 *   - Faça um pequeno programa que utiliza o conceito de Associação
 *   
 *
 */
public class ItensDePedido {
    private String nomeDosProdutos;

    public ItensDePedido(String nomeDosPedidos){
        setNomeDosPedidos(nomeDosPedidos);
    }
    
    public void setNomeDosPedidos(String nomeDosPedidos){
        this.nomeDosProdutos = nomeDosPedidos;
    }
    
    public String getNomeDosPedidos(){
        return this.nomeDosProdutos;
    }
    
}
