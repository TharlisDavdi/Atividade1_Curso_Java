package Algoritimo_3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro!");
		Integer numero = scanner.nextInt();
		if(numero % 2 == 0) {//O % tras o resto da divis�o.
			System.out.println("� par");
		}else {
			System.out.println("� impar");
		}
	}

}
