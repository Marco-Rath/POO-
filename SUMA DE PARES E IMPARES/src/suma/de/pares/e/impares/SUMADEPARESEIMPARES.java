
package suma.de.pares.e.impares;
import java.util.Scanner;

public class SUMADEPARESEIMPARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int cont=0,cont2=0;
     Scanner m= new Scanner(System.in);
     System.out.println("Ingrese el numero : ");
     int n=m.nextInt();
     
     for(int i=1;i<=n;i=i+2){
     cont=cont+i;    
     }
     System.out.println("La suma de numeros impares es de : "+cont);
     System.out.println();
     
     for(int j=1;j<=n;j++){
         if(j%2==0){
             cont2=cont2+j;
         
         }
     }
     System.out.println("La suma de numereso pares es de : "+cont2);
    
    }
    
}
