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
    
    private float valorA;
    private float valorB;
    private float valorC;
    
    private List<Observador> observadores = new ArrayList();
    
    @Override
    public void atualizar(float a, float b, float c) {
        this.valorA = a;
        this.valorB = b;
        this.valorC = c;
        
        notificar();
    }
    
    @Override
    public void notificar(){
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
           obs.atualizar(valorA, valorB, valorC);
        }
    }
    
}
