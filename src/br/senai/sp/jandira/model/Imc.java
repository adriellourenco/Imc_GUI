package br.senai.sp.jandira.model;

public class Imc {

	private String status;

	public double calcularImc(double altura, double peso) {
		return peso / (altura * altura);
	}

	public void obterStatus(double imc) {
		if (imc < 18.5) {
			status = "Abaixo do Peso!";
		} else if (imc >= 18.5 && imc < 25.0) {
			status = "Peso Ideal! (Parabéns!)";
		} else if (imc >= 25.0 && imc < 30.0) {
			status = "Levemente Acima do Peso!";
		} else if (imc >= 30.0 && imc < 35.0) {
			status = "Obesidade Grau I!";
		} else if (imc >= 35.0 && imc < 40.0) {
			status = "Obesidade Grau II (Severa)!";
		} else {
			status = "Obesidade Grau III (Mórbida)!";
		}
	}

	public String getStatus() {
		return status;
	}
	
}
