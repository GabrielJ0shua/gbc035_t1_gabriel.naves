/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
*  # Ex02
 * - Faça um pequeno programa que utiliza o conceito de Agregação
 *
 * @author Joshua
 */
public class Livro {
    private String nome, ISBN, autor;
    
    public Livro(String nome, String ISBN, String autor){
        setNome(nome);
        setISBN(ISBN);
        setAutor(autor);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getISBN(){
        return this.ISBN;
    }
    
    public String getAutor(){
        return this.autor;
    }
}
