package aula.jogodavelha;
public class Layout {
    
    //fazer as funções para chamar a matriz (jogo da velha)
    String matriz[][]=new String[3][3];
        
    //alem de exibir a matriz, vai fazer com que o X ou O seja marcado no lugar certo
    //sem que deixe os numeros das posições em 0 0 0...
    public void exibirMatriz(){       
        int cont=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (matriz[i][j] == null) {
                    System.out.print(cont + " | ");
                } else {
                    System.out.print(matriz[i][j] + " | ");
                }
                cont++;
            }
            System.out.println("");
        }
    }
    
}
