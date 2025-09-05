package treinoarraylist;
import java.util.ArrayList;
import java.util.Collections;
public class parte02 {
    public static void main(String[] args) {
        ArrayList<String> filmes = new ArrayList<String>();
        
        /*
        Para se criar ArrayList de variaveis primitivas é da seguinte forma
          //Tipo Primitivo -> Wrapper class
            int            -> Integer
            double         -> Double
            float          -> Float
            char           -> Character
        */
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(32);
        numeros.add(1);
        numeros.add(-1);
        numeros.add(0);
        numeros.add(-32);
        numeros.add(-10);
        
        
        System.out.println("Ordenar ArrayList ");
        //importe o Collections
        //sort -> ordenar 
        Collections.sort(numeros); //ordem crescente (funciona com String em ordem alfabetica)
        Collections.sort(numeros, Collections.reverseOrder()); //ordem decrescente
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        
        
    }
}
