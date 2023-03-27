
import javax.swing.JOptionPane;

public class Conversor extends ConversorGeral {

	public static void main(String[] args) {

		while (true) {

			String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE,
					null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha").toString();

			switch (opcao) {

			case "Conversor de Moeda":

				String input = JOptionPane.showInputDialog("Insira um valor: ");

				if (checar(input)) {
					double valorRecebido = Double.parseDouble(input);

					String moeda = (JOptionPane.showInputDialog(null,
							"Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas",
							JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
									"De Reais a Yens", "De Reais a Wons", "De Dólares a Reais", "De Euros a Reais",
									"De Libras a Reais" },
							"Escolha")).toString();
					switch (moeda) {
					case "De Reais a Dólares":
						converteRD(valorRecebido);
						break;
					case "De Reais a Euros":
						converteRE(valorRecebido);
						break;
					case "De Reais a Libras":
						converteRL(valorRecebido);
						break;
					case "De Reais a Yens":
						converteRY(valorRecebido);
						break;
					case "De Reais a Wons":
						converteRW(valorRecebido);
						break;
					case "De Dólares a Reais":
						converteDR(valorRecebido);
						break;
					case "De Euros a Reais":
						converteER(valorRecebido);
						break;
					case "De Libras a Reais":
						converteLR(valorRecebido);
						break;
					default:
						JOptionPane.showInputDialog("Valor invalido");
					}

					int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if (JOptionPane.OK_OPTION == resposta) {
						JOptionPane.showInputDialog("Escolha opção Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			case "Conversor de Temperatura":

				input = JOptionPane.showInputDialog("Insira a temperatura: ");

				if (checar(input)) {
					double temperaturaRecebida = Double.parseDouble(input);
					String temp = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Temperatura",
							JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Graus Celsius a Kelvin", "Graus Celsius a Fahrenheit",
									"Kelvin a Graus Celsius", "Kelvin a Graus Fahrenheit", "Graus Fahrenheit a Kelvin",
									"Graus Fahrenheit a Celsius" },
							"Escolha")).toString();
					switch (temp) {
					case "Graus Celsius a Kelvin":
						converteCK(temperaturaRecebida);
						break;
					case "Graus Celsius a Fahrenheit":
						converteCF(temperaturaRecebida);
						break;
					case "Kelvin a Graus Celsius":
						converteKC(temperaturaRecebida);
						break;
					case "Kelvin a Graus Fahrenheit":
						converteKF(temperaturaRecebida);
						break;
					case "Graus Fahrenheit a Kelvin":
						converteFK(temperaturaRecebida);
						break;
					case "Graus Fahrenheit a Celsius":
						converteFC(temperaturaRecebida);
						break;
					default:
						JOptionPane.showInputDialog("Temperatura invalida");
						break;
					}
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if (JOptionPane.OK_OPTION == resposta) {
						System.out.println("Escolha opção Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}

		}
	}

	public static boolean checar(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
