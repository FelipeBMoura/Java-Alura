
public class TesteSacaNegativos {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		
		System.out.println(conta.saca(101));
		
		// o código abaixo é má prática, em razão de não observar o encapsulamento
		
		// conta.saldo = conta.saldo - 101; daria valor negativo. Se fosse invocado pelo método saca(), isso não aconteceria.
		
		System.out.println(conta.getSaldo());
		
	}

}
