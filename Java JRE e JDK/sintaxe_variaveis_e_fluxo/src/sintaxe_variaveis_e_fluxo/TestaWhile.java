package sintaxe_variaveis_e_fluxo;

public class TestaWhile {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 10) {
			
			System.out.println(contador);
			
			// também funciona -> ++contador;
			
			contador += 1; 
			

		}
		
		System.out.println(contador);
	
	}
}
