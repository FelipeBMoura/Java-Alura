package bytebank_herdado;

public class EditorVideo extends Funcionario{ //o "extends" é o camndo para EditorVideo herdadar Funcionario
	
	public double getBonificacao() {
		System.out.println("Chamando o método do bonificação do editor de vídeo");
		return 150;
	}
	
	
}
