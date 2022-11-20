package bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		
		// uma variável mais genérica, pode indicada do lado esquerdo. Neste exemplo, todo Gerente é um Funcionário.
		// o inverso não funcionaria
		// Funcionario g1 = new Gerente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		
		f.setSalario(2000.0);
		
		EditorVideo ev = new EditorVideo();
		
		f.setSalario(2500.0);
		
		Designer d = new Designer();
		
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		
		controle.registra(f);
		
		controle.registra(ev);
		
		controle.registra(d);
		
		System.out.println(controle.getSoma());

	}

}
