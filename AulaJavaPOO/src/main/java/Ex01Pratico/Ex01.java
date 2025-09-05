package Ex01Pratico;
public class Ex01 {
    public static void main(String[] args) {
        //aqui voce vai criar as contas do banco
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Ricardão");
        p1.abrirConta("CC");  //conta corrente
        p1.depositar(100);
        p1.sacar(25);
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP"); //conta poupança
        p2.depositar(500);
        p2.sacar(300);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
}
