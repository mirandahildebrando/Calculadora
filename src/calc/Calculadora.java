package calc;

import java.util.Scanner;

public class Calculadora extends Operacoes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Digite o primeiro numero: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double n2 = scanner.nextDouble();
		
		System.out.println("Escolha a operacao(+, -, *, /): ");
		char operacao = scanner.next().charAt(0);
		
		double resultado = 0;
		
		switch(operacao) {
		case '+':
			resultado = calculadora.somar(n1, n2);
			break;
			
		case'-':
			resultado = calculadora.subtrair(n1, n2);
			break;
		case '*':
			resultado = calculadora.multiplicar(n1, n2);
			break;
		case '/':
			resultado = calculadora.dividir(n1, n2);
			break;
		default:
			System.out.println("Operacao invalida!");
		}
		
		System.out.println("Resultado: " + resultado);

	}

}
