import java.util.Arrays;
public class Program07 {
		/*7)arraylist1={ 1,2,3,4,5}
		    arraylist2={ 6,7,8,9,10}
			size of both list should be same 
			output={6,2,8,4,10}
		 */
	public static void main(String[] args) {
				
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		int len = arr1.length;// calculate array length
		int temp[] = new int[len];// 3rd array for storing the result
		
		for(int i=0;i<arr1.length;i++)
		{
			if(i%2!=0)//odd position
			{
				temp[i]=arr1[i];//2,4
			}
			else//even position
			{
				temp[i]=arr2[i];//6,8,10
			}
		}
		System.out.println(Arrays.toString(temp));// for printing the temp value stored in temp[i]


	}
}
