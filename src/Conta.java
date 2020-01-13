
public class Conta {
	private int conta;
	private int numero;
	private double saldo;
	
	public Conta(int conta, int numero, double saldo) {
		this.conta = conta;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
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
	
	public boolean sacar(double valor) {
		if((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}		
	}

	@Override
	public String toString() {
		return "Conta: " + conta + "|" + numero + "\nSaldo= R$" + saldo;
	}
	
	
}
