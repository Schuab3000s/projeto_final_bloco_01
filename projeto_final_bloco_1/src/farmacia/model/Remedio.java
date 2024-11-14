package farmacia.model;

import java.time.LocalDate;

public class Remedio {

	private String nome;
	private int codigo;
	private LocalDate dataValidade;

	public Remedio(String nome, int codigo, LocalDate dataValidade) {
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

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

}
