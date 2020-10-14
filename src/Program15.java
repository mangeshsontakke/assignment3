
/*15) Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
if both the sum is equal return 1 or return -1.*/
public class Program15 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int addeven = 0;
		int addodd = 0;
		for(int i=0; i<arr.length;i++)
		{
		
			if(i%2==0)// for even position
			{
				addeven = addeven + arr[i];// Add Even position array value
			}else{
				addodd = addodd + arr[i];// Add Odd position array value
			}
		}System.out.println("Even add: "+addeven+ "  Odd Add: "+addodd);
		
		if(addeven == addodd)// if same then print 1 otherwise print -1
		{
			System.out.println(1);
		}else{
			System.out.println(-1);
		}
		
	}

}
