/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author carled7
 */
public class Porcentagem extends Observador{
    
    @Override
    public void imprimirDados() {
        float soma = getValorA() + getValorB() + getValorC();
        
        System.out.println("---------------------------");
        System.out.println(" PORCENTAGEM");
        System.out.println("---------------------------");
        System.out.printf(" Valor A: %.2f%%\n", (getValorA()/soma)*100);
        System.out.printf(" Valor B: %.2f%%\n", (getValorB()/soma)*100);
        System.out.printf(" Valor C: %.2f%%\n", (getValorC()/soma)*100);
    }
    
}
