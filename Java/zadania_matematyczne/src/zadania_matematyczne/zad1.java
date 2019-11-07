package zadania_matematyczne;
import java.util.Scanner;

public class zad1 {
	
	public static boolean CzyPunktNalezy (double x1, double y1, double x2, double y2, double x3, double y3) { 
		double dA = (x1*y2*1) + (x2*x3*1) + (x3*y1*1) - (1*y2*x3) - (1*y3*x1) - (1*y1*x2);
		
		if( dA != 0) return false;
		else if( (Math.min(x1, x2) <= x3) && 
				(Math.min(x1, x2) >= x3) &&
				(Math.min(y1, y2) <= y3) &&
				(Math.min(y1, y2) >= y3)) return true;
		else return false; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println("Podaj wspó³rzêdne a: ");
double x1 = s.nextDouble();
double y1 = s.nextDouble();
System.out.println("Podaj wspó³rzêdne b: ");
double x2 = s.nextDouble();
double y2 = s.nextDouble();
System.out.println("Podaj wspó³rzêdne c: ");
double x3 = s.nextDouble();
double y3 = s.nextDouble();

	} //public static void 
} //public class