import java.util.Scanner;
public class Zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Równanie jest postaci ax + b = 0");
		System.out.println("Wartoœæ a: ");
		double a = s.nextDouble();
		System.out.println("Wartoœæ b: ");
		double b = s.nextDouble();
		
		if((a != 0) && (b != 0)) {
			double x = -b/a;
		System.out.println("Rozwi¹zanie to x =" +x);
		}
		if((a == 0) && (b == 0)) {
			System.out.println("Nieskoñczenie wiele wyników");
		}
		if((a == 0) && (b != 0)) {
			System.out.println("Brak rozwi¹zañ");
		}
		
		
	} //void

} //public class
