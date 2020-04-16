package Lista05;

import java.util.Scanner;

public class MainCirculo {

	public static void main(String[] args) {

		Circulo circulo = null;
		Scanner sc = new Scanner(System.in);
		boolean test = true;

		do {
			System.out.println("***  Selecione uma opção  ***");
			System.out.println("*    0 - Sair               *");
			System.out.println("*    1 - Criar Circulo    *");
			System.out.println("*    2 - Calcular Área      *");
			System.out.println("*   3 - Calcular Perímetro  *");
			System.out.println("*****************************");

			int opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				sc.nextLine();
				System.out.println("Digite o valor do raio do circulo");
				int raio = sc.nextInt();
				circulo = new Circulo(raio);
				break;

			case 2:
				if(circulo != null) {
					System.out.println(circulo.calculaArea());
				}
				break;

			case 3:
				if(circulo != null) {
					System.out.println(circulo.calculaPerimetro());
				}
				break;

			case 0:
				test = false;
				break;

			default:
				System.out.println("Opção Invalida, tente novamente:");
				break;
			}
		}while(test);


	}

}
