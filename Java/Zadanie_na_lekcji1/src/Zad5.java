import java.util.Scanner;
import java.util.Random;

public class Zad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Ile liczb podasz: ");
		int ile = s.nextInt();
		int b[];
		b = new int[ile];
		Random generator = new Random();
		System.out.println("Jaka ma byæ najwiêksza liczba?");
		int x = s.nextInt();
		for (int i = 0; i < ile; i++) {
			b[i] = Math.abs(generator.nextInt() % +(x + 1));
		}

		for (int i = 0; i < ile; i++) {
			System.out.print(b[i]+", ");
		}
for(int j = 0; j<ile; j++) {
	for(int i = 0; i < ile-1; i++) {
		if( b[i] > b[i+1]) {
			int rob = b[i];
			b[i] = b[i+1];
			b[i+1] = rob;
			
		}
	}
}
		
	}// public static void

}// public class Zad5
