/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer;

/**
 *
 * @author carled7
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Observador tabela = new Tabela();
        Observador porcentagem = new Porcentagem();
        Observador grafico = new Grafico();
        
        Observavel baseDeDados = new BaseDeDados(20, 16, 4);
        
        baseDeDados.adicionarObservador(tabela);
        tabela.imprimirDados();
        
        baseDeDados.adicionarObservador(porcentagem);
        porcentagem.imprimirDados();
        
        baseDeDados.adicionarObservador(grafico);
        grafico.imprimirDados();
    }
    
}
