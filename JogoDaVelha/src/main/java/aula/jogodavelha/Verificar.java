package aula.jogodavelha;
public class Verificar {
    //fazer a função de verificação de vitoria ou empate
    private Layout layout;

    public Verificar(Layout layout) {
        this.layout = layout;
    }
    
    
    
    public void condition(){
        String[][] mat = layout.matriz; //pegar matriz da classe layout que esta no construtor e colocar aqui.
        
        //agora vou fazer a verificação das 3 linhas e 3 colunas usando FOR
        //conferir linha
        for(int i=0;i<3;i++){
            if (mat[i][0] != null && mat[i][0].equals(mat[i][1]) && mat[i][1].equals(mat[i][2])) {
                Vencedor(mat[i][0]); //o Vencedor(mat[i][0]) o mat[i][0] vai ser ou X ou O. denominado a String choose de Vencedor
                return;
            }
        }
        //conferir coluna
        for(int j=0;j<3;j++){
                if (mat[0][j] != null && mat[0][j].equals(mat[1][j]) && mat[1][j].equals(mat[2][j])) {
                Vencedor(mat[0][j]);
                return;
            }
        }        
        //conferir diagonal principal
        if (mat[0][0] != null && mat[0][0].equals(mat[1][1]) && mat[1][1].equals(mat[2][2])) {
            Vencedor(mat[0][0]);
            return;
        }
        //conferir diagonal secundaria
        if (mat[0][2] != null && mat[0][2].equals(mat[1][1]) && mat[1][1].equals(mat[2][0])) {
            Vencedor(mat[0][2]);
            return;
        }
        
        
        //verificação de empate
        boolean empate = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] == null) {
                    empate = false;
                    break;
                }
            }
        }

        if (empate) {
            System.out.println("\n--- Empate! Fim de jogo. ---");
            JogoDaVelha.jogoAcabar = true;
        }
        
    }
    
    //precisa de uma função pra chamar o vencedor
    public void Vencedor(String choose){ //choose eu referi ao X e O
        switch (choose) {
            case "X":
                System.out.println("\n---O vencedor é o Usuario---");
                break;
            case "O":
                System.out.println("\n---O vencedor é a Maquina---");
                break;
            default:
                System.out.println("\n---ALGO DE ERRADO NAO ESTA CERTO---");
                break;
        }
        JogoDaVelha.jogoAcabar = true;
    }
    
}

