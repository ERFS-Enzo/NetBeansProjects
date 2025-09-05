package treinoarraylist;
import java.util.ArrayList;
public class TreinoArrayList {
    public static void main(String[] args) {
        
        //array normal
        String[] arrayEstatico = new String[2];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Vegeta";
        
        System.out.println("Imprimindo o Array Estático");
        for(int indice = 0; indice < arrayEstatico.length; indice++){
            System.out.println(arrayEstatico[indice]);
        }
        
        //ArrayList<tipo> nome = new ArrayList<tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku"); //indice 0
        arrayDinamico.add("Vegeta"); //indice 1
        
        System.out.println("Imprimindo o Array Dinamico");
        System.out.println("Tamanho do arrayList: "+ arrayDinamico.size()); //para arrayList nao se usa .length, usa .size()
        for(int indice = 0; indice < arrayDinamico.size(); indice++){
            System.out.println(arrayDinamico.get(indice));
        }
        
        System.out.println("Remover ArrayList");
        arrayDinamico.remove(0); //nome.remove(qual a posição);
        
        System.out.println("Limpar o ArrayList");
        arrayDinamico.clear();
        
        
        System.out.println("Imprimindo usando foreach");
        for(String nome : arrayDinamico){
            System.out.println(nome);
            /*
            ele ja cria uma variavel com o indice que ele ta percorrendo.
            É como se ele fizesse isso:
            for(int indice = 0; indice < arrayDinamico.size(); indice++){
                String nome = arrayDinamico.get(indice);
                System.out.println(nome);
            }
            */
        }
        
        
    }
}
