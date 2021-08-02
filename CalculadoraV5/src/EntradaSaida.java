import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitaOperacao() {
		
		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opera��o deseja: \n"
				+ "1- Soma\n"
				+ "2- Subtra��o\n"
				+ "3- Multiplica��o\n"
				+ "4- Divis�o\n"));
		
		return operacao;
	}
	
	public static double solicitaNumero(String ordem) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ordem+" n�mero"));
		return num;
	}
	
	public static void mostraResultado(double resultado, int operacao) {
		String op="";
		if(operacao==1) {
			op="soma";
		}else if(operacao==2) {
			op="subta��o";
		}else if(operacao==3) {
			op="multiplicao";
		}else {
			op="divis�o";
		}
		JOptionPane.showMessageDialog(null,"O resultado da "+op+" �: "+resultado);
	}
	
}
