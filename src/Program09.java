public class Program09 {

/*	9)find the no.of charcters,that has repeated 3 consecutive times
	input1:"aaabbccc"
	ouput1=2;
*/
	public static void main(String[] args) {
		String str = "aaabbbcc";
		int count = 0;
		int counter = 0;
		
		for(int i=0;i<str.length()-1;i++)// length = 8
		{
			if(str.charAt(i) == str.charAt(i+1))//
				count ++;
			else
				count = 0;
			
			if(count == 2)// if count = 2 then execute if part
				counter++;
		}
		System.out.println(counter);
	}
}
