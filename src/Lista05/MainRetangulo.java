package Lista05;

import java.util.Scanner;

public class MainRetangulo {

	public static void main(String[] args) {

		Retangulo retangulo = null;
		Scanner sc = new Scanner(System.in);
		boolean test = true;

		do {
			System.out.println("***  Selecione uma op��o  ***");
			System.out.println("*    0 - Sair               *");
			System.out.println("*    1 - Criar Ret�ngulo    *");
			System.out.println("*    2 - Calcular �rea      *");
			System.out.println("*   3 - Calcular Per�metro  *");
			System.out.println("*****************************");

			int opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				sc.nextLine();
				System.out.println("Digite o valor da base do ret�ngulo");
				int base = sc.nextInt();
				System.out.println("Digite o valor da altura do ret�ngulo");
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
				System.out.println("Op��o Invalida, tente novamente:");
				break;
			}
		}while(test);
	}
}
