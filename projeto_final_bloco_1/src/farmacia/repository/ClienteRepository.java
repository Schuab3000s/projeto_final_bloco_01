package farmacia.repository;

import farmacia.model.Cliente;

public interface ClienteRepository extends FarmaciaRepository {

	public void cadastrar(Cliente cliente);

	public void atualizar(Cliente cliente);

	public void deletar(String cpf);

	public void buscarCpf(String cpf);
}
