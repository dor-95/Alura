package sintaxeVariaveisFluxo;

public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Voce n�o tem 18, mas pode entrar,"
					+ " pois est� acompanhado");
		} else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
		
	}

}
