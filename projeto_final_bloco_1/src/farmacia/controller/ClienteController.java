package farmacia.controller;

import java.util.ArrayList;

import farmacia.model.Cliente;
import farmacia.repository.ClienteRepository;

public class ClienteController implements ClienteRepository {

	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

	@Override
	public void listarTodos() {
		for (var cliente : listaCliente) {
			cliente.visualizar();
		}
	}

	@Override
	public void cadastrar(Cliente cliente) {
		listaCliente.add(cliente); 
		System.out.println("\nCliente cadastrado com sucesso!!");

	}

	@Override
	public void atualizar(Cliente cliente) {
		var buscarCliente = buscarNaCollection(cliente.getCpf());

		if (buscarCliente != null) {
			listaCliente.set(listaCliente.indexOf(buscarCliente), cliente);
			System.out.println("\n\nO Cliente: " + cliente.getNome() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\n\nO Cliente: " + cliente.getNome() + " não foi encontrado!");
		}

	}

	@Override
	public void deletar(String cpf) {
		var cliente = buscarNaCollection(cpf);

		if (cliente != null) {
			if (listaCliente.remove(cliente) == true) {
				System.out.println("\nO Cliente: " + cliente.getNome() + " foi deletado com sucesso!");
			}
		} else {
			System.out.println("\nO Cliente: " + cliente.getNome() + " não foi encontrado!");
		}

	}

	@Override
	public void buscarCpf(String cpf) {
		var cliente = buscarNaCollection(cpf);

		if (cliente != null) {
			cliente.visualizar();
		} else {
			System.out.println("\nO Cliente: " + cliente.getNome() + " não foi encontrado!");
		}

	}

	public Cliente buscarNaCollection(String cpf) {
		for (var cliente : listaCliente) {
			if (cliente.getCpf() == cpf) {
				return cliente;
			}
		}
		return null;
	}

}
