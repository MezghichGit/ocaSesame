package chapter_3_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		/*
		Date d1 = new Date();
		
		LocalDate d =LocalDate.now(); // Date courante
		
		LocalDate aniv = LocalDate.of(2014, 03, 01); //Date quelconque
		
		LocalDate aniv2 = LocalDate.of(2014, Month.MARCH, 01);
		System.out.println(d);
		System.out.println(aniv);
		System.out.println(aniv2);
		
		LocalTime t = LocalTime.now();
		LocalTime t1 = LocalTime.of(15,30,10);
		System.out.println(t);
		System.out.println(t1);
		
		LocalDateTime ldt = LocalDateTime.of(d, t);
		System.out.println(ldt);
		LocalDateTime ldt1 = LocalDateTime.of(2021, 03, 1, 10, 15, 10);
		System.out.println(ldt1);
		*/
		
		/*
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20 
		date = date.plusDays(2);
		//date.plusDays(2); // immutable
		System.out.println(date); // 2014-01-22: 
		date = date.plusWeeks(1); 
		//date.plusWeeks(1); 
		System.out.println(date);*/
		
		//Period
		
		//Period p = Period.ofYears(2);
		/*
		Period p = Period.of(2, 3, 10);
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		date = date.plus(p);
		System.out.println(date);*/
		
		
		// Formatting Date and Time
		
		/*LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // Affichage selon la norme ISO
		
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println(f1.format(date));
		
		System.out.println(date.format(f1));
		
		
		System.out.println(f2.format(date));
		System.out.println(f3.format(date));*/
		
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		String res1 = f1.format(date);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		LocalTime lt = LocalTime.now();
		String res2 = f2.format(lt);
		
		System.out.println("FINAL : "+ res1+" "+res2);
		
		LocalDateTime ldt = LocalDateTime.of(date,lt);
		System.out.println(ldt);
		
		
		/*LocalDateTime ldt = LocalDateTime.of(2020, 12,10,15,10);
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(f2.format(ldt));*/

	}

}
