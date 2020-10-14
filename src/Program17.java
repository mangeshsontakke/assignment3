
	/*17)Find the sum of the numbers in the given input string array
	   Input{“2AA”,”12”,”ABC”,”c1a”)
	   Output:6 (2+1+2+1)
	   Note in the above array 12 must not considered as such
	   i.e,it must be considered as 1,2
	 */

public class Program17 {
	public static void main(String[] args) {
		int sum = 0;
		try{
			String arr[] = {"2AA","15","ABC","c1a"};
			char[] ch = null;
			for(int i=0; i<arr.length; i++)//
			{
				String word = arr[i];// String to word or part it single char
				for(int j=0; j<word.length(); j++)// traverse till words lenth "2AA"
				{
					ch = word.toCharArray();// [2,A,A]
					if(is_Numeric(ch[j]))// check if Numeric then sum of them
					{
						sum += Integer.parseInt(String.valueOf(ch[j]));// convert char[] into integer and sum of them
					}
				}
			}System.out.println(sum);
		}catch(Exception e)// for exception handling
		{
			e.printStackTrace();
		}
	}
	
	public static boolean is_Numeric(char ch)
	{
		return(ch >= '0' && ch <= '9');
	}

}
