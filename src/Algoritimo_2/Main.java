package Algoritimo_2;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero inteiro!");
		Integer num1 = scanner.nextInt();

		System.out.println("Digite o segundo n�mero inteiro!");
		Integer num2 = scanner.nextInt();

		System.out.println("Digite o terceiro n�mero inteiro!");
		Integer num3 = scanner.nextInt();

		if (num1>num2) {
			System.out.println("Legal, " + num1 + " foi o maior n�mero que voce digitou!");
		}else if (num2>num3) {
			System.out.println("Legal, " + num2 + " foi o maior n�mero que voce digitou!");
		}else {
			System.out.println("Legal " + num3 + " foi o maior n�mero que voce digitou!");
		}			


	}

}


