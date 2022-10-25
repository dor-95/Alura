package bytebankComposto;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Desenvolvedor";
		
		// Associa o cliente paulo a conta contaDoPaulo
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		System.out.println("Conta do Paulo -- Saldo: R$ " + contaDoPaulo.getSaldo() + "\n");
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome + "\n" +
						   contaDoPaulo.titular.cpf + "\n" +
						   contaDoPaulo.titular.profissao + "\n" +
						   contaDoPaulo.agencia + "\n" + 
						   contaDoPaulo.numero + "\n" + 
						   contaDoPaulo.getSaldo() + "\n");
		
		System.out.println(contaDoPaulo);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
	}

}
