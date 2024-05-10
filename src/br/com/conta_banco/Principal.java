package br.com.conta_banco;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ContaBanco conta = new ContaBanco();
		System.out.print("Digite o numero da angencia: ");
		conta.setAgencia(teclado.next());
		
		System.out.print("Digite o numero da conta: ");
		conta.setNumero(teclado.nextInt());
		
		System.out.print("Digite o seu nome: ");
		conta .setNomeCliente(teclado.next());
		
		System.out.print("Quanto voce deseja depositar: ");
		conta.depositar(teclado.nextDouble());
		
		teclado.close();
		
		System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agencia é " + conta.getAgencia() + 
				", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " ja está disponivel para saque");
		
		
	}

}
