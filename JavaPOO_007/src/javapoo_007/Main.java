package javapoo_007;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javapoo_007.model.Paciente;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> pacientes = new ArrayList<>();
        int escolha, cont=0;
        double idadeTotal=0, media = 0;
        do{
            System.out.println("[1] Cadastrar Paciente");
            System.out.println("[2] Sair");
            escolha=sc.nextInt();
            switch(escolha){
                case 1:
                    Paciente paciente = new Paciente();
                    System.out.println("Informe o ID: ");
                    paciente.setId(sc.nextInt());
                    System.out.println("Informe a Idade: ");
                    paciente.setIdade(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Informe o Nome: ");
                    paciente.setNome(sc.nextLine());
                    System.out.println("Informe o diagnostico: ");
                    paciente.setDiagnostico(sc.nextLine());
                    
                    pacientes.add(paciente);
                    
                    cont++;
                    idadeTotal += paciente.getIdade();
                    media = idadeTotal/cont;
                    break;
                case 2:
                    //emitir uma relação de pacientes cadastrados no sistema (toString)
                    for(Paciente p : pacientes){
                        System.out.println(p.toString());
                    }
                    //informar o número de pacientes que foi cadastrado (contador)
                    System.out.println("Foram Registrados "+cont+" Pacientes");
                    //média de idade dos pacientes atendidos
                    System.out.println("Media das Idades: "+media+" anos");
                    
                    break;
            }
        }while(escolha != 2);

    }
}
