import java.text.SimpleDateFormat;
import java.util.Date;

//10)What will be the DAY of current date in next year

public class Program10 {
	public static void main(String[] args) {
		 Date d = new Date();
		 System.out.println(sameDayOnUpcomingYear(d));
   }
   public static String sameDayOnUpcomingYear(Date d) {
         Date d1 = new Date();
         d1.setYear(d.getYear()+1);// same date + 1 = next year same date
         SimpleDateFormat sdf = new SimpleDateFormat("EEEE");// print full day
         String s = sdf.format(d1);// print day in full format
		return s;
	}
}

