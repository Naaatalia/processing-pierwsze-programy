
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 
 System.out.print("Podaj liczb� ca�kowit� nr1: " );
int l = s.nextInt();

if ( l > 0) {
	System.out.println("Twoja liczba jest wi�ksza od 0");
} //if
if ( l < 0) {
	System.out.println("Twoja liczba jest mniejsza od 0");
} //if 2
if ( l == 0) {
	System.out.println("Twoja liczba jest r�wna 0");
} //if 3

System.out.print("Podaj liczb� ca�kowit� nr2: " );
int n = s.nextInt();

if (n > 0) {
	System.out.println("Twoja liczba jest wi�ksza od 0");
} //if 4
if (n < 0) {
	System.out.println("Twoja liczba jest mniejsza od 0");
} //if 5
if ( n == 0) {
	System.out.println("Twoja liczba jest r�wna 0");
} //if 6

Scanner x = new Scanner(System.in);
if (l%n == 0) {
	System.out.println("Liczby s� podzielne");
	}
else {
	System.out.println("Liczby nie s� podzielne");
}
} //void
} //public class
