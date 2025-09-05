package aula.jogodavelha;
import java.util.Scanner;
import java.util.Random;
public class ValidarJogada{
    //fazer função de validação de jogada
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private Layout layout;
    
    public ValidarJogada(Layout layout) {
        this.layout = layout;
    }
    
    public void usuario(){
        System.out.println("\n--------Vez do Usuario--------");
        System.out.println("Onde deseja jogar? (1 a 9) ");
        int numero=scanner.nextInt();
        
        boolean valido=false;
            if(numero <1 || numero >9){
                System.out.println("Posição inválida, tente novamente");
                
            } else{
                while(valido==false){
                    if(layout.matriz[(numero-1)/3][(numero-1)%3] == null){
                        layout.matriz[(numero-1)/3][(numero-1)%3] = "X";
                        valido=true;
                    } else{
                        System.out.println("Posição Ocupada, tente outra");
                        System.out.println("Onde deseja jogar?");
                        numero=scanner.nextInt();
                    }                 
                }
            }         
    }
    
    public void maquina(){
        System.out.println("\n--------Vez da Maquina--------");
        System.out.println("Onde deseja jogar?");
        int numero = random.nextInt(9)+1; //se nao transformar em numero nao da pra chamar no array de matriz pois é um objeto
        
        
        boolean valido=false;
        while(valido==false){
            if(layout.matriz[(numero-1)/3][(numero-1)%3] == null){
                layout.matriz[(numero - 1) / 3][(numero - 1) % 3] = "O";
                valido = true;
                System.out.println(numero);
            } else{
                System.out.println("Posição Ocupada, tente outra");
                numero = random.nextInt(9)+1;               
            }           
        }
    }
    
    
}
