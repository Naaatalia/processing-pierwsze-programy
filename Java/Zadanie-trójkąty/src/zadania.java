import java.util.Scanner;
public class zadania {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
				System.out.print("Podaj d³ugoœæ odcinka a: " );
				int a = s.nextInt();
				System.out.print("Podaj d³ugoœæ odcinka b: ");
				int b = s.nextInt();
				System.out.print("Podaj d³ugoœæ odcinka c: ");
				int c = s.nextInt();
 if( (a+b > c) && (a+c > b) && (c+b > a) ) {
	System.out.print("Trójk¹t istnieje");
 }
	else {
		System.out.print("Trójk¹t nie istnieje");
	}

	}

}
