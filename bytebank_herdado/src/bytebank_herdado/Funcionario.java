package bytebank_herdado;

//abstract faz com que Funcionario não possa ser mais criado, já que é uma classe abstrata.
//somente as classes filhas podem ser criadas
//então não pode mais ser instanciada
public abstract class Funcionario { 
	
	private String nome;
	private String cpf;
	protected double salario; //protected significa que é público para as classes filhas
	
	//abstract no métod significa que é método sem corpo, sem implementação.
	//não pode ser instanciado
	//então implementa-se nas classes filhas
	public abstract double getBonificacao(); 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
