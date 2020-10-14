
import java.util.Calendar;
import java.util.GregorianCalendar;

//16)no of days in a month in specific year

public class Program16 {
	public static void main(String[] args) {
		
	      Calendar ca = new GregorianCalendar(2013,Calendar.FEBRUARY,03);// Java in-build API calendar class
          int n = ca.getActualMaximum(Calendar.DAY_OF_MONTH);// return day in month
          System.out.println(n);
		
	}

}
