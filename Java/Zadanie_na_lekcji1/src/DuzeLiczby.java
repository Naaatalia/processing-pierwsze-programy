import java.util.Random;
import java.util.Scanner;

public class DuzeLiczby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int a[];
		a = new int[21];
		int b[];
		b = new int[21];
		int c[];
		c = new int[21];

		for (int i = 0; i < 5; i++) {
			a[i] = Math.abs(r.nextInt() % 10);
			b[i] = Math.abs(r.nextInt() % 10);
		}
		for (int i = 19; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println("");
		for (int i = 19; i >= 0; i--) {
			System.out.print(b[i]);
		}
		int p = 0;
		for(int i = 0; i<20; i++) {
			int w = a[i] + b[i] + p; 
			if( w >= 10) {
				p = 1;
				w = w % 10; 
			}
			else {
				p = 0;
			}
			c[i] = w;
		}
		c[20] = p;
		
		System.out.println("");
		for(int i = 20; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
}
