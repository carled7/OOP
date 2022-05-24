/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulaArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carled7
 */
public class PrincipalArrayAluno {
    
    
    public static void main (String [] args){
        
        List <Aluno> listaDeAlunos = new ArrayList();

        
        Aluno daniel = new Aluno();
        daniel.setNome("Daniel Gomes Januário Junior");
        daniel.setCurso("Gestão Comercial");
        daniel.setEndereco("Rua Panambás, 233, Santo Antônio, Patrocínio");
        daniel.setRA(3456);
        daniel.setMediaHistorico(99.2);
        
        Aluno laniele = new Aluno();
        laniele.setNome("Laniele Dos Reis Martins");
        laniele.setCurso("ADS");
        laniele.setRA(2333);
        laniele.setMediaHistorico(99.3);
        
        listaDeAlunos.add(daniel);
        listaDeAlunos.add(laniele);
        
        for(Aluno aux : listaDeAlunos){
            System.out.println("Nome: " + aux.getNome());
            System.out.println("\t"+ aux.getCurso());
        }
    }
}
