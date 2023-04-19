import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada!");
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Impossível marcar luta!");
        }
    }

    public void lutar() {
        if (getAprovado()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("RESULTADO DA LUTA");

            Random random = new Random();
            int vencedor = random.nextInt(3);
            int qtdRounds = random.nextInt(5);

            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empate!");
                    System.out.println("Quantidade de Rounds: " + qtdRounds);
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("O desafiado " + this.desafiado.getNome() + " é o vencedor!");
                    System.out.println("Quantidade de Rounds: " + qtdRounds);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("O desafiante " + this.desafiante.getNome() + " é o vencedor!");
                    System.out.println("Quantidade de Rounds: " + qtdRounds);
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
            }
        } else {
            System.out.println("Essa luta não pode acontecer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
