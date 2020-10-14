public class Program05 {

	
	/*5)Given an array find the largest 'span'
   (span is the number of elements between two same digits)
    find their sum.
	a[]={1,4,2,1,4,1,5}
	Largest span = 5  */
	
	public static void main(String[] args) {
		//
		int[] arr = {1,4,2,1,4,1,5};
		int index = 0;
		int max = 0;
		int sum = 0 , pos1 = 0 , pos2 = 0;
	
	     for(int i=0; i<arr.length-1; i++)//1
	     {
             for(int j=i+1; j<arr.length; j++)//1,4,2,1,4,1 = sum=13 span=5 
            	 
                   if(arr[i] == arr[j])//3 / 5
                         index = j;//3 / 5
                   if(index-i > max)
                   {
                         max = index-i;//5-0 = 5
                         pos1 = i;//0
                         pos2 = index;//5
                   }
       }
             System.out.println("largest span: "+(pos2-pos1));
             for(int i = pos1;i <= pos2;i++)// for Sum of under Span Elements
                   sum = sum + arr[i];
             System.out.println("Sum: "+sum);
	}

}



/*
 * for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					index = j;
				if(index-i > max)
					max = index-i;//
					pos1 = i;
					pos2 = index;
			}
		}
System.out.println("Largest Span: "+(pos2-pos1));

for(int i = pos1;i <= pos2;i++)
      sum = sum + arr[i];
System.out.println(sum);
*/
