package cualquier.eercicio.xd;
import java.util.Scanner;
/**
 *
 * @author Isabel
 */
public class CUALQUIEREERCICIOXd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    Scanner m1= new Scanner(System.in);
    System.out.println("Ingrese el primero : ");
    int n = m.nextInt();
    System.out.println("Ingrese el segundo : ");
    int n1 = m.nextInt();
    if(n%n1==0){
     System.out.println(n1+ multi(n,n1)+ n);   
    }
    else{
        System.out.println(n1+ multi(n,n1)+ n);   
    }
    
    }
    
   public static String multi(int n, int n1){
       if(n%n1==0){
       return " es multiplo de "; 
       }
       else{
           return " no es multiplo de ";
       }
   }
    
}
