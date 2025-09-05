package ProjetoYouTube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de JavaScript");      
        v[2] = new Video("Aula 10 de HTML5");
       
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "Juba");
        g[1] = new Gafanhoto ("Marcos", "M", 18, "Mkgameplay");
        
        visualizacao vis[] = new visualizacao[3];
        vis[0] = new visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new visualizacao(g[0], v[1]);
        vis[0].avaliar(87f);
        System.out.println(vis[0].toString());
        
        /*System.out.println("VIDEOS\n------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("GAFANHOTOS\n-----------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
    }
}
