

/*14)for the given string display the middle 2 value, case satisfies only if string is of even length
	ip - java
	op - av
 */
public class Program14 {
	public static void main(String[] args) {
		String str = "java";
		int len = str.length();//4
		String temp = "";
		for(int i=0; i<len;i++)
		{
		if(len%2 == 0)// As per Program only Even String is allowed
		{
			temp = str.substring(1, len-1);// av
		}else{
			temp = "Given String is Odd";
		}
		
	}System.out.println(temp);
	}

}
