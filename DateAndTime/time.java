// package DateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class time
{
	public static void main(String[] args) {
	    String d;
	    LocalTime ld=LocalTime.now();
	    DateTimeFormatter formatterLocalTime=DateTimeFormatter.ofPattern("HH:mm:ss");
	    d=formatterLocalTime.format(ld);
	    System.out.println(d);
		
	}
}