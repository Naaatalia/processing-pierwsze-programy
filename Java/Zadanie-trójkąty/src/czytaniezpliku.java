import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class czytaniezpliku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/dane/dane.txt");
		Scanner s;
		try {
			s = new Scanner(file);

			while (s.hasNextLine()) {

				double a = s.nextDouble();
				System.out.println("Wczyta�em a: " + a);
				double b = s.nextDouble();
				System.out.println("Wczyta�em b: " + b);
				double c = s.nextDouble();
				System.out.println("Wczyta�em c: " + c);

				if ((a + b > c) && (a + c > b) && (c + b > a)) {
					System.out.println("Da si� zbudowa�");
				} // if
				else {
					System.out.println("Nie da si� zbudowa�");
				} // else
			} // while
		} // try
		catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	} // void
} // public class
