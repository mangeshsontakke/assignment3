import java.util.StringTokenizer;

public class Program08 {

	
	/*	8)count the number of times the second word in second string occurs in first string-case sensitive
		input1=hai hello hai where hai Hai;
		input2=what hai
		output=3;
	 */
	public static void main(String[] args) {
		//
		String str1 = "hai hello hai where hai Hai";
		String str2 = "what aaaw";
		int count = 0;
		String s2 = str2.substring(5, 8);// set string which we want search
		//System.out.println(s2);
		String[] sp = str1.split(" ");// String array split into space 	
		for(int i=0; i<=sp.length-1; i++)// from 0 to string length-1
		{
			if(sp[i].equals(s2))// equals case sensitive equalsIgnoreCase is not case sensitive
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
