import javax.swing.JOptionPane;

public class ConversorGeral {

	public static void converteRD(double valorRecebido) {
		double valorRD = valorRecebido / 5.25;
		valorRD = (double) Math.round(valorRD * 100d) / 100;
	    JOptionPane.showMessageDialog(null, "Você tem $ " + valorRD);
	}

	public static void converteRE(double valorRecebido) {
		double valorRE = valorRecebido / 5.63;
		valorRE = (double) Math.round(valorRE * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem € " + valorRE);
	}

	public static void converteRL(double valorRecebido) {
		double valorRL = valorRecebido / 6.38;
		valorRL = (double) Math.round(valorRL * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem £ " + valorRL);
	}

	public static void converteRY(double valorRecebido) {
		double valorRY = valorRecebido / 0.039;
		valorRY = (double) Math.round(valorRY * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem ¥ " + valorRY);
	}

	public static void converteRW(double valorRecebido) {
		double valorRW = valorRecebido / 0.0040;
		valorRW = (double) Math.round(valorRW * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem ₩ " + valorRW);
	}

	public static void converteDR(double valorRecebido) {
		double valorDR = valorRecebido * 5.25;
		valorDR = (double) Math.round(valorDR * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$  " + valorDR);
	}

	public static void converteER(double valorRecebido) {
		double valorER = valorRecebido * 5.63;
		valorER = (double) Math.round(valorER * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$  " + valorER);
	}

	public static void converteLR(double valorRecebido) {
		double valorLR = valorRecebido * 6.38;
		valorLR = (double) Math.round(valorLR * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem R$  " + valorLR);
	}
	
//	TEMPERATURAS
	
	public static void converteCK(double temperaturaRecebida) {
		double tempCK = temperaturaRecebida + 273.15;
		JOptionPane.showMessageDialog(null, "Temperatura final:" + tempCK + "K");
	}
	public static void converteCF(double temperaturaRecebida) {
		double tempCF = (temperaturaRecebida * 9 / 5) + 32;
		JOptionPane.showMessageDialog(null, "Temperatura final:" + tempCF + "ºF");
	}

	public static void converteKC(double temperaturaRecebida) {
		double tempKC = (temperaturaRecebida - 273.15);
		JOptionPane.showMessageDialog(null, "Temperatura final:" + tempKC + "ºC");
	}

	public static void converteKF(double temperaturaRecebida) {
		double tempKF = (temperaturaRecebida - 273.15) * 9 / 5 + 32;
		JOptionPane.showMessageDialog(null, "Temperatura final:" + tempKF + "ºF");
	}
	public static void converteFK(double temperaturaRecebida) {
		double tempFK = (temperaturaRecebida - 32) * 5 / 9 + 273.15;
		JOptionPane.showMessageDialog(null, "Temperatura final:" + tempFK + "K");
	}
	public static void converteFC(double temperaturaRecebida) {
		double tempFC = (temperaturaRecebida - 32) * 5 / 9;
		JOptionPane.showMessageDialog(null, "Temperatura final:" + tempFC + "ºC");
	}
	
	
	
	
	
	
}
