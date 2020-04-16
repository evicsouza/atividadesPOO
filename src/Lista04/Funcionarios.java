package Lista04;

import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de funcionários: ");
		int qtde = sc.nextInt();

		String funcionarios [] = new String[qtde];
		double salarios [] = new double[qtde];

		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("Informe o nome do funcionario: ");
			funcionarios[i] = sc.nextLine();
			for (int j = 0; j < salarios.length; j++) {
				System.out.println("Informe o salario do funcionario: ");
				salarios[j] = sc.nextDouble();

			}
		}
	}
}
