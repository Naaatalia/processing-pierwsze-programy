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
				System.out.println("Wczyta³em a: " + a);
				double b = s.nextDouble();
				System.out.println("Wczyta³em b: " + b);
				double c = s.nextDouble();
				System.out.println("Wczyta³em c: " + c);

				if ((a + b > c) && (a + c > b) && (c + b > a)) {
					System.out.println("Da siê zbudowaæ");
				} // if
				else {
					System.out.println("Nie da siê zbudowaæ");
				} // else
			} // while
		} // try
		catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	} // void
} // public class
