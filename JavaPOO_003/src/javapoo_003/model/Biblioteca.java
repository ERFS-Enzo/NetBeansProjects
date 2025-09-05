package javapoo_003.model;

public class Biblioteca {
    private int idEmprestimo;
    private String nomeAluno, nomeLivro;
    private double valorMultaDia, nroDiasAtraso, valorMultaPagar;

    public Biblioteca(int idEmprestimo, String nomeAluno, String nomeLivro, double valorMultaDia, double nroDiasAtraso, double valorMultaPagar) {
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
        this.valorMultaPagar = valorMultaPagar;
    }

    
    
    public Biblioteca() {
    }

    public double calculoMulta(){
        
        return nroDiasAtraso * valorMultaDia;
        
    }
    public String exibir(){
        return "id: "+getIdEmprestimo()+
                "\nNome do Aluno: "+this.getNomeAluno()+
                "\nNome do Livro: "+this.getNomeLivro()+
                "\nValor da Multa por Dia: "+this.getValorMultaDia()+
                "\nNumero de dias atrasados: "+this.getNroDiasAtraso()+
                "\nValor da Multa: "+this.calculoMulta();
    }
    
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public double getValorMultaDia() {
        return valorMultaDia;
    }

    public void setValorMultaDia(double valorMultaDia) {
        this.valorMultaDia = valorMultaDia;
    }

    public double getNroDiasAtraso() {
        return nroDiasAtraso;
    }

    public void setNroDiasAtraso(double nroDiasAtraso) {
        this.nroDiasAtraso = nroDiasAtraso;
    }

    public double getValorMultaPagar() {
        return valorMultaPagar;
    }

    public void setValorMultaPagar(double valorMultaPagar) {
        this.valorMultaPagar = valorMultaPagar;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "idEmprestimo=" + idEmprestimo + ", nomeAluno=" + 
                nomeAluno + ", nomeLivro=" + nomeLivro + ", valorMultaDia=" + 
                valorMultaDia + ", nroDiasAtraso=" + nroDiasAtraso + ", valorMultaPagar=" + calculoMulta() + '}';
    }
    
    
    
}
