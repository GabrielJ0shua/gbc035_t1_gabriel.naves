package lab3;

/**
 *  # Ex02
 * - Faça um pequeno programa que utiliza o conceito de Agregação
 *
 * @author Joshua
 */
public class Biblioteca {
    private Livro[] livros;
    
    public Biblioteca(Livro[] livros){
        setLivros(livros);
    }
    
    public void setLivros(Livro[] livros){
        this.livros = livros;
    }
    
    public Livro[] getLivros(){
        return livros;
    }
}
