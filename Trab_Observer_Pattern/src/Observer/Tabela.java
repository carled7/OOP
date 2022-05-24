/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author carled7
 */
public class Tabela extends Observador{
    
    @Override
    public void imprimirDados(){
        System.out.println("---------------------------");
        System.out.println("| VALORES");
        System.out.println("---------------------------");
        System.out.println("| VALOR A |       " + getValorA());
        System.out.println("---------------------------");
        System.out.println("| VALOR B |       " + getValorB());
        System.out.println("---------------------------");
        System.out.println("| VALOR C |       " + getValorC());
        System.out.println("---------------------------");
        
    }
    
}
