package empresafrotaveiculos;
import empresafrotaveiculos.model.TipoVeiculo;
import empresafrotaveiculos.model.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TipoVeiculo> tipoveiculos = new ArrayList<>();
       
        int escolha=0, continuar=0;
        
        do{
            System.out.println("======================================");
            System.out.println("[1] Cadastrar Tipo de Veiculo");
            System.out.println("[2] Sair");
            escolha=sc.nextInt();
            sc.nextLine();
            switch(escolha){
                case 1:
                    TipoVeiculo tipoveiculo = new TipoVeiculo();
                    System.out.println("======================================");
                    System.out.println("Tipo de veiculo que deseja cadastrar: ");
                    tipoveiculo.setDescricao(sc.nextLine());
                    System.out.println("Informe o ID deste tipo de veiculo");
                    tipoveiculo.setId(sc.nextInt());
                    sc.nextLine();
                    
                    tipoveiculos.add(tipoveiculo);
                    
                    System.out.println("======================================");
                    System.out.println("Tipo de Veiculo cadastrado com sucesso");
                    System.out.println("======================================");
                    
                    do{
                        System.out.println("Cadastrar Veiculos do Tipo "+tipoveiculo.getDescricao());
                        Veiculo veiculo = new Veiculo();
                        System.out.println("Informe o ID do veiculo: ");
                        veiculo.setIdVeiculo(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Informe a Marca: ");
                        veiculo.setMarca(sc.nextLine());
                        System.out.println("Informe o Modelo: ");
                        veiculo.setModelo(sc.nextLine());
                        System.out.println("Informe o valor do odometro: ");
                        veiculo.setOdometro(sc.nextLine());
                        System.out.println("Informe o valor do veiculo: ");
                        veiculo.setValorVeiculo(sc.nextDouble());
                    
                        tipoveiculo.getVeiculos().add(veiculo);
                        
                        System.out.println("======================================");
                        System.out.println("[1] Cadastrar outro veiculo do tipo "+tipoveiculo.getDescricao());
                        System.out.println("[2] Sair");
                        continuar = sc.nextInt();
                        sc.nextLine();
                    }while(continuar == 1);
                    
                    break;
                case 2:
                    System.out.println("\n===== INVENTÁRIO FINAL =====");
                    for (TipoVeiculo tipo : tipoveiculos) {
                        System.out.println("Tipo de Veículo: " + tipo.getDescricao());
                        double total = 0;
                        for (Veiculo v : tipo.getVeiculos()) {
                            System.out.println(" - " + v.getModelo() + " (" + v.getMarca() + ") - R$ " + v.getValorVeiculo());
                            total += v.getValorVeiculo();
                        }
                        System.out.println("Total do tipo " + tipo.getDescricao() + ": R$ " + total);
                        System.out.println("---------------------------------");
                    }
                    System.out.println("\nAdeus!");
                    break;
            }
        }while(escolha != 2);
    }
}
