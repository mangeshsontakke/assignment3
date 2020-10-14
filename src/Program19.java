import java.util.StringTokenizer;
/*19)Email Validation
   		String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five charcters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;
	 */

public class Program19 {
	public static void main(String[] args) {
		String mail = "test@gmail.com";
		int c = 0;
	    boolean b=false;
	    try{
        StringTokenizer t=new StringTokenizer(mail,"@");
        String s1=t.nextToken();//test
        String s2=t.nextToken();//gmail.com
        StringTokenizer t1=new StringTokenizer(s2,".");
        String s3=t1.nextToken();//gmail
        String s4=t1.nextToken();//com
		if(mail.contains("@") && mail.contains("."))
			c++;
			if(c==1)
			    if(s3.length()==5)
                    if(s1.length()>=3)
                          if(s4.equals("com"))
                                b=true;
	    }catch(Exception e){
	    	e.getMessage();
	    }
			if(b == true)
			{
				System.out.println("Valid Email id ");
			}else
			{
				System.out.println("Not-Valid Email id");
			}
	}
}
