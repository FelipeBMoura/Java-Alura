package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
//		int[] idades = new int[5];
//		String[] names = new String[5];
		
		int idade = 29; //Integer
		
//		Integer idadeRef = new Integer(29); // No Java existe uma classe para cada tipo 

		Integer idadeRef = Integer.valueOf(29); //Jeito mais correto de chamar a referência. Autoboxing
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE); // Mostra o limite de valor a ser guardado
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // Unboxing
		
		String s = args[0];
		
//		Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
		
		System.out.println(numero); // Passing
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(29); // Autoboxing

	}

}
