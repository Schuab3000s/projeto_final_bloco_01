package farmacia.repository;

import farmacia.model.Remedio;

public interface RemedioRepository extends FarmaciaRepository {

	public void cadastrar(Remedio remedio);

	public void atualizar(Remedio remedio);

	public void deletar(int codigo);

	public void buscarCodigo(int codigo);
}
