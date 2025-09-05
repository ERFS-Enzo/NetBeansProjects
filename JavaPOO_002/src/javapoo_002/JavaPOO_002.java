package javapoo_002;
import java.util.Scanner;
import javapoo_002.model.Veiculo;
public class JavaPOO_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo v = new Veiculo();
        
        System.out.println("Marca: ");
        v.setMarca(sc.next());
        System.out.println("Modelo: ");
        v.setModelo(sc.next());
        System.out.println("Ano do carro: ");
        v.setAno(sc.next());
        System.out.println("Valor de Venda: ");
        v.setValorVenda(sc.nextDouble());
        System.out.println("Placa: ");
        v.setPlaca(sc.next());
       
        v.exibir();
    }
}
