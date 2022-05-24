/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author carled7
 */
public class Grafico extends Observador{

    @Override
    public void imprimirDados() {
        System.out.println("---------------------------");
        System.out.println(" Gráfico");
        System.out.println("---------------------------");
        System.out.printf(" Valor A: ");
        for (int i = 0; i < getValorA(); i++) {
            System.out.printf("□");
        }
        System.out.printf("\n Valor B: ");
        for (int i = 0; i < getValorB(); i++) {
            System.out.printf("□");
        }
        System.out.printf("\n Valor C: ");
        for (int i = 0; i < getValorC(); i++) {
            System.out.printf("□");
        }
        System.out.println("\n\n");


    }
    
}
