/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author carled7
 */
public class Livro implements Exemplares{
    
    private String autor;
    private String editora;
    private String titulo;
    private int edicao;
    private int ISBN;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String realizarEmprestimo(int codigo) {
        if(codigo >= 1 && codigo <= 10){
            return "Prazo de devolução do livro: 10 dias";
        }else if(codigo >= 11 && codigo <= 20){
            return "Prazo de devolução do livro: 15 dias";
        }else{
            return "Prazo de devolução do livro: indeterminado";
        }
    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso) {
        
        String sufixo;
        
        if(atraso){
            sufixo = "Livro em Atraso";
        }else{
            sufixo = "";
        }
        
        if(codigo >= 1 && codigo <= 10){
            return "Valor do empréstimo do livro: R$10,00 | " + sufixo;
        }else if(codigo >= 11 && codigo <= 20){
            return "Valor do empréstimo do livro: R$15,00 | " + sufixo;
        }else{
            return "Valor do empréstimo do livro: R$50,00 | " + sufixo;
        }
        
        
    }
    
    void mostraInformacoes(int codE, int codD, boolean atraso){
        System.out.println("-------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Edicao: " + edicao);
        System.out.println("");
        System.out.println(realizarEmprestimo(codE));
        System.out.println(realizarDevolucao(codD, atraso));
    }
    
}
