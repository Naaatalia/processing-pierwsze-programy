import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadtrojkaty2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/dane/dane.txt");
		Scanner s;
		
		try {
			s = new Scanner(file);
			
			while (s.hasNextLine()) {

				double a = s.nextDouble();
				double b = s.nextDouble();
				double c = s.nextDouble();

				if ((a + b > c) && (a + c > b) && (c + b > a)) {
					System.out.println("Da siê zbudowaæ");
				} // if
			} //while
		} //try
		catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	} //void

} // public class
