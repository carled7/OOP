/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author carled7
 */
public abstract class Personalidade {
 
    public abstract String falar();
    
    public void acionaFalar(Personalidade obj, String titulo){
        System.out.println(titulo + ": " + obj.falar());
    }
}
