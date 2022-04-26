/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author carled7
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Extrovertido e = new Extrovertido();
        e.acionaFalar(e, "Extrovertido");
        
        Introvertido i = new Introvertido();
        i.acionaFalar(i, "Introvertido");
        
        Otimista o = new Otimista();
        o.acionaFalar(o, "Otimista");
        
        Pessimista p = new Pessimista();
        p.acionaFalar(p, "Pessimista");
        
    }

}
