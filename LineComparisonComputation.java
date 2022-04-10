import java.util.Scanner;
import java.lang.Math;
import java.lang.Float;

class UC3 {
	public static void main (String args[]) {
		System.out.println("Welcome !");
		
		System.out.println("Enter values of  x1 y1 x2 y2");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();	
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();	
		
		System.out.println("Enter values of  p1 q1 p2 q2");
		int p1 = sc.nextInt();	
		int q1 = sc.nextInt();
		int p2 = sc.nextInt();
		int q2 = sc.nextInt();	
		
		double lengthofFirstLine = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow( (y2 - y1), 2));
		System.out.println(lengthofFirstLine);

		double lengthofSecondLine = Math.sqrt( Math.pow((p2 - p1), 2) + Math.pow( (q2 - q1), 2));
		System.out.println(lengthofSecondLine);
		
		int compare = lengthofFirstLine.compareTo(lengthofSecondLine);
		if(compare == 0)
		{
			System.out.println("Both Line1 and Line2 are equal in length");
		}
		else if(compare > 0)
		{
			System.out.println("Both Line1 is Greater than Line2 ");
		}
		else
			System.out.println("Both Line1 is Lesser than Line2 ");

	}
}