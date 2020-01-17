
public class ContaPoupanca extends Conta implements Tributavel{
	
	double tarifaSaque = 0.20;

	public ContaPoupanca(int conta, int numero, double saldo) {
		super(conta, numero, saldo);
	}

	@Override
	public void sacar(double valor) {
		System.out.println("saque poupança");
		double valorTotal = valor + tarifaSaque;
		if((super.saldo - valorTotal) <= 0) {
			throw new SaldoInsuficienteException("Saldo Insuficiente para o saque");
		}	
	}
	
	@Override
	public double getValorImposto() {
		return 10.00;
	}
}
