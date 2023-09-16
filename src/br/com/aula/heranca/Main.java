package br.com.aula.heranca;

import br.com.aula.heranca.model.CarroGasolina;

public class Main {
	public static void main(String[] args) {
		CarroGasolina carroGasolina = new CarroGasolina();
		carroGasolina.ligarcarro();
		carroGasolina.acelararcarro();
		carroGasolina.setCor("Branco");
		System.out.println(carroGasolina.toString());

	}
}
