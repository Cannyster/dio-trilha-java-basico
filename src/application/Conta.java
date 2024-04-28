package application;

public class Conta{

	private int numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public Conta() {
		this.saldo = 0.0;
	}

	public Conta(int numero, String agencia, String nomeCliente, Double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;
	}

	@Override
	public String toString() {
		return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia +
				", conta " + this.numero + ", seu saldo R$" + String.format("%.2f", this.saldo) + ", já está disponível para saque.";
	}	
	
}

