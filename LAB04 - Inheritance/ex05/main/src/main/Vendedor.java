package main;

/**
 *
 * @author Joshua
 */
public class Vendedor extends Funcionario{
    private float valorFixo, comissao, vendas, folhaDePagamento;
    
    public Vendedor(String nome, String dataNascimento, float salario){
        super(nome, dataNascimento, salario);
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissão(float comissão) {
        this.comissao = comissão;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    
    public float calculaSalario(){
        this.folhaDePagamento = super.getSalario() + this.getComissao() * this.getVendas();
        return this.folhaDePagamento;
    }
}
