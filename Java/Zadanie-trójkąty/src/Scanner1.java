
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 
 System.out.print("Podaj liczbê ca³kowit¹ nr1: " );
int l = s.nextInt();

if ( l > 0) {
	System.out.println("Twoja liczba jest wiêksza od 0");
} //if
if ( l < 0) {
	System.out.println("Twoja liczba jest mniejsza od 0");
} //if 2
if ( l == 0) {
	System.out.println("Twoja liczba jest równa 0");
} //if 3

System.out.print("Podaj liczbê ca³kowit¹ nr2: " );
int n = s.nextInt();

if (n > 0) {
	System.out.println("Twoja liczba jest wiêksza od 0");
} //if 4
if (n < 0) {
	System.out.println("Twoja liczba jest mniejsza od 0");
} //if 5
if ( n == 0) {
	System.out.println("Twoja liczba jest równa 0");
} //if 6

Scanner x = new Scanner(System.in);
if (l%n == 0) {
	System.out.println("Liczby s¹ podzielne");
	}
else {
	System.out.println("Liczby nie s¹ podzielne");
}
} //void
} //public class
