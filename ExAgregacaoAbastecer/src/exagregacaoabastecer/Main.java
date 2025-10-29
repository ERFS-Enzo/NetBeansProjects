package exagregacaoabastecer;
import exagregacaoabastecer.model.Abastecimento;
import exagregacaoabastecer.model.Combustivel;
import exagregacaoabastecer.model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        List<Combustivel> combustiveis = new ArrayList<>();

        int idVeiculo = 1, idCombustivel = 1, idAbastecimento = 1;
        int opcao, opcaoInterna;

        System.out.println("=====CADASTRO DE COMBUSTÍVEIS=====");
        do {
            Combustivel combustivel = new Combustivel();
            combustivel.setId(idCombustivel);

            System.out.print("Descrição: ");
            combustivel.setDescricao(sc.nextLine());

            System.out.print("Preço por litro de " + combustivel.getDescricao() + ": ");
            combustivel.setValorLitro(sc.nextDouble());
            sc.nextLine();

            combustiveis.add(combustivel);
            idCombustivel++;

            System.out.print("Deseja cadastrar outro combustível? [1-Sim / 2-Não]: ");
            opcao = sc.nextInt();
            sc.nextLine();

        } while (opcao == 1);

        System.out.println("=====CADASTRO DE VEÍCULOS=====");
        boolean continuar = true;

        while (continuar) {
            System.out.print("Deseja cadastrar um veículo? [1-Sim / 2-Não]: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Veiculo veiculo = new Veiculo();
                    veiculo.setId(idVeiculo);
                    System.out.print("Descrição do veículo: ");
                    veiculo.setDescricao(sc.nextLine());
                    System.out.print("Valor do odômetro: ");
                    veiculo.setOdometro(sc.nextLine());
                    System.out.print("Valor do veículo: ");
                    veiculo.setValorVeiculo(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Placa: ");
                    veiculo.setPlaca(sc.nextLine());
                    System.out.print("Chassis: ");
                    veiculo.setChassis(sc.nextLine());

                    idVeiculo++;
                    veiculos.add(veiculo);

                    do {
                        System.out.print("Deseja registrar um abastecimento para este veículo? [1-Sim / 2-Não]: ");
                        opcaoInterna = sc.nextInt();
                        sc.nextLine();

                        switch(opcaoInterna) {
                            case 1:
                                Abastecimento abastecimento = new Abastecimento();
                                abastecimento.setId(idAbastecimento);

                                System.out.print("Km percorrido: ");
                                abastecimento.setKmPercorrido(sc.nextInt());
                                sc.nextLine();

                                System.out.print("Quantidade de combustível (litros): ");
                                abastecimento.setQuantidadeLitros(sc.nextDouble());
                                sc.nextLine();

                                System.out.println("Selecione o combustível:");
                                for (Combustivel c : combustiveis) {
                                    System.out.println(c.getId() + " - " + c.getDescricao() + " (R$" + c.getValorLitro() + ")");
                                }
                                System.out.print("Digite o ID do combustível: ");
                                int idCombustivelEscolhido = sc.nextInt();
                                sc.nextLine();

                                Combustivel combustivelEscolhido = null;
                                for (Combustivel c : combustiveis) {
                                    if (c.getId() == idCombustivelEscolhido) {
                                        combustivelEscolhido = c;
                                        break;
                                    }
                                }

                                if (combustivelEscolhido == null) {
                                    System.out.println("Combustível inválido!");
                                    break;
                                }

                                abastecimento.setCombustivel(combustivelEscolhido);
                                abastecimento.setMediaConsumo(abastecimento.getKmPercorrido() / abastecimento.getQuantidadeLitros());
                                abastecimento.setValorAbastecimento(abastecimento.getQuantidadeLitros() * combustivelEscolhido.getValorLitro());

                                veiculo.adicionarAbastecimento(abastecimento);
                                idAbastecimento++;
                                break;

                            case 2:
                                System.out.println("Voltando...");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }

                    } while(opcaoInterna != 2);
                    break;

                case 2:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        System.out.println("\n==========RELATÓRIO DE ABASTECIMENTOS==========");
        for (Veiculo v : veiculos) {
            System.out.println("\n"+v.toString());
            System.out.println("---------------------------------------------");

            double somaMedias = 0;
            for (Abastecimento a : v.getAbastecimentos()) {
                System.out.println(a.getId()+"º Abastecimento ");
                System.out.println("Combustível: "+a.getCombustivel().getDescricao());
                System.out.println("Km percorrido: "+a.getKmPercorrido());
                System.out.println("Litros: "+a.getQuantidadeLitros());
                System.out.println("Valor abastecido: R$ "+a.getValorAbastecimento());
                System.out.println("Consumo médio: "+a.getMediaConsumo()+" km/L");
                System.out.println();
                somaMedias += a.getMediaConsumo();
            }

            if (!v.getAbastecimentos().isEmpty()) {
                double mediaGeral = somaMedias / v.getAbastecimentos().size();
                System.out.println("Média geral de consumo do veículo: "+mediaGeral+" km/L");
            } else {
                System.out.println("Nenhum abastecimento registrado para este veículo.");
            }
        }
        System.out.println("===============================================");
    }
}