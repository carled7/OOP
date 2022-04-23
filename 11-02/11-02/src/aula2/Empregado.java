package aula2;

/**
 * @author IFTM
 */
public class Empregado {
    
    public String primeiroNome;
    public String segundoNome;
    public double salarioMensal;
    
    public void mostrarInformacoes (){
            System.out.println("Nome: " + primeiroNome + " " + segundoNome);
            System.out.println("Salario: R$" + salarioMensal);
    }
    
    public void verificarSalario (double num){
        
        if (num > 0.00) {
            System.out.println("Salário maior que R$0,00 (R$" + num + ")");
        }else{
            System.out.println("Salário não é maior que R$0,00 (R$" + num + ")");
        }
    }
         
    
}
