
public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public void imprimirBasico(){
        System.out.printf("Apelido: %s \n", this.apelido);
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Email: %s \n", this.email);
        System.out.printf("Aniversario: %s \n", this.aniversario);
    }

    public abstract void imprimirContato();
}