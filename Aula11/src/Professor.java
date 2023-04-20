public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float aum) {
        this.setSalario(salario + aum);
        System.out.println("O professor recebeu um aumento de R$" + aum + " com seu novo salário sendo R$" + this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
