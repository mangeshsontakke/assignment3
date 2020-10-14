
	/*13)Take the word with a max length in the given sentence
	 in that check for vowels if so count the no.of occurances !
	  Input 1="Bhavane is a good girl" 
	  Output =3
	  Input 1="Bhavanee is a good girl"
	  Output =4
	 */
public class Program13 {
	public static void main(String[] args) {
		String str = "Bhavaneerrreeaa is a good girl";
		//String str = "Bhavanee is a good girl";
		String[] words = str.split(" ");// length = 5 like on 0th Bhavane [Bhavane, is, a, good, girl]
		int max = 0;
		String temp = null;
		int len = 0;
		int count = 0;
		
		for(int i=0; i<words.length;i++)// for counting max word in given sentences
		{
			int size = words[i].length();// get word size for comparison Bhavane = 7
			if (max < size) // 0<7
				{
				temp = words[i];//Bhavane
				len = temp.length();//7
				max = len;// store max length of word= 7
				}
			
		}System.out.println(temp);// Bhavane		
		for(int i=0;i<temp.length();i++) //B h (a) v (a) n (e)
		{
			if(temp.charAt(i) == 'a' || temp.charAt(i) == 'a' || temp.charAt(i) == 'e' || temp.charAt(i) == 'E' || temp.charAt(i) == 'i' || temp.charAt(i) == 'I' || 
					temp.charAt(i) == 'o' || temp.charAt(i) == 'O' || temp.charAt(i) == 'u' || temp.charAt(i) == 'U')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}
