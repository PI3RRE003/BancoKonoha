public  abstract class ContaBancaria implements Conta {

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu Saldo atual e de: " + saldo);
    }

    public abstract  double depositar(double valor);
}
