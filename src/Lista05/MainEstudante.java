package Lista05;

import java.util.Scanner;

public class MainEstudante {

	public static void main(String[] args) {

		Estudante estudante = null;
		Scanner sc = new Scanner(System.in);
		boolean test = true;

		do {
			System.out.println("*** Selecione uma op��o ***");
			System.out.println("*   0 - Sair              *");
			System.out.println("*   1 - Criar Estudante   *");
			System.out.println("*   2 - Calcular Media    *");
			System.out.println("*   3 - Obter Matricula   *");
			System.out.println("*   4 - Obter Endere�o    *");
			System.out.println("***************************");

			int opcao = sc.nextInt();
			switch (opcao) {

			case 1:
				sc.nextLine();
				System.out.println("Digite o nome do aluno");
				String nome = sc.nextLine();
				System.out.println("Digite a matricula do aluno");
				String matricula = sc.nextLine();
				System.out.println("Digite o endere�o do aluno");
				String endereco = sc.nextLine();
				double[] notas = new double[4];
				for(int i = 0; i<4; i++) {
					System.out.println("Digite a " + (i+1) + "� nota");
					notas[i] = sc.nextDouble();
				}
				estudante = new Estudante(nome, matricula, endereco, notas);
				break;

			case 2:
				if(estudante != null) {
					System.out.println(estudante.calcularMedia());
				}
				break;

			case 3:
				if(estudante != null) {
					System.out.println(estudante.getMatricula());
				}
				break;

			case 4:
				if(estudante != null) {
					System.out.println(estudante.getEndereco());
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