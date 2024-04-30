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
		 
		System.out.println("Por favor, digite o n�mero da Conta!");
		numero = Integer.parseInt(scan.nextLine());
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia !");
		agencia = scan.next();
		
		scan.nextLine();
		
		System.out.println("Usu�rio: ");
		nomeCliente = scan.nextLine();
		
		scan.nextLine();
		
		System.out.println("Saldo da conta:");
		saldo = new BigDecimal(scan.nextLine());
		
		System.out.println("Ol�, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� dispon�vel para saque");
		
		scan.close();
	}
}
