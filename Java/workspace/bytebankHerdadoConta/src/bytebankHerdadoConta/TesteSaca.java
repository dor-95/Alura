package bytebankHerdadoConta;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(222, 4444);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
		
	}

}
