package DateAndTimeApi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateZone {
	public static void main(String args[]) {
		
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
		
		df.setTimeZone(TimeZone.getTimeZone("Asia/Bengaluru"));
		String IST = df.format(date);
		System.out.println("Date in Indian Timezone : "+IST);
		
		df.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String PST = df.format(date);
		System.out.println("Date in Paris Timezone : "+PST);
		
		df.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
		String MST = df.format(date);
		System.out.println("Date in Mexico Timezone : "+MST);
		
		df.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		String LST = df.format(date);
		System.out.println("Date in London Timezone : "+LST);
		
		df.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
		String AST = df.format(date);
		System.out.println("Date in Sydney Timezone : "+AST);
		
	}
}
