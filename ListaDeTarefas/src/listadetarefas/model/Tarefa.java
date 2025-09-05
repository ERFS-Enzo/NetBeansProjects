package listadetarefas.model;
import java.util.ArrayList;
import java.util.Scanner;
public class Tarefa {
    Scanner sc = new Scanner(System.in);   
    private ArrayList<String> tarefas = new ArrayList<>();
    public void addTarefa(){
        System.out.println("-----------------------------");
        System.out.print("Informe um nome para sua tarefa: ");
        tarefas.add(sc.nextLine());
        System.out.println("Tarefa adicionada com sucesso!");
        System.out.println("-----------------------------");
    } 
    public void rmvTarefa(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada");
            System.out.println("");
            return;
        }
        verTarefa();
        System.out.println("Escolha a tarefa que deseja remover [numero]");
        int numero=sc.nextInt();
        if(numero > 0 && numero <= tarefas.size()){
            String removido = tarefas.remove(numero - 1);
            System.out.println("Tarefa ("+removido+") removido com sucesso!!");
        } else{
            System.out.println("Numero Inválido!");
        }      
        System.out.println("-----------------------------");
    }
    public void verTarefa(){
        System.out.println("-----------------------------");
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada");
        } else{
            for(int i = 0; i < tarefas.size(); i++){
                System.out.println((i+1)+"- "+tarefas.get(i)); 
            }
        }
        System.out.println("-----------------------------");
    }
}
