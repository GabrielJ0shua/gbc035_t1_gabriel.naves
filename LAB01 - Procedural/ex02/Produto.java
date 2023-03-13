public class Produto {
    
    private String nome;
    private float preco;
    private int qtd_estoque;

    public Produto(String nome, float preco, int qtd_estoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQtd_estoque(qtd_estoque);
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
