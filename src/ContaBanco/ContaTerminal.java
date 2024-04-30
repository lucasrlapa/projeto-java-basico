package ContaBanco;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Integer numero;
		String agencia;
		String nomeCliente;
		BigDecimal saldo;
		 
		System.out.println("Por favor, digite o número da Conta!");
		numero = Integer.parseInt(scan.nextLine());
		
		System.out.println("Por favor, digite o número da Agência !");
		agencia = scan.next();
		
		scan.nextLine();
		
		System.out.println("Usuário: ");
		nomeCliente = scan.nextLine();
		
		scan.nextLine();
		
		System.out.println("Saldo da conta:");
		saldo = new BigDecimal(scan.nextLine());
		
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
		
		scan.close();
	}
}
