package Ex04;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o maior numero do seu Duplo-N?");
        int numero=scanner.nextInt();
      
        
        int linhas = numero + 1;  
        
        /*
        as colunas é sempre o próximo número depois do último degrau +1
        contando todas as casas nao preenchidas para formar um quadrado na imagem.
        exemplo: duplo-4, tem 5 linhas e 5 colunas, mas elas nao estao todas preenchidas.
        
        1º linha duplo-4 -> tem 5 colunas, mas 1 só nao será repetida (0,0), o resto repetirá: (0,1), (0,2), (0,3), (0,4)
        2º linha duplo-4 -> tem 5 colunas, mas 1 só nao sera repetida (1,1), o resto repetirá: (1,2), (1,3), (1,4)...
        ...Não contamos (1,0) porque (0,1) já foi contado!        
        3º linha duplo-4 -> tem 5 colunas, mas 1 só nao sera repetida (2,2), o resto repetirá: (2,3), (2,4)
        e assim por diante...      
        */
        int colunas = numero + 2;
        
        /*se divide por 2 para eliminar peças iguais
        como a peça (2,3) e (3,2)*/
        int NumP=(linhas*colunas)/2; 
        System.out.println("Existem "+NumP+" peças nesse jogo");
    }
}
