

import java.time.*;
public class birthday {
    public static void main(String[] args) {
        LocalDate pdt = LocalDate.of(2003,12,07);
		LocalDate tdt = LocalDate.now();
		Period diff = Period.between(pdt, tdt);
		System.out.println("Date of Birth : "+pdt);
		System.out.println("Age : "+diff.getYears());
		System.out.println("Years : "+diff.getYears());
		System.out.println("Months : "+diff.getMonths());
		System.out.println("Days : "+diff.getDays());

    }
}
