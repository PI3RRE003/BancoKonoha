public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double depositar(double valor) {
        double taxa = valor * 0.01;
        double novoDeposito = getSaldo() + taxa  + valor;
        setSaldo(novoDeposito);
        return novoDeposito;
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }
}
