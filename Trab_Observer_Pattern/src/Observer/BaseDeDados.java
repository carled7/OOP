/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.*;

/**
 *
 * @author carled7
 */
public class BaseDeDados extends Observavel{
    
    private int valorA;
    private int valorB;
    private int valorC;
    
    List<Observador> observadores = new ArrayList();

    public BaseDeDados(int valorA, int valorB, int valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }
    

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.atualizar(valorA, valorB, valorC);
        }
    }

    @Override
    public void removerObservador(Observador obs) {
        
        if(observadores.contains(obs)){
            observadores.remove(obs);
        }
    }

    @Override
    public void adicionarObservador(Observador obs) {
        
        if(!observadores.contains(obs)){
           observadores.add(obs);
           notificar();
        }
    }
    
}
