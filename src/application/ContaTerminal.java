package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();

		System.out.println("Por favor, digite o número da Agência :");
		String insertAgencia = sc.next();
		
		System.out.println("\nPor favor, digite o número da Conta :");
		int insertNumero = sc.nextInt();
		
		System.out.println("\nPor favor, digite o seu nome completo :");
		String insertNome = sc.next();
		
		System.out.println("\nPor favor, digite o valor do primeiro depósito: ");
		Double valorInicial = sc.nextDouble();
		
		System.out.println("\n");

		conta.setAgencia(insertAgencia);
		conta.setNumero(insertNumero);
		conta.setNomeCliente(insertNome);
		conta.depositar(valorInicial);
		
		System.out.println(conta.toString());
		sc.close();
	}

}
