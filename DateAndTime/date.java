// package DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class date
{
	public static void main(String[] args) {
	    String d;
	    LocalDate ld=LocalDate.now();
	    DateTimeFormatter formatterLocalDate=DateTimeFormatter.ofPattern("dd-MM-YYYY");
	    d=formatterLocalDate.format(ld);
	    System.out.println(d);
		
	}
}
