import java.beans.PropertyDescriptor;

public class Main {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); Pessoa é uma classe abstrata
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setMatricula(1111);
        a1.setCurso("Computação");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Fernando");
        b1.setBolsa(25.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("João");
        t1.setMatricula(1113);
        t1.setRegistroProfissional(55203);
        t1.setSexo("M");
        t1.praticar();

        Professor p1 = new Professor();
        p1.setNome("Cláudio");
        p1.setEspecialidade("Inteligencia artificial");
        p1.setSalario(2550.20f);
        p1.receberAumento(50);
    }
}