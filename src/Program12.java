import java.util.StringTokenizer;

/*12)String a="a very fine day"
     output:A Very Fine Day
 */
public class Program12 {
	public static void main(String[] args) {

		String str = "a very fine day";
		StringTokenizer st = new StringTokenizer(str, " ");// use for part on space base
		String s1,s2,s3;
		StringBuffer ans = new StringBuffer();
		
		while(st.hasMoreTokens())// loop till empty tokens
		{
			s1 = st.nextToken();//a very fine day
			s2 = s1.substring(0,1);//a v f d
			s3 = s1.substring(1,s1.length());//"" ery ine ay 
			ans.append(s2.toUpperCase()).append(s3).append(" "); 
			
		}System.out.println(ans);// A Very Fine Day
		
		
	}

}
