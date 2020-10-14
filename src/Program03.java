
public class Program03 {
	
		//Complete
	
	/*3)Given array of string check whether all the elements contains only digits not any alaphabets.
	if condn satisfied print 1 else -1.
	Input:{"123","23.14","522"}
	output:1 
	Input1:{"asd","123","42.20"}
	output:-1*/
	
	 public static void main(String[] args) {
		 
        // String[] arr = {"123","23.14","522"};
         String[] arr = {"asd","123","42.20"};
         System.out.println(isStringDigit(arr));//passing argument
   }
   public static int isStringDigit(String[] a)//receiving parameter  
   {
         int n = 0;
      for(int i = 0;i < a.length;i++)
      {
          	String s1 = a[i];
          for(int j = 0;j < s1.length();j++)
          {
        	  char c1 = s1.charAt(j);
              if(Character.isDigit(c1))// check is this digit or not if yes then return 1;
                   n = 1;
              else 
              {
                   n = -1;// check is this digit or not if not then return -1 and break loop;
                   break;// for terminating loop immediately
              }
          }
       }	return n;
         
   }
}