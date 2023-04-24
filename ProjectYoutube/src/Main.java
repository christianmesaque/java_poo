public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 - POO");
        v[1] = new Video("Aula 2 - Encapsulamento");
        v[2] = new Video("Aula 1 - Introdução ao HTML");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        Visualizacao vi[] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0], v[2]);
        vi[0].avaliar();
        System.out.println(vi[0].toString());

        vi[1] = new Visualizacao(g[0], v[1]);
        vi[0].avaliar(35.0f);
        System.out.println(vi[1].toString());

        /*System.out.println("VÍDEOS\n------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}