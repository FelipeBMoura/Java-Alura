package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		
		String nome = "Alura"; // object literal
		
		// String outro = new String("Alura") -> Funciona, mas é considerado má prática
		
		char c = 'A'; // char é apenar um caracter, com aspas simples. String é sequência de caracter, com aspas duplas.
		
		String outra = nome.replace("A", "a");
		
		String outra2 = nome.toUpperCase();
		
		char d = nome.charAt(0);// mostra o caracter da posição escolhida
		System.out.println(d);
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(outra2);
		
		int pos = nome.indexOf("ur");
		
		System.out.println(pos);
		
		String sub = nome.substring(1);
		
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = "";
		
		System.out.println(vazio.isEmpty());
		
		String com_espaco = " ".trim(); // a função trim() retira todos os espaços vazios		
		System.out.println(com_espaco.isEmpty());
		
		String teste = "    Alura    ";
		System.out.println(teste.contains("Alu"));
		
		
		
	}

}
