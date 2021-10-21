package br.senai.sp.jandira.model;

public class Imc {
	
	private double imc;
	private String status;
	
	public void calcularImc(double altura, double peso) {
		imc = peso/(altura*altura);
}
	
	public double getImc() {
		return imc;
	}
	
	public void obterStatus(double imc) {
		if (imc<=18.5) {
			status = "Abaixo do Peso!";
		}
		else if (imc >= 18.6 && imc <= 24.9) {
			status = "Peso Ideal! (Parabéns!)";
		}
		else if (imc >= 25.0 && imc <= 29.9) {
			status = "Levemente Acima do Peso!";
		}
		else if (imc >= 30.0 && imc <= 34.9) {
			status = "Obesidade Grau I!";
		}
		else if (imc >= 35.0 && imc <= 39.9) {
			status = "Obesidade Grau II (Severa)!";
		}
		else if (imc > 40.0 ) {
			status = "Obesidade Grau III (Mórbida)!";
		}
	}
	
	public String getStatus() {
		return status;
	}
	
}
