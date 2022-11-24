package bytebank_herdado;

public class Gerente extends Funcionario{ //o "extends" é o camndo para Gerente herdadar Funcionario
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacação do Gerente");		
		return super.getSalario(); // super significa que o atributo pertence a classe mãe (que neste caso é a classe Funcionario)
	}
	
	
}
