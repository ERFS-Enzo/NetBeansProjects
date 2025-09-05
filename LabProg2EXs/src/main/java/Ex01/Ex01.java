package Ex01;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Cibele nasceu antes de Camila e Celeste nasceu depois de Camila.
       //Cibele>Camila>Celeste
       int i1, i2, i3;
       
      
        System.out.println("Digite A idade 1: ");
        i1=scanner.nextInt();
        System.out.println("Digite A idade 2: ");
        i2=scanner.nextInt();
        System.out.println("Digite A idade 3: ");
        i3=scanner.nextInt();
        
        if((i1 > i2 && i1 < i3) || (i1 == i2 && i1 < i3)){ 
            System.out.println("Camila é a que tem idade: "+i1);
        }else if((i2 > i1 && i2 < i3) || (i2==i3 && i2 < i1)){
            System.out.println("Camila é a que tem idade: "+i2);
        }else if((i3 > i1 && i3 < i2) || (i3==i1 && i3 < i2)){
            System.out.println("Camila é a que tem idade: "+i3);
        }else{
            System.out.println("Todas tem a mesma idade");
        }
        
        System.out.println("Idades: "+i1+" "+i2+" "+i3);
    }
}
