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
			System.out.println("|            1 - Cadastrar Cliente                    |");
			System.out.println("|            2 - Listar Cliente                       |");
			System.out.println("|            3 - Deletar Cliente                      |");
			System.out.println("|            4 - Cadastrar Remédio                    |");
			System.out.println("|            5 - Listar Remédio                       |");
			System.out.println("|            6 - Atualizar informações                |");
			System.out.println("|            7 - Deletar Remédio                      |");
			System.out.println("|            8 - Fazer Pedido                         |");
			System.out.println("|            9 - Sair                                 |");
			System.out.println("|                                                     |");
			System.out.println("|_____________________________________________________|");
			System.out.println("\nEntre com a opção desejada:");

			opcao = sc.nextInt();

			switch (opcao) {
			case 9:
				System.out.println("\nObrigado por pedir conosco! Volte Sempre...");
				sc.close();
				System.exit(0);
				break;
			case 1:
				System.out.println("\nCadastro de cliente...");
				break;
			case 2:
				System.out.println("\nListar Clientes...");
				break;
			case 3:
				System.out.println("\nDeletar Cliente...");
				break;
			case 4:
				System.out.println("\nCadastrar Remédio...");
				break;
			case 5:
				System.out.println("\nListar Remédio...");
				break;
			case 6:
				System.out.println("\nAtualizar Informações...");
				break;
			case 7:
				System.out.println("\nDeletar Remédio...");
				break;
			case 8:
				System.out.println("\nFazer Pedido...");
				break;
			}
		}
	}
}
