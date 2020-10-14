public class Program06 {
	
		/*6)input={"1","2","3","4"}
		    output=10
			ie,if string elements are nos,add it.
		    input={"a","b"}
		    output=-1;
		 */
	public static void main(String[] args)throws NumberFormatException {
		
		//String[] arr = {"1","2","5","4"};
	String[] arr = {"a","b","c","d"};
		int flag = 0;
		int add = 0;
	
		for(int i=0; i<arr.length;i++)
		{
			String str = arr[i];
			for(int j=0; j<str.length();j++)
			{
				char ch = str.charAt(j);
				if(Character.isDigit(ch))
				{
					flag = 1;
				}else if(Character.isAlphabetic(ch))
				{
					flag = -1;
					break;
				}try{
				  add = add+Integer.parseInt(str);
				}catch(Exception e){
					e.getMessage();
				}
			}
		}
		if(flag == 1)
		{
			System.out.println(add);
		}else{
			System.out.println(-1);
		}
		
		
		
	}
}