/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaclasseinterface;

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
        
        Pedido pedido1 = new Pedido(new CalcularFreteExpresso());
        Pedido pedido2 = new Pedido(new CalcularFretePadrao());
        
        System.out.println("Frete expresso: " + pedido1.freteCalculado());
        System.out.println("Frete padrão: " + pedido2.freteCalculado());
    }
    
}
