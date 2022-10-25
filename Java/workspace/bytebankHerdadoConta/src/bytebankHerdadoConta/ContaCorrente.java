package bytebankHerdadoConta;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.20;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor){
		this.saldo += valor;		
	}
	
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
		
}
