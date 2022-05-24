/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;


/**
 *
 * @author carled7
 */
public abstract class Observavel{
        
    public abstract void notificar();
    public abstract void removerObservador (Observador obs);
    public abstract void adicionarObservador (Observador obs);
    
}
