package java_pilha;

public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}

//Jeito antigo de fazer a conexão. Acima está a maneira mais nova e com menos código.
//----------------------------------------
//		Conexao con = null;		
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		}finally {
//			System.out.println("finaly");
//			con.fecha();
//		}
	}

}
