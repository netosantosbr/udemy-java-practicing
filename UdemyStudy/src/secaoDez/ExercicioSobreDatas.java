package secaoDez;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExercicioSobreDatas {
	public static void main(String[] args) {
		//Instanciação a partir do agora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-02-12");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-13T02:30:22");
		Instant d06 = Instant.parse("2023-02-13T02:30:22Z");
		Instant d07 = Instant.parse("2023-02-13T02:30:22-03:00");	
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 01, 30);
		
		System.out.println("d01 = "+d01);
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		System.out.println("d04 = "+d04);
		System.out.println("d05 = "+d05);
		System.out.println("d06 = "+d06);
		System.out.println("d07 = "+d07);
		System.out.println("d08 = "+d08);
		System.out.println("d09 = "+d09);
		System.out.println("d10 = "+d10);
		System.out.println("d11 = "+d11);
		
		
		System.out.println("======================================================================================");
		
		
		// Aula 2
		
		
		
		LocalDate d04x = LocalDate.parse("2022-07-20");
		LocalDateTime d05x = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06x = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04x = "+ d04x.format(dtf));
		System.out.println("d04x = "+ dtf.format(d04x));
		System.out.println("d05x = "+ dtf2.format(d05x));
		System.out.println("d06x = "+ dtf3.format(d06x));
		System.out.println("d05x = "+ d05x.format(dtf4));
		System.out.println("d06x = "+ dtf5.format(d06x));
		
		System.out.println("======================================================================================");
		
		
		// Aula 3
		
		LocalDate d04z = LocalDate.parse("2022-07-20");
		LocalDateTime d05z = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06z = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06z, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06z, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06z, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06z, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("======================================================================================");
		
		
		// Aula 4
		
		LocalDate d04y = LocalDate.parse("2022-07-20");
		LocalDateTime d05y = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06y = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate afterSevenYearsLocalDate = d04.plusYears(7);
		
		System.out.println("Past Week = " + pastWeekLocalDate);
		System.out.println("Next Week = " + nextWeekLocalDate);
		System.out.println("After Seven Years = " + afterSevenYearsLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime afterSevenYearsLocalDateTime = d05.plusYears(7);
		
		System.out.println("Past Week Time = " + pastWeekLocalDateTime);
		System.out.println("Next Week Time = " + nextWeekLocalDateTime);
		System.out.println("After Seven Years Time = " + afterSevenYearsLocalDateTime);
		
		Duration d1 = Duration.between(pastWeekLocalDateTime, d05y);
		
		System.out.println("Duration between(in days): "+ d1.toDays());
		System.out.println("Duration between(in hours): "+ d1.toHours());
		
		Duration d3 = Duration.between(LocalDateTime.parse("2022-03-10T10:30"), LocalDateTime.parse("2022-03-10T14:40"));
		System.out.println(Math.ceil(d3.toMinutes() / 60.0));
	}
}
