package lab3;

/**
 *
 * @author Joshua
 * # Ex03
 * - Faça um pequeno programa que utiliza o conceito de Composição
 *
 */
public class PedidoDeLivro {
    private Pedido pedido;
    private Livro livro;

    public PedidoDeLivro(Pedido pedido, Livro livro) {
        this.pedido = pedido;
        this.livro = livro;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
