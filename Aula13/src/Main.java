public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        c.emitirSom();
        c.reagir("olá");
        c.reagir(11,40);
        c.reagir(11, 11.4f);
        c.reagir(true);
    }
}