package javapoo_005;
import java.util.Scanner;
import javapoo_005.model.Conta;
public class JavaPOO_005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        int escolha=0;
        
        System.out.println("Banco: ");
        conta.setBanco(sc.nextLine());
        System.out.println("Numero da agencia: ");
        conta.setNumeroAgencia(sc.nextLine());
        System.out.println("Numero da conta: ");
        conta.setNumeroConta(sc.nextLine());
        System.out.println("Saldo atual: ");
        conta.setSaldoAtual(sc.nextDouble());
        
        do{
            System.out.println("\n====MENU====");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Exibir Dados da Conta");
            System.out.println("[4] Sair");
            escolha=sc.nextInt();
            
            switch (escolha){
                case 1:
                    System.out.print("Informe o valor a depositar: ");
                    double valorDep=sc.nextDouble();
                    System.out.println(conta.depositar(valorDep));
                    break;
                case 2:
                    System.out.print("Informe o valor a sacar: ");
                    double valorSaq=sc.nextDouble();
                    System.out.println(conta.sacar(valorSaq));
                    break;
                case 3:
                    System.out.println(conta.toString());
                    break;
                case 4:
                    System.out.println("Adeus!!"); 
                    break;
                default:
                    System.out.println("ERROR! Escolha algo válido");
                    break;
            }
        }while(escolha != 4);
    }

}
