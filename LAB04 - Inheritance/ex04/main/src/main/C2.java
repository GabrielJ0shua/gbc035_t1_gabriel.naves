package main;

/**
 *
 * @author Joshua
 */
public class C2 extends C1{
    public String cep;
    private String latitude;
    protected String longitude;

    public C2() {
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(String cep, String latitude, String longitude, String pais, String estado, String referencia) {
        super(pais, estado, referencia);
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        System.out.println("Classe C2: chamada do construtor com parametros");
    }
    
    public String mostarAtributos(){
        return (this.getEstado() + " " + this.pais + " " + this.referencia + " " + this.cep + " " + this.latitude + " " + this.longitude);
    }
    
    public String getLatitude(){
        return this.latitude;
    }
    
    public String mostarAtributosSuper(){
       return super.mostarAtributos();
    }
}
