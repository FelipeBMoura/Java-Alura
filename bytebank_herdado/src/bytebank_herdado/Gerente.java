package bytebank_herdado;

//Gerente é um Funcionario, Gerente herda da classe Funcionario, e assina o contrato autenticavel, e é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacação do Gerente");		
		return super.getSalario(); // super significa que o atributo pertence a classe mãe (que neste caso é a classe Funcionario)
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
