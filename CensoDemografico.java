package FACENS.Lista2;

import java.util.Scanner;

public class CensoDemografico {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int i, genero, idade = 0;
		int contF = 0, contM = 0, contO = 0;
		double altura, alturacontF = 0, idadecontM = 0, idadecontF = 0, idadecontO = 0;
		double percent = 0;

		for (i = 0; i <= 999; i++) {
			System.out.print("Selecione seu gênero:\n0 - Feminino\n1 - Masculino\n2 - Outros\nOpção: ");
			/*
			 * enquanto a entrada 'genero' for verdade, ele ira repetir a pergunta,
			 * fazendo com que  a resposta, quando errada, não faça parte da contagem do
			 * for
			 */
			while (true) {
				genero = sc.nextInt();
				if (genero < 0 || genero > 2) {
					System.out.println("Opção inválida");
					System.out.print("\nSelecione seu gênero:\n0 - Feminino\n1 - Masculino\n2 - Outros\nOpção: ");
					continue;// se for verdade, o continue jogará para o próximo comando
				}
				break;// perguntar de novo
			} // fim while

			System.out.print("Sua idade: ");
			idade = sc.nextInt();// recebe idade
			System.out.print("Sua altura: ");
			altura = sc.nextDouble();// recebe altura
			if (idade >= 18 && idade <= 35) {
				percent++;// vai contar +1 na variavel, sempre que alguem digitar que tem entre 18 e 35
			}
			
			switch (genero) {
			case 0:// 0 - feminino
				idadecontF += idade;// o contador idade vai receber contador idade + idade, pra sempre acrescentar a nova idade depois da repetição
				alturacontF += altura;// o contador altura vai receber contador altura + altura
				contF++;// contar numero de mulheres
				break;
			case 1:// 1 - masculino
				idadecontM += idade;
				contM++;// contas numero homens
				break;
			case 2:// 2 - outros
				idadecontO += idade;// idade das pessoas de gênero 'outros'
				contO++;// contar outros
				break;
			default:
				System.out.println("Opção inválida");
			}// fim switch
			System.out.println();// quebra linha
		} // fim for
		// a)media idade grupo
		System.out.printf("Media idade do grupo é de %.1f anos\n",(idadecontF + idadecontM + idadecontO) / (contF + contM + contO));
		// b media altura mulheres
		System.out.printf("Media altura mulheres: %.2f metros\n", (alturacontF / contF));
		// c)media idade homens
		System.out.printf("Media idade homens: %.1f anos\n", (idadecontM / contM));
		// d)quantidade pessoas 'outros'
		System.out.printf("A quantidade de pessoas do gênero 'outros': %d\n", contO);
		// e)percentual de pessoas com idade entre 18 e 35 anos
		System.out.printf("Percentual de pessoas entre 18 e 35 anos: %.2f", (percent / 1000) * 100);
		
		sc.close();
	}
}
