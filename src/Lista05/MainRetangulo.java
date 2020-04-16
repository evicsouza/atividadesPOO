package Lista05;

import java.util.Scanner;

public class MainRetangulo {

	public static void main(String[] args) {

		Retangulo retangulo = null;
		Scanner sc = new Scanner(System.in);
		boolean test = true;

		do {
			System.out.println("***  Selecione uma opção  ***");
			System.out.println("*    0 - Sair               *");
			System.out.println("*    1 - Criar Retângulo    *");
			System.out.println("*    2 - Calcular Área      *");
			System.out.println("*   3 - Calcular Perímetro  *");
			System.out.println("*****************************");

			int opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				sc.nextLine();
				System.out.println("Digite o valor da base do retângulo");
				int base = sc.nextInt();
				System.out.println("Digite o valor da altura do retângulo");
				int altura = sc.nextInt();
				retangulo = new Retangulo(base, altura);
				break;

			case 2:
				if(retangulo != null) {
					System.out.println(retangulo.calculaArea());
				}
				break;

			case 3:
				if(retangulo != null) {
					System.out.println(retangulo.calculaPerimetro());
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
