import java.util.Random;
import java.util.Scanner;
public class zad7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

int tab[][];
tab = new int[5][5];
for(int i = 0; i<5; i++) {
	for(int j = 0; j<5; j++) {
		tab[i][j] = Math.abs( r.nextInt() % 90 ) + 10;
	}
}

for(int i = 0; i<5; i++) {
	for( int j = 0; j<5; j++) {
		System.out.print(tab[i][j]+" ");
	}
	System.out.println("");
}
int max = tab[0][0];
int min = tab[0][0];

for(int i = 0; i<5; i++) {
	for(int j = 0; j<5; j++) {
		if( tab[i][j] > max ) {
			max = tab[i][j];
		}
		if( tab[i][j] < min ) {
			min = tab[i][j];
		}
	}
}
System.out.println("Najwiêksza liczba: " + max);
System.out.println("Najmniejsza liczba: " + min);
System.out.println("Suma najwiêkszej i najmniejszej liczby: " + (max + min));
	}

}