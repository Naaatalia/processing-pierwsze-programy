import java.util.Scanner;
import java.util.*;

public class Sprawdzian_zad2 {
	static double silnia(int n) {
		double wynik = 1;
		for (int i = 2; i <= n; i++) {
			wynik = wynik * i;
		}
		return wynik;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Podaj liczbê: ");
		int y = s.nextInt();
		System.out.print("Silnia liczby wynosi: ");
		double x = silnia(y);
		System.out.print(x);
		}
	}
