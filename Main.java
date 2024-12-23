public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(10);
        contaCorrente.depositar(10);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(100);
        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();





    }
}
