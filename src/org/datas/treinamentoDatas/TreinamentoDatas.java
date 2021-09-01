package org.datas.treinamentoDatas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TreinamentoDatas {

	public static void main(String[] args) {
		// entrada de data, escrevendo o dia, m�s e ano
		LocalDate dataDeHoje = LocalDate.now();
		System.out.println(dataDeHoje);
		System.out.println("Hoje é dia: " + dataDeHoje.getDayOfMonth() + " "
				+ dataDeHoje.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"))
				+ " Estamos no mês de " + dataDeHoje.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"))
				+ " (" + dataDeHoje.getMonthValue() + ") do ano de " + dataDeHoje.getYear());

		// data em formato escolhido
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNasc = LocalDate.parse("24/08/1995", formato);
		System.out.println(dataNasc.format(formato));
		System.out.println("------------------------------------------------------------------");

		// conferir quanto tempo com m�todo per�odo
		Period periodo = Period.between(dataNasc, dataDeHoje);
		System.out.println(periodo.getDays());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getYears());
		System.out.println("----------------------------");

		// conferir se ano � bissexto
		System.out.println(dataNasc.isLeapYear() ? "Sim" : "Não");
		System.out.println("------------------------------------------------------------------");

		// contar quantos dias a partir de uma data at� outra

		long dias = dataNasc.until(dataDeHoje, ChronoUnit.DAYS);
		long meses = dataNasc.until(dataDeHoje, ChronoUnit.MONTHS);
		long anos = dataNasc.until(dataDeHoje, ChronoUnit.YEARS);
		System.out.println("Passaram-se " + anos + " anos " + meses + " meses e " + dias + " dias");
		System.out.println("------------------------------------------------------------------");

		// Conferir se � igual
		System.out.println(dataNasc.isEqual(dataDeHoje) ? "sim" : "nao");
		System.out.println("----------------------------");

		// Conferir se a data � depois de tal dia
		System.out.println(dataNasc.isAfter(dataDeHoje) ? "Sim" : "Não");
		System.out.println("----------------------------");

		// Conferir se a data � antes de tal dia
		System.out.println(dataNasc.isBefore(dataDeHoje));
		System.out.println("----------------------------");

		// Subtrair Dias
		System.out.println(dataDeHoje.minusDays(1));
		System.out.println(dataDeHoje.minusMonths(2));
		System.out.println(dataDeHoje.minusYears(5));
		System.out.println(dataDeHoje.minusWeeks(10));
		System.out.println(dataDeHoje.minus(periodo));
		System.out.println(dataDeHoje.minus(1, ChronoUnit.DAYS));
		System.out.println(dataDeHoje.minus(2, ChronoUnit.MONTHS));
		System.out.println(dataDeHoje.minus(5, ChronoUnit.YEARS));
		System.out.println("----------------------------");

		// Adicionar Dias
		System.out.println(dataNasc.plus(periodo));
		System.out.println(dataNasc.plusMonths(2));
		System.out.println(dataNasc.plusYears(5));
		System.out.println(dataNasc.plusWeeks(10));
		System.out.println(dataNasc.plus(25, ChronoUnit.YEARS));
		System.out.println(dataNasc.plus(1, ChronoUnit.DAYS));
		System.out.println(dataNasc.plus(2, ChronoUnit.MONTHS));
		System.out.println("----------------------------");

		// Adicionar data e hora
		LocalDateTime hojeEHora = LocalDateTime.of(2021, 5, 11, 21, 1);
		LocalDateTime NascEHora = LocalDateTime.of(1995, 8, 24, 21, 1);
		System.out.println(hojeEHora);
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(hojeEHora.format(formato2) + " ou " + LocalDateTime.now().format(formato2));
		System.out.println("----------------------------");

		// Exibir fuso padr�o do sistema
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		System.out.println("----------------------------");

		// Atribuir um fuso
		fuso = ZoneId.of("Portugal");
		System.out.println(fuso);
		System.out.println("----------------------------");

		// Mesmos m�todos da data
		// Tamb�m da para utlizar o m�todo plus, minus etc
		Duration duracao = Duration.between(NascEHora, hojeEHora);
		System.out.println(duracao.getSeconds());
		long minutos = NascEHora.until(hojeEHora, ChronoUnit.MINUTES);
		System.out.println(minutos);
		System.out.println("----------------------------");

		// Exibir todos fusos
		// Set<String>fusos=ZoneId.getAvailableZoneIds();
		// for(String f: fusos) {
		// System.out.println(f);
		// }

	}

}
