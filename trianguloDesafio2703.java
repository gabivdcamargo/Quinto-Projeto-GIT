package estruturaCondicional;

import java.util.Scanner;

public class trianguloDesafio2703 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);{


			double lado1,lado2,lado3;;

			System.out.println("Informe o primeiro lado");

			lado1 = ler.nextInt();

			System.out.println("Informe o segundo lado");

			lado2 = ler.nextInt();

			System.out.println("Informe o terceira lado");

			lado3 = ler.nextInt();


			if (lado1 == lado2 && lado2 == lado3) {

				System.out.println("O triângulo é equilátero.");

			}

			else if (lado1 == lado2 && lado1 != lado3) {

				System.out.println("O triângulo é isósceles.");

			}

			else {

				System.out.println("O triângulo é escaleno.");

			}

			ler.close();

		}

	}



}




