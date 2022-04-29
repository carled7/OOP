/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeclasseabstrata;

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
        
        Pedido pedido1 = new Pedido(new CalculadoraFretePadrao());
        Pedido pedido2 = new Pedido(new CalculadoraFreteExpresso());
        
        System.out.println("Frete Padrão: " + pedido1.freteCalculado());
        System.out.println("Frete Expresso: " + pedido2.freteCalculado());
        
    }
    
}
