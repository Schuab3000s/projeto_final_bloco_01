package farmacia.controller;

import java.util.ArrayList;

import farmacia.model.Remedio;
import farmacia.repository.RemedioRepository;

public class RemedioController implements RemedioRepository {

	private ArrayList<Remedio> listaRemedio = new ArrayList<Remedio>();
	int numero = 0;

	@Override
	public void listarTodos() {
		for (var remedio : listaRemedio) {
			remedio.visualizar(); 
		}
	}

	@Override
	public void cadastrar(Remedio remedio) {
		listaRemedio.add(remedio);
		System.out.println("\nRemédio cadastrado com sucesso!!");

	}

	@Override
	public void atualizar(Remedio remedio) {
		var buscarRemedio = buscarNaCollection(remedio.getCodigo());

		if (buscarRemedio != null) {
			listaRemedio.set(listaRemedio.indexOf(buscarRemedio), remedio);
			System.out.println("\n\nO Remedio: " + remedio.getNome() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\n\nO Remedio: " + remedio.getNome() + " não foi encontrado!");
		}

	}

	@Override
	public void deletar(int codigo) {
		var remedio = buscarNaCollection(codigo);

		if (remedio != null) {
			if (listaRemedio.remove(remedio) == true) {
				System.out.println("\nO Remédio: " + remedio.getNome() + " foi deletada com sucesso!");
			}
		} else {
			System.out.println("\nO Remédio: " + remedio.getNome() + " não foi encontrada!");
		}

	}

	@Override
	public void buscarCodigo(int codigo) {
		var remedio = buscarNaCollection(codigo);

		if (remedio != null) {
			remedio.visualizar();
		} else {
			System.out.println("\nO Remédio: " + remedio.getNome() + " não foi encontrado!");
		}

	}
	
	public int gerarNumero() {
		return ++numero;
	}

	public Remedio buscarNaCollection(int codigo) {
		for (var remedio : listaRemedio) {
			if (remedio.getCodigo() == codigo) {
				return remedio;
			}
		}
		return null;
	}
}
