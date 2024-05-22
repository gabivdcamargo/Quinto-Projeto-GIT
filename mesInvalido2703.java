package estruturaCondicional;

import java.util.Scanner;

public class mesInvalido2703 {

	public static void main(String[] args) {
		int Mês;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o mês:");
		Mês= ler.nextInt();

		if (Mês ==1) {
			System.out.println("O mês é Janeiro");

		}

		if(Mês == 2) {
			System.out.println ("O mês é Fevereiro");
		}
		else if(Mês == 3) {
			System.out.println ("O mês é Março");
		}
		else if(Mês == 4) {
			System.out.println ("O mês é Abril");
		}

		else if(Mês == 5) {
			System.out.println ("O mês é Maio");
		}
		else if(Mês == 6) {
			System.out.println ("O mês é Junho");
		}
		else if(Mês == 7) {
			System.out.println ("O mês é Julho");
		}
		else if(Mês == 8) {
			System.out.println ("O mês é Agosto");
		}
		else if(Mês == 9) {
			System.out.println ("O mês é Setembro");
		}
		else if(Mês == 10) {
			System.out.println ("O mês é Outubro");
		}
		else if(Mês == 11) {
			System.out.println ("O mês é Novembro");
		}
		else if(Mês == 12) {
			System.out.println ("O mês é Dezembro");
		}

		else {
			System.out.println("O mês é invalido");

		}
		ler.close();
	}
}