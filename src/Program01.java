public class Program01 {
	
	
	/*1)input1="abc2012345"
		input2="abc2112660"
		input 3=4
	here "abc**" refers to customer id.
	12345 refers to last month eb reading and 12660 refers to this month eb reading
	find the difference between two readings and multiply it by input3
	ie., output=(12660-12345)*4 
	           =315*4= 1260
 */
	public static void main(String[] args) {

		String str1="abc2012345";
		String str2="abc2112660";
		int input3 = 4;
		String lastMonthReading = null;
		String currentMonthReading = null;
		lastMonthReading = str1.substring(5,10);
		currentMonthReading = str2.substring(5,10);
		int ans = Integer.parseInt(currentMonthReading) - Integer.parseInt(lastMonthReading); 
		System.out.println(ans*input3);	//lastMonthReading - currentMonthReading * input3;
	}
}