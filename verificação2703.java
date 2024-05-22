package estruturaCondicional;

import java.util.Scanner;

public class verificação2703 {

	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o número:");
		numero= ler.nextInt();

		if (numero> 0) {
			System.out.println("O número é positivo");
		}
		else if (numero ==0) {
			System.out.println("O número é zero");
		}
		else{
			System.out.println("O número é negativo");

		}
		ler.close();


	}

}
