package javapoo_004;

import java.util.Scanner;
import javapoo_004.model.Emprestimo;
public class JavaPOO_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emprestimo emprestimo = new Emprestimo();
        int escolha = 0;
        
        System.out.println("Nome: ");
        emprestimo.setCliente(sc.nextLine());
        
        System.out.println("Banco: ");
        emprestimo.setBanco(sc.nextLine());
        
        System.out.println("Valor do emprestimo: ");
        emprestimo.setValorEmprestimo(sc.nextDouble());
        
        System.out.println("Numero de Parcelas: ");
        emprestimo.setNroParcelas(sc.nextInt());
        
        emprestimo.setValorParcela(0); 
        emprestimo.setValorParcelaPagar(emprestimo.getValorEmprestimo());
        do{
            System.out.println("=====MENU====");
            System.out.println("[1] Pagar parcela");
            System.out.println("[2] Extrato Contrato");
            System.out.println("[3] Ver Dados");
            System.out.println("[4] Sair");
            escolha = sc.nextInt();            
            
            switch (escolha){
                case 1:
                    System.out.println(emprestimo.pagarParcela());
                    break;
                case 2:
                    System.out.println(emprestimo.calcularContrato());
                    break;
                case 3:
                    System.out.println(emprestimo.toString());
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
