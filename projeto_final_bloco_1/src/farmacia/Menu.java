package farmacia;

import java.util.Scanner;

import farmacia.controller.ClienteController;
import farmacia.controller.RemedioController;
import farmacia.model.Cliente;
import farmacia.model.Remedio;

public class Menu {

	public static void main(String[] args) {

		ClienteController clienteC = new ClienteController();
		RemedioController remedioC = new RemedioController();

		Scanner sc = new Scanner(System.in);

		String nome, cpf, telefone, endereco, dataValidade;
		int opcao = 0, idade;

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

				switch (escolher(sc)) {
				case 1 -> {
					System.out.println("Cadastrar Cliente:");
					System.out.print("Nome: ");
					sc.skip("\\R?");
					nome = sc.nextLine();
					System.out.print("CPF: ");
					cpf = sc.nextLine();
					System.out.print("Telefone: ");
					telefone = sc.nextLine();
					System.out.print("Endereço: ");
					endereco = sc.nextLine();
					System.out.print("Idade: ");
					idade = sc.nextInt();

					Cliente cliente = new Cliente(nome, cpf, telefone, endereco, idade);
					clienteC.cadastrar(cliente);

				}
				case 2 -> {
					System.out.println("Cadastrar Remédio:");
					System.out.print("Nome: ");
					sc.skip("\\R?");
					nome = sc.nextLine();
					System.out.println("Data de validade:");
					dataValidade = sc.nextLine();
					Remedio remedio = new Remedio(nome, remedioC.gerarNumero(), dataValidade);
					remedioC.cadastrar(remedio);
				}
				}
				break;
			case 2:
				System.out.println("\nListagem...");
				switch (escolher(sc)) {
				case 1 -> clienteC.listarTodos();
				case 2 -> remedioC.listarTodos();
				}
				break; 
			case 3:
				System.out.println("\nDeletamento...");

				switch (escolher(sc)) {
				case 1 -> {
					System.out.println("Digite o CPF:");
					sc.skip("\\R?");
					cpf = sc.nextLine();
					clienteC.deletar(cpf);
				}
				case 2 -> {
					System.out.println("Digite o Código:");
					int codigo = sc.nextInt();
				}
				}

				break;
			case 4:
				System.out.println("\nAtualizar Informações...");

				switch (escolher(sc)) {
				case 1 -> {
					System.out.println("Atualizar Cliente:");
					System.out.print("Nome: ");
					sc.skip("\\R?");
					nome = sc.nextLine();
					System.out.print("CPF: ");
					cpf = sc.nextLine();
					System.out.print("Telefone: ");
					telefone = sc.nextLine();
					System.out.print("Endereço: ");
					endereco = sc.nextLine();
					System.out.print("Idade: ");
					idade = sc.nextInt();

					Cliente clienteAtualizado = new Cliente(nome, cpf, telefone, endereco, idade);
					clienteC.atualizar(clienteAtualizado);

				}
				case 2 -> {
					System.out.println("Atualizar Remédio:");
					System.out.print("Nome: ");
					sc.skip("\\R?");
					nome = sc.nextLine();
					System.out.println("Data de validade:");
					dataValidade = sc.nextLine();
					Remedio remedioAtualizado = new Remedio(nome, remedioC.gerarNumero(), dataValidade);
					remedioC.atualizar(remedioAtualizado);
				}
				}
				break;
			case 5:
				System.out.println("\nFazer Pedido...");
				break;
			}
		}

	}

	public static int escolher(Scanner sc) {

		System.out.println("\nQual opção você quer cadastrar/atualizar? ");
		System.out.println("[1] - Cliente");
		System.out.println("[2] - Remédio");
		System.out.println("--------------");
		int opcao = sc.nextInt();

		return opcao;
	}
}
