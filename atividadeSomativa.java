package estruturaCondicional;

import java.util.Scanner;

public class atividadeSomativa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);				
	double primeiranota,segundanota,terceiranota,quartanota,media;

		System.out.println("Digite a primeira nota");
		primeiranota = ler.nextInt();
		
		System.out.println("Digite a segunda nota");
		segundanota = ler.nextInt();
		
		System.out.println("Digite a terceira nota");
		terceiranota = ler.nextInt();
		
		System.out.println("Digite a quarta nota");
		quartanota = ler.nextInt();

		media = (primeiranota+segundanota+terceiranota+quartanota)/4;
		System.out.println ("A media do aluno é" + media);

		if(media >= 6) {
			System.out.println("Aprovado");

		}
		else if(media <= 6) {
			System.out.println ("Reprovado");

			
			}

		
		ler.close();



	}

}