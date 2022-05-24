/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AulaArrayList;

import java.util.*;

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
        
        
        
        List lista = new ArrayList();
        //ArrayList lista2 = new ArrayList();
        
        
        //adicionando valores
        
        lista.add("Daniel");
        lista.add("Leandro");
        lista.add("João");
        lista.add("Micael");
        lista.add("Carlos");
        
        System.out.println("--------------------------------------------");

        
        //percorrendo arrayList
        System.out.println("Tamanho: " + lista.size());
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento ["+i+"]: "+ lista.get(i));
        }
        
        System.out.println("--------------------------------------------");

        
        //removendo valor pelo indice
        System.out.println("Elemento a ser removido: " + lista.get(3));
        lista.remove(3);
        
        System.out.println("--------------------------------------------");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento ["+i+"]: "+ lista.get(i));
        }
        
        System.out.println("--------------------------------------------");
        
        //verificando se há uma ocorrencia
        String verificacao = "Carlos";
        boolean test = lista.contains(verificacao);
        
        if(test){
            System.out.println(verificacao + " está presente na lista.");
        }
        
        //mostrando index do valor
        System.out.println("--------------------------------------------");
        System.out.println("Mostrando a posicao de "+ verificacao + ": " + lista.indexOf(verificacao));
        
        
    }
    
}
