package sintaxeVariaveisFluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario;
		
		double salario2 = 1257.90;
		float valor2 = (float)salario2;
		
		System.out.println(valor);
		System.out.println(valor2);
		
		long numeroGrande = 13245646784L;
		short valorPequeno = 2131;
		byte b = 127;
		
		
		double valor1 = 0.2;
		double valor3 = 0.1;
		double total = valor1 + valor3;
		
		System.out.println(total);
		
		byte teste = 65;
		char teste2 = (char)teste;
		
		System.out.println(teste);
		System.out.println(teste2);
	}

}
