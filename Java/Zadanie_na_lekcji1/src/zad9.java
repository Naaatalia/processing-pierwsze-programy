import java.util.Scanner;
public class zad9 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Podaj dwójkowo: ");
	String binary = s.next();

	int decimal = 0;
	int wykl = 0;
	
	for(int i = binary.length()-1; i>=0; i--) 
	{
		char znak = binary.charAt(i);
		int potega = (int) Math.pow(2,  wykl);
		if( znak == '1') decimal = decimal + potega;
		wykl++;
	}
System.out.println("Dziesiêtnie to: "+decimal);
	}

}
