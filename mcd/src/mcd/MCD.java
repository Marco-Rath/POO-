package mcd;
import java.util.Scanner;
/**
 *
 * @author Aron
 */
public class MCD {
    int n;

  public static void main (String [] args ) {
      Scanner entrada =new Scanner (System.in);
    int num1;
    int num2;
      System.out.println("Digite el primer numero");
    num1 =entrada.nextInt();
    System.out.println("Digite el segundo numero");
    num2 =entrada.nextInt();
      MCD recursividad= new MCD();
      recursividad.n = recursividad.mcd(num1,num2);
      System.out.println("respuesta = "+recursividad.n);
  } 
    
  public int mcd(int a,int b){
     if(a>b)
         return(mcd(a-b,b));
     if(a<b)
         return(mcd(a,b-a));
     else //si a==b
         return a;
      
  }
}