import java.util.Arrays;

public class Program04 {
	/*  4)int[] a={12,14,2,26,35}
		find the difference b/w max and min values in array
		output:35-2=33.
		 */
	public static void main(String[] args) {

		int[] a={12,14,2,26,35};
		
		int min=0,max=0;

		Arrays.sort(a);
		
		min=a[0];
		
		max=a[a.length-1];
		int ans = max-min;
		System.out.println(ans);
		
	
	}
}
