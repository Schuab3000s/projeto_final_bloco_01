package farmacia.model;

public class Remedio {

	private String nome;
	private int codigo;
	private String dataValidade;

	public Remedio(String nome, int codigo, String dataValidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void visualizar() {
		System.out.println("---> Dados da conta <---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("Validade: " + this.dataValidade);
		System.out.println("------------------------");
	}
}
