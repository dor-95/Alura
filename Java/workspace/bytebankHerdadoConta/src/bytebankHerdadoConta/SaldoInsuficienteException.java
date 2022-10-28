package bytebankHerdadoConta;

//public class SaldoInsuficienteException extends RuntimeException {
public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg){
		super(msg);		
	}

}
