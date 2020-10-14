

		/*18)String[] input1=["Vikas","Lokesh",Ashok]
		   expected output String: "Vikas,Lokesh,Ashok"
		 */

public class Program18 {
	public static void main(String[] args) {
		String[] arr = {"Vikas","Lokesh","Ashok"};
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<arr.length; i++)// arr.length
		{
			sb.append(arr[i]).append(',');//Vikas,Lokesh,Ashok
			 
		} sb.deleteCharAt(sb.length()-1);// delete last ','
		System.out.println('"'+sb.toString()+'"');//all string under single string
	}

}
