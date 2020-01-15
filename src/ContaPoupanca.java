
public class ContaPoupanca extends Conta implements Tributavel{
	
	double tarifaSaque = 0.20;

	public ContaPoupanca(int conta, int numero, double saldo) {
		super(conta, numero, saldo);
	}

	@Override
	public boolean sacar(double valor) {
		System.out.println("saque poupança");
		double valorTotal = valor + tarifaSaque;
		if((super.saldo - valorTotal) >= 0) {
			super.saldo -= valorTotal;
			return true;
		}else {
			return false;
		}		
	}
	
	@Override
	public double getValorImposto() {
		return 10.00;
	}
}
