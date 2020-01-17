
public abstract class Conta implements Tributavel{
	private int agencia;
	private int numero;
	protected double saldo;
	
	public Conta(int conta, int numero, double saldo) {
		this.agencia = conta;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getConta() {
		return agencia;
	}
	public void setConta(int conta) {
		this.agencia = conta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		
	}

	@Override
	public String toString() {
		return "Conta: " + agencia + "|" + numero + "\nSaldo= R$" + saldo;
	}
	
	
}
