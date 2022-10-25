package bytebankEncapsulado;

public class TestaStatic {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(152, 25899);
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getSaldo());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getProfissao());
		
		conta.setTitular(cliente);
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Lucas B");
		conta.getTitular().setCpf("222.222.222-22");
		conta.getTitular().setProfissao("Engenheiro");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getProfissao());
		
		Conta conta2 = new Conta(152, 99999);
		conta2.setTitular(cliente);
		System.out.println(conta2.getTitular().getNome());
		
		Conta conta3 = new Conta(1,1);
		
		System.out.println(Conta.getConta());
		
		
	}

}
