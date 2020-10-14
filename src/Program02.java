
public class Program02 {

	// Complete 	( Using Math.pow(); method )
	
/*2)Given array of integers,print the sum of elements 
 * squaring/cubing as per the power of their indices.         
//answer=  sum=sum+a[i]^i;
     eg:input:{2,3,5}
	Output:29
 */
	public static void main(String[] args) {
	
		int[] arr = {2,3,5};
		int sum = 0;
		for(int i=0; i<arr.length;i++)
		{
		    sum += (Math.pow(arr[i], i));// declare implicit //1,3,25
			
		}
		System.out.println(sum);
	
	}

}
