import java.util.Scanner;
public class NWW {

	public static int nwd(int x, int y) {
		while (x != y) {
		if (x > y)
		x -= y;
		else
		y -= x;
		}
		return x;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		Scanner s = new Scanner(System.in);
		
		System.out.println ("Podaj liczby: :");
		x = s.nextInt();
		y = s.nextInt();
		
		System.out.println("NWW liczb " + x + " i " + y + " wynosi: " + ((x*y)/nwd(x,y)));
	}

}
