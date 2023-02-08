package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		
		 Set<String> alunos = new HashSet<>();
		 
		 alunos.add("Rorigo Silva");
		 alunos.add("Felipe Oliveira");
		 alunos.add("Karina Garcia");
		 alunos.add("Antonella Pereira");
		 
		 System.out.println(alunos.size());
		 
		 alunos.add("Antonella Pereira");
		 
		 System.out.println(alunos.size());

	}

}
