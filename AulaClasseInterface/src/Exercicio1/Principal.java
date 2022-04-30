/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author carled7
 */
public class Principal {
    
    public static void main(String[] args) {
    
        Livro livro = new Livro();
        
        livro.setAutor("Neil Gaiman");
        livro.setEdicao(5);
        livro.setEditora("Darkside");
        livro.setTitulo("Sandman");
        livro.setISBN(54869);
        livro.mostraInformacoes(10, 50, true);
        
        
        Livro livro2 = new Livro();
        
        livro2.setAutor("Andrej Sapkosvick");
        livro2.setEdicao(3);
        livro2.setEditora("Companhia das Letras");
        livro2.setTitulo("The Witcher");
        livro2.setISBN(15447);
        livro2.mostraInformacoes(23, 2, false);
        
        Revista revista = new Revista();
        
        revista.setNome("4 rodas");
        revista.setAno(2003);
        revista.setCategoria("Automóveis");
        revista.setEdicao(5);
        revista.setEditora("Abril");
        revista.mostraInformacoes(30, 30, true);
        
        Revista revista2 = new Revista();
        
        revista2.setNome("Java Magazine");
        revista2.setAno(2009);
        revista2.setCategoria("TI");
        revista2.setEdicao(2);
        revista2.setEditora("Abril");
        revista2.mostraInformacoes(3, 10, false);
        
    }
}
