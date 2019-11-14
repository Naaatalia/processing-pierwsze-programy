import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 //NWD = najwiêkszy wspólny dzielnik
		 //NWW = najmniejsza wspólna wielokrotnoœæ
		 
		 System.out.print ("Podaj a i b: ");
		 double a = s.nextInt();
		 double b = s.nextInt();
		
while(a != b) {
	if( a>b ) {
		a=a-b;
	}//if
	else{
		b=b-a;
	}//else
}//while 1

System.out.println ("NWD: " +a);
	}//public static void

}//public class
