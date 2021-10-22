package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Imc;

public class Tela {

	public void criarTela() {

		// Minhas Fontes da Tela
		Font fontTitle = new Font("Arial Black", Font.BOLD, 30);
		Font fontSubTitle = new Font("Arial Black", Font.PLAIN, 20);
		Font fontResultados = new Font("Arial", Font.PLAIN, 20);

		// Cores da Minha Tela
		Color blue = new Color(69, 32, 214);
		Color black = new Color(000);
		Color green = new Color(137, 227, 68);

		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(420, 525);
		minhaTela.setTitle("Cálculo de IMC");
		minhaTela.setLayout(null);

		JLabel lblTiulo = new JLabel();
		lblTiulo.setText("Cálculo de IMC");
		lblTiulo.setBounds(20, 20, 300, 30);
		lblTiulo.setFont(fontTitle);
		lblTiulo.setForeground(blue);

		JLabel lblDigiteSeuPeso = new JLabel();
		lblDigiteSeuPeso.setText("Seu Peso (Kg):");
		lblDigiteSeuPeso.setBounds(20, 80, 90, 30);

		JTextField txtDigiteSeuPeso = new JTextField();
		txtDigiteSeuPeso.setBounds(110, 80, 80, 30);
		txtDigiteSeuPeso.getText();

		JLabel lblDigiteSuaAltura = new JLabel();
		lblDigiteSuaAltura.setText("Sua Altura (m):");
		lblDigiteSuaAltura.setBounds(20, 120, 90, 30);

		JTextField txtDigiteSuaAltura = new JTextField();
		txtDigiteSuaAltura.setBounds(110, 120, 80, 30);
		txtDigiteSuaAltura.getText();

		JButton btnCalcular = new JButton();
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(37, 160, 120, 50);

		JLabel lblResultados = new JLabel();
		lblResultados.setText("Resultados:");
		lblResultados.setBounds(20, 250, 150, 30);
		lblResultados.setFont(fontSubTitle);
		lblResultados.setForeground(black);

		JLabel lblValorImc = new JLabel();
		lblValorImc.setText("Valor IMC:");
		lblValorImc.setBounds(20, 300, 70, 30);

		JLabel lblResultadoImc = new JLabel();
		lblResultadoImc.setText("00.0");
		lblResultadoImc.setBounds(125, 300, 300, 30);
		lblResultadoImc.setFont(fontResultados);
		lblResultadoImc.setForeground(green);

		JLabel lblEstadoImc = new JLabel();
		lblEstadoImc.setText("Estado IMC:");
		lblEstadoImc.setBounds(20, 340, 70, 30);

		JLabel lblResultadoEstado = new JLabel();
		lblResultadoEstado.setText("Status");
		lblResultadoEstado.setBounds(125, 340, 300, 20);
		lblResultadoEstado.setFont(fontResultados);
		lblResultadoEstado.setForeground(green);

		minhaTela.getContentPane().add(lblTiulo);
		minhaTela.getContentPane().add(lblDigiteSeuPeso);
		minhaTela.getContentPane().add(lblDigiteSuaAltura);
		minhaTela.getContentPane().add(txtDigiteSeuPeso);
		minhaTela.getContentPane().add(txtDigiteSuaAltura);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(lblResultados);
		minhaTela.getContentPane().add(lblValorImc);
		minhaTela.getContentPane().add(lblEstadoImc);
		minhaTela.getContentPane().add(lblResultadoImc);
		minhaTela.getContentPane().add(lblResultadoEstado);

		minhaTela.setVisible(true);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String stringPeso = txtDigiteSeuPeso.getText();
				double peso = Double.parseDouble(stringPeso);

				String stringAltura = txtDigiteSuaAltura.getText();
				double altura = Double.parseDouble(stringAltura);

				Imc calculo = new Imc();
				double imc = calculo.calcularImc(altura, peso);
				calculo.obterStatus(imc);
				lblResultadoEstado.setText((calculo.getStatus()));
				lblResultadoImc.setText(Double.toString(imc));
			}
		});

	}
}