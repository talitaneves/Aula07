import java.util.Scanner;

public class Calculadora {

	
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2 = 0;
		double soma, subtracao, divisao, multiplicacao;
		int opcao = 0;

		while (opcao != 6) {

			exibirMenu();

			opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\n\nDigite o 1� valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2� valor:");
				valor2 = leitor.nextDouble();

				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");

				break;
			case 2:
				System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
				double resultadoSoma = somar(valor1, valor2);
				imprimirResultado( resultadoSoma );
				break;
			case 3:
				System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
				double resultadoSub = subtrair(valor1, valor2);
				imprimirResultado( resultadoSub );
				break;
			case 4:
				System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
				double resultDiv = dividir(valor1, valor2);
				imprimirResultado( resultDiv );
				break;
			case 5:
				System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
				double resultMult = multiplicar(valor1, valor2);
				imprimirResultado( resultMult );
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}

		}
		leitor.close();

	}

	
	public static double somar(double valor1, double valor2 ) {
		return valor1 + valor2;
	}
	
	public static double subtrair(double valor1, double valor2 ) {
		return valor1 - valor2;
	}
	
	public static double multiplicar(double valor1, double valor2 ) {
		return valor1 * valor2;
	}

	public static double dividir(double denominador, double divisor) {
		if ( divisor == 0 ) {
			return 0;
		} else {
			double resultado = denominador / divisor;
			return resultado;
		}
	}
	
	
	public static void imprimirResultado(double valorResultado) {
		if ( valorResultado > 0 ) {
			System.out.println("O resultado � " + valorResultado + "!\n\n");
		} else if  (valorResultado > 100) {
			System.out.println("Ops !!! Temos uma poss�vel fraude!\n\n");
		} else {
			System.out.println("Erro! N�o foi poss�vel efetuar o c�lculo");
		}
	}

	public static void exibirMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua op��o!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtra��o");
		System.out.println("4 - Realizar divis�o");
		System.out.println("5 - Realizar multiplica��o");
		System.out.println("6 - Sair");
	}

}
