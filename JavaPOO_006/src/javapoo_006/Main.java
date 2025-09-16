package javapoo_006;
import java.util.Scanner;
import javapoo_006.model.OrdemServico;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrdemServico os = new OrdemServico();
        
        System.out.println("Informe o ID: ");
        os.setId(sc.nextInt());
        sc.nextLine(); //limpar buffer
        System.out.println("Informe o Nome do Cliente: ");
        os.setNomeCliente(sc.nextLine());
        System.out.println("Informe o Nome Profissional: ");
        os.setNomeProfissional(sc.nextLine());
        System.out.println("Informe o valor por hora de serviço: ");
        os.setValorServicoHora(sc.nextDouble());
        System.out.println("Informe o valor de KM deslocado: ");
        os.setValorKmDeslocamento(sc.nextDouble());
        System.out.println("Informe o numero de horas trabalhadas: ");
        os.setNroHorasTrabalhadas(sc.nextDouble());
        System.out.println("Informe o numero de KM percorrido: ");
        os.setNroKmPercorrido(sc.nextDouble());
        
        os.calculo();
        System.out.println(os.toString());
       
    }

}
