public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void infoConta() {
        System.out.println("---------------------------");
        System.out.println("CONTA: " + getNumConta());
        System.out.println("TIPO: " + getTipo());
        System.out.println("DONO: " + getDono());
        System.out.println("SALDO: " + getSaldo());
        System.out.println("STATUS: " + getStatus());
    }

    // métodos especificos
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro! Retire todo o saldo para fechar a conta.");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito! Regularize sua situação para fechar a conta.");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + getDono());
        } else {
            System.out.println("ERROR! Impossível depósitar.");
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + getDono());
            } else {
                System.out.println("saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar.");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (tipo.equals("CC")) {
            v = 12;
        } else if (tipo.equals("CP")) {
            v = 20;
        }
        if (getStatus()) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível pagar.");
        }
    }
    // Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    // getters e Setters
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public boolean getStatus() {
        return status;
    }
}
