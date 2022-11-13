
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//agora em 2 linhas
		
		Cliente titularDaConta = conta.getTitular();
		
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		
		System.out.println(paulo);
		
		System.out.println(conta.getTitular());
		
	}

}
