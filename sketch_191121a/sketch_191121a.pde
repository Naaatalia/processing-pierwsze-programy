import java.util.Scanner;
import java.util.Random;


void setup() 
{
  size(400, 200);
  Random losuj = new Random();

int b[];
  int ile = 50;
  b = new int[ile];
      for (int i = 0; i < ile; i++) 
      {
      b[i] = Math.abs(losuj.nextInt() % 100);
      }
      
      for (int i = 0; i < ile; i++)
      {
      System.out.print(b[i]+", ");
      }
      
      for (int i = 0; i < ile; i++) 
      {
      int wysokosc = b[i]; 
       rect(i*10, 0, 10, wysokosc);
      } 
}
