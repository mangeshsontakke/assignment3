public class Program11 {
	
	//11)Get all the numbers alone from the string and return the sum.
	public static void main(String[] args) {
		String str = "53lkjf649js2df";
		int add = 0;
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch))// if it is digit then go inside
			{
				String s = str.valueOf(ch);// char convert into string
				add = add + Integer.parseInt(s);// string convert into Integer for adding actual no.
			}
		}System.out.println(add);// print addition of only digit
	}

}
