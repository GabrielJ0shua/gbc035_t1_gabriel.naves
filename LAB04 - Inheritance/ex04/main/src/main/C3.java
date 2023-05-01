package main;

/**
 *
 * @author Joshua
 */
public class C3 extends C2{
    public String siteWeb;
    private String servidor;
    protected String ip;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(String siteWeb, String servidor, String ip, String cep, String latitude, String longitude, String pais, String estado, String referencia) {
        super(cep, latitude, longitude, pais, estado, referencia);
        this.siteWeb = siteWeb;
        this.servidor = servidor;
        this.ip = ip;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }
    
    public String mostarAtributos(){
        return (this.getEstado() + " " + this.pais + " " + this.referencia + " " + this.cep + " " + this.getLatitude() + " " + this.longitude + " " + this.siteWeb + " " + this.servidor + " " + this.ip);
    }

    public String mostarAtributosSuper(){
       return super.mostarAtributos();
    }
    
}
