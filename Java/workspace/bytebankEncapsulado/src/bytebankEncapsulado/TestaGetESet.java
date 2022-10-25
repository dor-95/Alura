package bytebankEncapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(2222, 444444);
		Cliente cliente = new Cliente();
		
		conta.setTitular(cliente);
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Paulo Silveira");
		conta.getTitular().setCpf("222.222.222-22");
		conta.getTitular().setProfissao("Desenvolvedor");
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		
		//agora em duas linhas...
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("testando");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getNumero());
		
	}

}
