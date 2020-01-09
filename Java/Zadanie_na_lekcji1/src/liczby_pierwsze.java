import java.util.Arrays;

public class liczby_pierwsze {

	public static void main(int q) {
		// TODO Auto-generated method stub
boolean tab[] = new boolean[q];
		
Arrays.fill(tab, true);

tab[0] = false;
tab[1] = false;

for (int i = 2; i < q; i++) {
	if (tab[i] == true) {
		for (int j = i + i; j < q; j = j + i) {
            tab[j] = false;

	}
}
	}

}
	 public static void main(String[] args) {
         
         long startTime1 = System.currentTimeMillis();
     int q = 1000000000;
       
    
     
     main(q);
     
    long estimatedTime1 = System.currentTimeMillis() - startTime1;

     
     System.out.println("Czas pracy Erastotenesa: " +  estimatedTime1 + " q = "+ q);

}
}