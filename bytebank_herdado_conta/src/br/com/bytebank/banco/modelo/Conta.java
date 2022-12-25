package br.com.bytebank.banco.modelo;

public abstract class Conta {
	protected double saldo; //protected quer dizer que é público para os filhos
	private int agencia; //private é utilizado para encapsular atributos.
	private int numero;
	private Cliente titular;
	//static quer dizer que o total faz parte da classe Conta, e não de cada objeto criado
	//por isso as variáveis ficam em itálico
	private static int total = 0; 
	
	//Construtor que o java chama automaticamente
	//Não é obrigatório escreve-lo
	//Mas pode ser efeito e editá-lo
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("o total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;		
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("não pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor ou igual a zero.");
			return; //como tem o void pode returnar nada
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	// para que o total possa ser acessado encapsulado
	// static quer dizer que é da classe, então não precisa mais instanciar para acessar
	// neste caso, poderíamos chamar assim -> Conta.getTotal()
	// dentro do método estático, o this não é acessível
	public static int getTotal() {
		return Conta.total;
	}
	
}