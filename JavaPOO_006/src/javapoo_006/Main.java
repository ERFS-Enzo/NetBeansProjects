package javapoo_006;
import java.util.Scanner;
import javapoo_006.model.OrdemServico;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrdemServico ordemServico = new OrdemServico();
        ArrayList<OrdemServico> servicos = new ArrayList<>();
        
        int escolha =0;
        
        do{
            System.out.println("[1]Criar ordem de serviço");
            System.out.println("[2]Sair");
            escolha=sc.nextInt();
            sc.nextLine();
            switch(escolha){
                case 1: 
                    System.out.println("Informe o ID: ");
                    ordemServico.setId(sc.nextInt());
                    sc.nextLine(); //limpar buffer
                    System.out.println("Informe o Nome do Cliente: ");
                    ordemServico.setNomeCliente(sc.nextLine());
                    System.out.println("Informe o Nome Profissional: ");
                    ordemServico.setNomeProfissional(sc.nextLine());
                    System.out.println("Informe o valor por hora de serviço: ");    
                    ordemServico.setValorServicoHora(sc.nextDouble());
                    System.out.println("Informe o valor de KM deslocado: ");
                    ordemServico.setValorKmDeslocamento(sc.nextDouble());
                    System.out.println("Informe o numero de horas trabalhadas: ");
                    ordemServico.setNroHorasTrabalhadas(sc.nextDouble());
                    System.out.println("Informe o numero de KM percorrido: ");
                    ordemServico.setNroKmPercorrido(sc.nextDouble());
                    
                    ordemServico.calculo();
                    
                    servicos.add(ordemServico);
                    System.out.println("Ordem de Serviço cadastrado!");
                    
                    
                    break;
                case 2: 
                    System.out.println("Relação de servicos");
                    for(OrdemServico os : servicos){
                        System.out.println(ordemServico.toString());
                    }
                    System.out.println("Adeus!");
                    break;
                default: 
                    System.out.println("Numero Incorreto!");
                    break;
            }
        }while(escolha != 2);
        
        
        
        ordemServico.calculo();
        //System.out.println(ordemServico.toString());
       
    }

}
