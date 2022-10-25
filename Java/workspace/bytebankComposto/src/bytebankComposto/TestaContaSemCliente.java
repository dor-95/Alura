package bytebankComposto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(100);
		System.out.println("Conta da Marcela -- Saldo: R$ " + contaDaMarcela.getSaldo() + "\n");
		
		System.out.println("Conta da Marcela -- Endereço: " + contaDaMarcela.titular + "\n");
		
		contaDaMarcela.titular = new Cliente();
		
		System.out.println("Conta da Marcela -- Endereço: " + contaDaMarcela.titular + "\n");
		
		System.out.println("Conta da Marcela -- Cliente: " + contaDaMarcela.titular.nome + "\n");
		
		contaDaMarcela.titular.nome = "Marcela Borges";
		
		System.out.println("Conta da Marcela -- Cliente: " + contaDaMarcela.titular.nome + "\n");
		
		
	}

}
