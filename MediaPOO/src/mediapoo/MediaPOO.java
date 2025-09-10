package mediapoo;
import java.util.Scanner;
import mediapoo.model.NotaAluno;
public class MediaPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotaAluno aluno = new NotaAluno();
        
        int escolha;
        do {
            System.out.println("1 - Adicionar e calcular notas de um aluno");
            System.out.println("0 - Sair");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("ID do aluno: ");
                    aluno.setIdAluno(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Nome do aluno: ");
                    aluno.setNomeAluno(sc.nextLine());

                    System.out.print("Nota Trabalho AV1: ");
                    aluno.setNotaTrabalhoAV1(sc.nextDouble());

                    System.out.print("Nota Prova AV1: ");
                    aluno.setNotaProvaAV1(sc.nextDouble());

                    System.out.print("Nota Trabalho AV2: ");
                    aluno.setNotaTrabalhoAV2(sc.nextDouble());

                    System.out.print("Nota Prova AV2: ");
                    aluno.setNotaProvaAV2(sc.nextDouble());

                    aluno.calcularMediaAV1();
                    aluno.calcularMediaAV2();
                    aluno.calcularMediaFinal();

                    System.out.println("===Resutado Final===");
                    System.out.println("Aluno: " + aluno.getNomeAluno());
                    System.out.println("Média AV1: " + aluno.getMediaAV1());
                    System.out.println("Média AV2: " + aluno.getMediaAV2());
                    System.out.println("Média Final: " + aluno.getMediaFinal());
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (escolha != 0);
    }
}