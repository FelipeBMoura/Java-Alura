package bytebank_herdado;

public abstract interface Autenticavel { //Interface não tem métodos concretos, somente abstratos

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
