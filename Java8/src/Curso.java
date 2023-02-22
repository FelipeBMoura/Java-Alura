import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Curso {
	private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }   
    
    public static void main(String[] args) {
    	List<Curso> cursos = new ArrayList<Curso>();
    	cursos.add(new Curso("Python", 45));
    	cursos.add(new Curso("JavaScript", 150));
    	cursos.add(new Curso("Java 8", 113));
    	cursos.add(new Curso("C", 55));
    	
//    	cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
    	
    	cursos.sort(Comparator.comparingInt(Curso::getAlunos));
    	
//    	Stream<Curso> streamDeCurso = cursos.stream();
    	
    	// modificações em um stream não modificam a coleção/objeto que o gerou
//    	Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 100);
    	
//    	cursos.forEach(c -> System.out.println(c.getNome()));
    	
    	// Para imprimir os cursos filtrados, usamos o forEach que existe em Stream
//    	streamDeCurso.forEach(c -> System.out.println(c.getNome()));
    	
    	// Mesmo código, eliminando a variável temporária
//    	cursos.stream().filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getNome()));
    	
    	// Com melhor legibilidade
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 100)
    	   .forEach(c -> System.out.println(c.getNome()));
    	
    	// Devolvendo os inteiros
    	cursos.stream()
    	   .filter(c -> c.getAlunos() > 100)
    	   .map(Curso::getAlunos)
    	   .forEach(System.out::println);
    	
    	
//    	IntStream stream = cursos.stream()
//    			   .filter(c -> c.getAlunos() > 100)
//    			   .mapToInt(Curso::getAlunos);
    	
    	int soma = cursos.stream()
    			   .filter(c -> c.getAlunos() > 100)
    			   .mapToInt(Curso::getAlunos)
    			   .sum();
    	
    	System.out.println(soma);
    }

}

