package Ex03;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int cont, s, a, b;
        System.out.println("Informe o valor de 'S' de 1 até 36: ");
        s=scanner.nextInt();

        if (s >= 1 && s <= 36) {
            
            System.out.println("Informe o valor de 'A' de 1 até 10000: ");
            a=scanner.nextInt();

            if (a >= 1 && a <= 10000) {
                
                System.out.println("Informe o valor de 'B' de 1 até 10000: ");
                b=scanner.nextInt();

                if (b >= 1 && b <= 10000) {
                    cont = 0;

                    for (int i = a; i <= b; i++) {
                        int somaDigitos = somaDosDigitos(i);

                        if (somaDigitos == s) {
                            cont++;
                        }
                    }

                    System.out.println("Numeros que a soma de A e B é " + s + ": " +cont+" numeros");
                } else {
                    System.out.println("Valor de B inválido.");
                }
            } else {
                System.out.println("Valor de A inválido.");
            }
        } else {
            System.out.println("Valor de S inválido.");
        }
        
    }

    //calcular a soma dos dígitos de um número
    public static int somaDosDigitos(int num) {
        int soma = 0;
        while (num > 0) {
            soma += num % 10;  //pegar o último dígito
            num /= 10;         //remover o último dígito
        }
        return soma;
    }
}
