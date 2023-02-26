import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate dataFutura = LocalDate.of(2024, Month.JULY, 22);
		System.out.println(dataFutura);
		
		int anos = dataFutura.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje,  dataFutura);
		System.out.println(periodo.getDays());
		
		LocalDate proximaData = dataFutura.plusYears(4);
		System.out.println(proximaData);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = dataFutura.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		LocalDate data = LocalDate.of(2099,  1,  25);
		
		LocalDate agora2 = LocalDate.now();
		
		Period periodoData = Period.between(agora2, dataFutura);
		System.out.println(periodoData);
		
		DateTimeFormatter formataAgora2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(data.format(formataAgora2));
				
	}

}
