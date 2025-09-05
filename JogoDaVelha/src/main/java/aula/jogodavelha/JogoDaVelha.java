package aula.jogodavelha;
public class JogoDaVelha {
    
    public static boolean jogoAcabar=false;
    
    public static void main(String[] args) {
        Layout layout = new Layout();
        ValidarJogada validador = new ValidarJogada(layout);
        Verificar verificar = new Verificar(layout);
        
        System.out.println("-----------------------------");
        System.out.println("Usuario: X");
        System.out.println("Maquina: O");
        System.out.println("Se divirta!!\n");
        do {
            layout.exibirMatriz();
            System.out.println("-----------------------------");

            validador.usuario();
            verificar.condition();

            // Verifica se o jogo acabou após a jogada do usuário
            if (jogoAcabar) {
                layout.exibirMatriz();
                System.out.println("O jogo acabou.");
                break;
            }

            System.out.println("-----------------------------");
            layout.exibirMatriz();

            validador.maquina();
            verificar.condition();

            if (jogoAcabar) {
                layout.exibirMatriz();
                System.out.println("O jogo acabou.");
                break;
            }

        }while(!jogoAcabar);
        
    }
}