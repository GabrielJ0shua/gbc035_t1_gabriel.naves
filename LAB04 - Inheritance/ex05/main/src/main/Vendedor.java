package main;

/**
 *
 * @author Joshua
 */
public class Vendedor extends Funcionario{
    private float valorFixo, comissão, vendas;
    
    public Vendedor(String nome, String dataNascimento, float salario){
        super(nome, dataNascimento, salario);
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }

    public float getComissão() {
        return comissão;
    }

    public void setComissão(float comissão) {
        this.comissão = comissão;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
}
