package aulacapitulo6;

public class Personalidade{
    
    public String falar(){
        return " ";
    }
     public void acionarFalar(Personalidade obj, String titulo){
            System.out.println(titulo + " " + obj.falar());
    }
}