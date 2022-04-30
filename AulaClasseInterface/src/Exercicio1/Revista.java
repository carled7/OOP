/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author carled7
 */
public class Revista implements Exemplares{
    
    private String nome;
    private String categoria;
    private String editora;
    private int ano;
    private int edicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria.equals("TI") || categoria.equals("ADM") || categoria.equals("EE")){
           this.categoria = categoria;
        }else{
            this.categoria = "Sem categoria";          
        }
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String realizarEmprestimo(int codigo) {
        if(codigo >= 1 && codigo <= 25){
            return "Prazo de devolução do livro: 15 dias";
        }else if(codigo >= 26 && codigo <= 40){
            return "Prazo de devolução do livro: 25 dias";
        }else{
            return "Indeterminado";
        }        
    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso) {
        
        String sufixo;
        
        if(atraso){
            sufixo = "Revista em Atraso";
        }else{
            sufixo = "";
        }
        
        if(codigo >= 1 && codigo <= 25){
            return "Valor do empréstimo do livro: R$10,00 | " + sufixo;
        }else if(codigo >= 26 && codigo <= 40){
            return "Valor do empréstimo do livro: R$15,00 | " + sufixo;
        }else{
            return "Indeterminado | " + sufixo;
        }
         
        
    }
    
    void mostraInformacoes(int codE, int codD, boolean atraso){
        System.out.println("-------------------------");
        System.out.println("Título: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Editora: " + editora);
        System.out.println("Ano: " + ano);
        System.out.println("Edicao: " + edicao);
        System.out.println("");
        System.out.println(realizarEmprestimo(codE));
        System.out.println(realizarDevolucao(codD, atraso));
    }
    
    
}
