public class Amigo extends Contato{
    protected int grau;

    public Amigo(String apelido, String nome, String email, String aniversario,int grau){
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }
    public void imprimirContato(){
        this.imprimirBasico();
        if(grau == 1)
            System.out.println("Grau de amizade: Melhor amigo");
        else if(grau == 2)
            System.out.println("Grau de amizade: Amigo");
        else if(grau == 3)
            System.out.println("Grau de amizade: Conhecido");
        else
            System.out.println("Grau de amizade desconhecido");
    }
}