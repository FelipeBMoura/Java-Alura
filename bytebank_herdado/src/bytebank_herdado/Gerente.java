package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da classe Funcionario, e assina o contrato autenticavel, e é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacação do Gerente");		
		return super.getSalario(); // super significa que o atributo pertence a classe mãe (que neste caso é a classe Funcionario)
	}

	@Override
	public void setSenha(int senha) {		
		this.autenticador.setSenha(senha);	
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);		
	}
	
	
}
