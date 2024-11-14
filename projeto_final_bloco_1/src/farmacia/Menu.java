package farmacia;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("|-----------------------------------------------------|");
			System.out.println("|                  Farmácia                           |");
			System.out.println("|-----------------------------------------------------|");
			System.out.println("|                                                     |");
			System.out.println("|            1 - Cadastrar                            |");
			System.out.println("|            2 - Listar                               |");
			System.out.println("|            3 - Deletar                              |");
			System.out.println("|            4 - Atualizar informações                |");
			System.out.println("|            5 - Fazer Pedido                         |");
			System.out.println("|            6 - Sair                                 |");
			System.out.println("|                                                     |");
			System.out.println("|_____________________________________________________|");
			System.out.println("\nEntre com a opção desejada:");

			do {
				opcao = sc.nextInt();
			} while (opcao <= 0 && opcao > 9);

			switch (opcao) {
			case 6:
				System.out.println("\nObrigado por pedir conosco! Volte Sempre...");
				sc.close();
				System.exit(0);
				break;
			case 1:
				System.out.println("\nCadastramento...");
				break;
			case 2:
				System.out.println("\nListagem...");
				break;
			case 3:
				System.out.println("\nDeletamento...");
				break;
			case 4:
				System.out.println("\nAtualizar Informações...");
				break;
			case 5:
				System.out.println("\nFazer Pedido...");
				break;
			}
		}
	}
}
