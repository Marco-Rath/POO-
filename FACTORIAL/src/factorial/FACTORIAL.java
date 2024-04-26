/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
      System.out.println("Ingrese el numero : ");
    int n= m.nextInt();
    System.out.println("El factorial de " + n + " es " + "=" + factorial(n));
        
    }
    
    public static double factorial( int n){
     double aux=1;
     for(int i=1;i<=n;i++){
     aux*=i;  // aux=aux*i
     
     }
     return aux;
    }
}
