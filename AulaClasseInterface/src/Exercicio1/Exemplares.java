/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author carled7
 */
public interface Exemplares {
    
    public String realizarEmprestimo(int codigo);
    public abstract String realizarDevolucao(int codigo, boolean atraso);
    
}
