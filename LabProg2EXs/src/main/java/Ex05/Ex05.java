package Ex05;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N1, D1, V1; //Nº distindo, m e km/h //T de tempo
        int N2, D2, V2;
        double T1, T2;
        
        System.out.println("Informe o numero da primeira charrete [1 a 99]");
        N1=scanner.nextInt();
        System.out.println("Informe sua distancia da linha de chegada em m(metro) [0 a 1000]");
        D1=scanner.nextInt();
        System.out.println("Informe sua velocidade em km/h [0 a 50]");
        V1=scanner.nextInt();
        
        System.out.println("\n--------------------------------------------------------------\n");
        
        System.out.println("Informe o numero da segunda charrete [1 a 99]");
        N2=scanner.nextInt();
        System.out.println("Informe sua distancia da linha de chegada em m(metro) [0 a 1000]");
        D2=scanner.nextInt();
        System.out.println("Informe sua velocidade em km/h [0 a 50]");
        V2=scanner.nextInt();
        
        if(N1 == N2 || N1 < 1 || N1 > 99 || N2 < 1 || N2 > 99){
            System.out.println("Digite um numero válido");
            scanner.close();
        } else if(D1 < 1 || D1 > 1000 || D2 < 1 || D2 > 1000){
            System.out.println("Digite uma distancia valida");
            scanner.close();
        } else if(V1 < 1 || V1 > 50 || V2<1 || V2>50){
            System.out.println("Digite uma velocidade valida");
            scanner.close();
        } else{
            double dist1, dist2;
            dist1=D1/1000.0; //PASSAR PARA KM
            dist2=D2/1000.0;
            T1=dist1/V1; //ACHAR O TEMPO EM HORAS
            T2=dist2/V2;
            
            if (T1 < T2) {
                System.out.println("A charrete " + N1 + " ganhou");
            } else if (T2 < T1) {
                System.out.println("A charrete " + N2 + " ganhou");
            } else {
                System.out.println("Houve um empate");
            }
        }
        
    }
}
