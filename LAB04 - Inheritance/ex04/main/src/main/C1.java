package main;

/**
 *
 * @author Joshua
 */
public class C1 {
    public String pais;
    private String estado;
    protected String referencia;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(String pais, String estado, String referencia) {
        this.pais = pais;
        this.estado = estado;
        this.referencia = referencia;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }
    
    public String mostarAtributos(){
        return (this.estado + " " + this.pais + " " + this.referencia);
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String mostarAtributosSuper(){
       return mostarAtributos();
    }
}
