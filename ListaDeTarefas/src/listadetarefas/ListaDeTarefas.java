package listadetarefas;
import java.util.Scanner;
import listadetarefas.model.Tarefa;
public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();
        int escolha;
        do{
            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Remover tarefa");
            System.out.println("[3] Ver tarefas");
            System.out.println("[4] Sair");
            escolha = sc.nextInt();
            switch (escolha){
                case 1 -> tarefa.addTarefa();
                case 2 -> tarefa.rmvTarefa();
                case 3 -> tarefa.verTarefa();
                case 4 -> System.out.println("Até logo!!");
                default -> System.out.println("ERRO! escolha uma opção válida");
            }
        }while(escolha != 4);
    }
}
