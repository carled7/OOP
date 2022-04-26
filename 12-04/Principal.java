package aulacapitulo6;

public class Principal{
    public static void main(String[] args){
      
        //INSTANCIANDO OBJETOS DE CADA CLASSE
        Personalidade personalidade = new Personalidade();
        Pessimista pessimista = new Pessimista();
        Otimista otimista = new Otimista();
        Extrovertido extrovertido = new Extrovertido();
        Introvertido introvertido = new Introvertido();
        
//        ARRAY DAS PERSONALIDADES
//        Personalidade[] variasPersonalidades = new Personalidade[5];
//            variasPersonalidades[0]= personalidade;
//            variasPersonalidades[1]= pessimista;
//            variasPersonalidades[2]= otimista;
//            variasPersonalidades[3]= extrovertido;
//            variasPersonalidades[4]= introvertido;
//        
//           LOOP PARA PERCORRER PERSONALIDADES
//           for(int i = 0; i < 5; i++){
//                System.out.println(variasPersonalidades[i].falar());
//        }

         //A CLASSE PERSONALIDADE ACESSA O MÉTODO ACIONAR, E ATRÁVES DE CADA OBJETO ELE RECEBE O VALOR NO PARÂMETRO
         personalidade.acionarFalar(pessimista, "Pessimista -");
         personalidade.acionarFalar(otimista, "Otimista -");
         personalidade.acionarFalar(extrovertido, "Extrovertido -");
         personalidade.acionarFalar(introvertido, "Introvertido -");
    }
}
