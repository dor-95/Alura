package javaPilha;

public class FluxoComExcecao {
	
	public static void main(String[] args) throws MyException {
		System.out.println("Inicio do main");
		metodo1();
		
		  try { 
			  metodo1(); 
		  } catch(Exception ch) {
			  System.out.println("Exception");
			  System.out.println("Mensagem: " + ch.getMessage()); 
			  //ch.printStackTrace(); 
		  }
		 
		 
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MyException {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MyException{
		System.out.println("Inicio do metodo2");
		
		throw new ArithmeticException("deu ruim");		
		
		//throw new MyException("Meu teste");
		
		//System.out.println("Fim do metodo2");
	}
	
	
}
