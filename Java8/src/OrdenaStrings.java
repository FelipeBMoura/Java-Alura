import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
//		Comparator<String> comparador = new ComparadorPorTamanho();	
		
//		Collections.sort(palavras, comparador);
		
//		palavras.sort(comparador);
		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
//		palavras.sort(Comparator.comparing(s -> s.length()));
		
		// Para ficar mais legível o lambda acima, a mesma função foi quebrada nas 3 linhas abaixo
		Function <String, Integer> funcao = s -> s.length(); // ou String::length ao invés de s -> s.length(
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}

//		Consumer<String> consumidor = null;
		
//		Consumer<String> consumidor = new ImprimeNaLinha();
		
//		palavras.forEach(consumidor);
		
//		Consumer<String> consumidor = new Consumer<String>() {
//			
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};
		
//		palavras.forEach(new Consumer<String>() {
//			
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});
		
//		palavras.forEach((String s) -> {
//				System.out.println(s);
//		});
		
		palavras.forEach(s -> System.out.println(s));
	}

}

//class ImprimeNaLinha implements Consumer<String>{
//	
//	@Override
//	public void accept(String s) {
//		System.out.println(s);;
//	}
//}

class ComparadorPorTamanho implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
}
