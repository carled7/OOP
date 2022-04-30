/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaclasseinterface;

/**
 *
 * @author carled7
 */
public class Pedido {
    
    private CalculaFrete calculaFrete;

    public CalculaFrete getCalculaFrete() {
        return calculaFrete;
    }
    
    public Pedido(CalculaFrete calculaFrete){
        this.calculaFrete = calculaFrete;
    }
    
    public double freteCalculado(){
        return calculaFrete.calcularfretePedido();
    }
    
}
