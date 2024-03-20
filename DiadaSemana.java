package estruturaCondicional;

import java.util.Scanner;

public class DiadaSemana {

	public static void main(String[] args) {
		int Diadasemana;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o dia da semana:");
		Diadasemana= ler.nextInt();

		if (Diadasemana> 1-7) {
			System.out.println("O número é valido");
			
			 if(Diadasemana == 1-7) {
				System.out.println ("o número é seis");
			}

		}
		else {
			System.out.println("O número é invalido");

		}
		ler.close();



	}

}
