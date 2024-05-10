package br.com.conta_banco;


public class ContaBanco {
	
	private  int numero;
	private  String agencia;
	private  String nomeCliente;
	private double saldo;
	
	public ContaBanco() {
		this.saldo = 0;
		
	}
		
	
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getNumero() {
		return this.numero;
	}
	public String getAgencia() {
		return this.agencia;
	}
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		if(this.saldo >0) {
			this.saldo -= saque;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	
	

}
