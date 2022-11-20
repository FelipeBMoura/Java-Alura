package bytebank_herdado;

public class Designer extends Funcionario{ //o "extends" é o camndo para EditorVideo herdadar Funcionario
	
	public double getBonificacao() {
		System.out.println("Chamando o método do bonificação do Designer");
		return 200;
	}
	
	
}
