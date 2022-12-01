package bytebank_herdado;

public class Cliente implements Autenticavel { //Implements implementa a interface

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		AutenticacaoUtil util = new AutenticacaoUtil();
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
