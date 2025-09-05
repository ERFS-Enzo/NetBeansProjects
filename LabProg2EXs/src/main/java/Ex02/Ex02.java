package Ex02;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vitoria=0, derrota=0;
        char result, auxiliar;
        for(int i=0; i<6;i++){
            System.out.println("Resultado do Primeiro jogo [V]venceu [P]perdeu: "); 
            result=scanner.next().charAt(0);
            auxiliar= Character.toUpperCase(result); //transfornar em uppercase
            
            if(result == 'V') vitoria++;
            if(result == 'P') derrota++;
               
            
        }
        if(vitoria == 6 || vitoria ==5) System.out.println("Grupo 1");
        if(vitoria == 4 || vitoria ==3) System.out.println("Grupo 2");
        if(vitoria == 2 || vitoria ==1) System.out.println("Grupo 1");
        if(derrota == 6) System.out.println("Sem grupo ( -1 )");
        
    }
}
