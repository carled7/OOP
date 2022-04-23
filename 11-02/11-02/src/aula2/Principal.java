package aula2;

// @author IFTM

public class Principal {

    
    public static void main(String[] args) {
        
       Empregado joao = new Empregado();
       joao.primeiroNome = "João";
       joao.segundoNome = "da Silva";
       joao.salarioMensal = 1158.58;
       
       joao.mostrarInformacoes();
       joao.verificarSalario(joao.salarioMensal);
       
    }
    
}
