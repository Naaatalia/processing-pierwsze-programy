import java.util.Scanner;
public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("R�wnanie jest postaci ax + b = 0");
		System.out.println("Warto�� a: ");
		double a = s.nextDouble();
		System.out.println("Warto�� b: ");
		double b = s.nextDouble();
		
		if((a != 0) && (b != 0)) {
			double x = -b/a;
		System.out.println("Rozwi�zanie to x =" +x);
		}
		if((a == 0) && (b == 0)) {
			System.out.println("Niesko�czenie wiele wynik�w");
		}
		if((a == 0) && (b != 0)) {
			System.out.println("Brak rozwi�za�");
		}
		
		
	} //void

} //public class
