public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 20, "M");
        p[1] = new Pessoa("João", 19, "M");
        p[2] = new Pessoa("Regina", 23, "F");

        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes com Java", "Pedro Paulo", 326, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 288, p[2]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avacarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());
    }
}