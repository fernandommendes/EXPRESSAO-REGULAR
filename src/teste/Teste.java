package teste;

import java.util.Scanner;

/**
 * Expressões Regulares
 * @author Erix Morato
*/
public class Teste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nExpressões Regulares");
		
		expreg:
		while (true) {

			System.out.print("\nExpressão Regular: ");
			String expRegular = entrada.nextLine();
			
			if (expRegular.equalsIgnoreCase("§S")) break; // flag §S para sair do aplicativo
			
			String dado;
			while (true) {
				System.out.print("Dado: ");
				dado = entrada.nextLine();
				
				if (dado.equalsIgnoreCase("§E")) break; // flag §E para sair para testar outra exp. regular
				if (dado.equalsIgnoreCase("§S")) break expreg; // flag §S para sair do aplicativo
				
				System.out.println("Validação do dado: " + validarDados(expRegular, dado));
			}
		}
		
		System.out.println("\nFinal dos testes.");
		System.exit(0);
	}

	private static boolean validarDados(String expRegular, String dado) {
		
		try {
			return dado.matches(expRegular);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // Escrever o erro na expressão regular
			return false;
		}
		
	}
}
