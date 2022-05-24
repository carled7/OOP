/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author carled7
 */
public abstract class Observador {
    
    private float valorA;
    private float valorB;
    private float valorC;

    public float getValorA() {
        return valorA;
    }

    public float getValorB() {
        return valorB;
    }

    public float getValorC() {
        return valorC;
    }
    
    public void atualizar(float A, float B, float C) {
        this.valorA = A;
        this.valorB = B;
        this.valorC = C;
    }
    
    public abstract void imprimirDados();
    
}
