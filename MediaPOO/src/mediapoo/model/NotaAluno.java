package mediapoo.model;
import java.util.Scanner;
public class NotaAluno {
    Scanner sc = new Scanner(System.in);
    
    private int idAluno;
    private String nomeAluno;
    private double notaTrabalhoAV1, notaProvaAV1, mediaAV1, notaTrabalhoAV2, notaProvaAV2, mediaAV2, mediaFinal;


    public void calcularMediaAV1() {
        mediaAV1 = (notaTrabalhoAV1 + notaProvaAV1) / 2.0;
    }

    public void calcularMediaAV2() {
        mediaAV2 = (notaTrabalhoAV2 + notaProvaAV2) / 2.0;
    }

    public void calcularMediaFinal() {
        mediaFinal = (mediaAV1 + mediaAV2) / 2.0;
    }

    private double validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida! Insira uma nota entre 0 a 10");
        }
        return nota;
    }
    
    
    
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNotaTrabalhoAV1() {
        return notaTrabalhoAV1;
    }

    public void setNotaTrabalhoAV1(double notaTrabalhoAV1) {
        this.notaTrabalhoAV1 = validarNota(notaTrabalhoAV1);
    }

    public double getNotaProvaAV1() {
        return notaProvaAV1;
    }

    public void setNotaProvaAV1(double notaProvaAV1) {
        this.notaProvaAV1 = validarNota(notaProvaAV1);
    }

    public double getNotaTrabalhoAV2() {
        return notaTrabalhoAV2;
    }

    public void setNotaTrabalhoAV2(double notaTrabalhoAV2) {
        this.notaTrabalhoAV2 = validarNota(notaTrabalhoAV2);
    }

    public double getNotaProvaAV2() {
        return notaProvaAV2;
    }

    public void setNotaProvaAV2(double notaProvaAV2) {
        this.notaProvaAV2 = validarNota(notaProvaAV2);
    }

    public double getMediaAV1() {
        return mediaAV1;
    }

    public double getMediaAV2() {
        return mediaAV2;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    
}
