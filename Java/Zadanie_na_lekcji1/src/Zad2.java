import java.util.Scanner;
public class Zad2 {
	public static void liniowe ( double a, double b) {
		if( a !=0 && b !=0) {
			double x = -b / a;
					System.out.println("x = " +x);
		}
		if((a == 0) && (b != 0)) {
			System.out.println("Brak rozwi�za�");
		}
	if(( a == 0) && (b == 0)) {
		System.out.println("Niesko�czenie wiele rozwi�za�");
	}
	
	} // void liniowe
	public static void kwadratowe (double a, double b, double c) {
		double Delta;
		double x1;
		double x2;
		if( c != 0) {
			Delta = b*b - 4*a*c;
			if(Delta < 0 ) {
				System.out.println("Brak rozwi�za�");
			}
			if(Delta >= 0) {
				x1 =( -b - Math.sqrt(Delta)) /2*a;
				x2 =( -b + Math.sqrt(Delta)) /2*a;
				System.out.println("Delta ma jedno rozwi�zanie");
			}
		}
	}
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("R�wnanie wynosi ax + b = 0 ORAZ ax^2 + bx + c = 0");
		System.out.println("Podaj warto�� a: ");
		double a = s.nextDouble();
		System.out.println("Podaj warto�� b: ");
		double b = s.nextDouble();
		System.out.println("Podaj warto�� c: ");
		double c = s.nextDouble();
		
		if(c == 0) {
			liniowe (a, b);
		}
		if(c != 0) {
			kwadratowe (a, b, c);
		}
		
	}
}
