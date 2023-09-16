package br.com.aula.heranca.model;

public class PessoaFisica extends Pessoa {
	private String cpf;

	//Contrutores
	public PessoaFisica(String nome) {
		super(nome);

	}

	public PessoaFisica(String nome,String cpf) {
	super(nome);
	this.cpf= cpf;
	}		

	public String getcpf() {
		return cpf;
		
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
		
	}
}
