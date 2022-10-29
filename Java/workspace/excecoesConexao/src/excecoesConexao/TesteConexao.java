package excecoesConexao;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		/*
		 * metodo try simplicidado, necessario implementar interface AutoCloseable
		 */
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
		
		/*
		 * Codigo legado****
		 * 
		 * Conexao con = null;
		 * try { 
		 * 		con = new Conexao(); 
		 * 		con.leDados(); 
		 * } catch(IllegalStateException ex) {
		 * 		System.out.println("Deu erro na conexao"); 
		 * } finally {
		 * 		System.out.println("finally"); 
		 * 		if(con != null) 
		 * 			con.fecha();
		 * 
		 * }
		 */
		
		
	}

}
