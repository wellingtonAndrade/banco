
public class Cliente {
	
	private String nome;
	private String cpf;
	private int idade;
	private Conta conta;
	
	public Cliente(String nome, String cpf, int idade, Conta conta){
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String toString() {
		return ("CLIENTE: "+ "\n"+ nome + "\nIdade: "+ idade + "\nCpf: " + cpf + "\n"+ conta.toString() +"\n--------------");
	}
	

}
