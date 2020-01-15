
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente (int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	@Override
	public boolean sacar(double valor) {
		if((super.saldo - valor) >= 0) {
			super.saldo -= valor;
			return true;
		}else {
			return false;
		}		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.001;
	}
}
