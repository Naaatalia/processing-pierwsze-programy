import java.util.Scanner;

public class Sprawdzian_zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Jak wysoki ma byæ trójk¹t: ");
		int h = s.nextInt();
		
		for (int i=1; i<=h; i++){
			for (int j=1; j<=i; j++)
			System.out.print("*");
			System.out.println();
		}
		
	}

}
