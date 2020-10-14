	/*20)Square root calculation of
		   ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
		   o/p should be rounded of to int;
		 */

public class Program20 {
	public static void main(String[] args) {
		 int x1 = 4,x2 = 8;
         int y1 = 3,y2 = 5;
         
         int op;
         op = (int)(Math.sqrt((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));//BODMAS rule
         System.out.println(op);
	}

}
