package br.com.aula.heranca.model;

public class Carro {
	int velocidade = 0;
	boolean ligado = false;
	String cor;

	public void acelararcarro() {
		this.velocidade++;
	}

	public void frearcarro() {
		if (this.velocidade > 1) {
			this.velocidade--;
		} else {
			this.velocidade = 0;
		}

	}

	public void ligarcarro() {
		if (!this.ligado) {
			this.ligado = true;

		}
	}
// Métodos de acesso
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro [velocidade=" + velocidade + ", ligado=" + ligado + ", cor=" + cor + ", getVelocidade()="
				+ getVelocidade() + ", isLigado()=" + isLigado() + ", getCor()=" + getCor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
