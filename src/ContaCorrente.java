
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente (int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	@Override
	public void sacar(double valor) {
		if((super.saldo - valor) < 0) {
			throw new SaldoInsuficienteException("Saldo Insuficiente para o saque");
		}	
		this.saldo -= valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.001;
	}
}
