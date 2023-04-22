import java.util.spi.CalendarDataProvider;

public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru c = new Canguru();
        Cachorro ch = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara a = new Arara();

        c.locomover();
        c.emitirSom();
        ch.locomover();
        ch.emitirSom();
    }
}