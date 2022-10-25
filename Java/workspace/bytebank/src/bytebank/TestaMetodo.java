package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		System.out.println(contaDoPaulo.saca(200));
		System.out.println(contaDoPaulo.saldo);
		
		System.out.println(contaDoPaulo.saca(20));
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		
		System.out.println("Conta do Paulo - Saldo: R$ " + contaDoPaulo.saldo);
		System.out.println("Conta da Marcela - Saldo: R$ " + contaDaMarcela.saldo + "\n");
		
		System.out.println("Resultado da Operação: " + contaDoPaulo.transfere(500, contaDaMarcela));
		
		System.out.println("Conta do Paulo - Saldo: R$ " + contaDoPaulo.saldo);
		System.out.println("Conta da Marcela - Saldo: R$ " + contaDaMarcela.saldo);
		
		if(contaDaMarcela.transfere(1000, contaDoPaulo)) {
			System.out.println("\n\nTranferencia realizada com sucesso.");
		} else {
			System.out.println("\n\nFalha na transferencia.");
		}
		
		System.out.println("Conta do Paulo - Saldo: R$ " + contaDoPaulo.saldo);
		System.out.println("Conta da Marcela - Saldo: R$ " + contaDaMarcela.saldo + "\n");
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
		
	}

}
