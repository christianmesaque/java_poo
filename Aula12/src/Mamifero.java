public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de um mamifero...");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
