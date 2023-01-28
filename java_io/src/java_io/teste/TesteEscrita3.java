package java_io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo		
//		OutputStream fos = new FileOutputStream("lorem2.txt");		
//		Writer osw = new OutputStreamWriter(fos);		
//		BufferedWriter bw = new BufferedWriter(osw);		
		
//		FileWriter fw = new FileWriter("lorem2.txt");
				
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit,");
		
		ps.println();
		
		ps.println("kkegdkgkfh howheofh fheowohfwo");		
			
		ps.close();
		
		System.out.println();
		

	}

}
