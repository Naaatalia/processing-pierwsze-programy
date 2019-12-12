import java.util.Scanner;
public class bin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Podaj liczbê: ");
		int x = s.nextInt();
	 
String w = "";
do {
	int r = x % 2;
	x = x / 2;
	w = r + w;
} while(x > 0);
System.out.println("Dwójkowo: " +w);
		
	}//void

}//public class
