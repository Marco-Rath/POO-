
package MCD;
import java.util.Scanner;

public class MCD {
	
	
	public static int maximocd(int a, int b){
		
		if(a > b){
			
			return maximocd(a-b,b);
		
                 }
		
		if(a < b){
			
			return maximocd(a,b-a);
		
                   }
		
		else {
			
			return a;
			
		}
		
	}
		
		
		
		public static void main(String[] args) {
			
			
			Scanner ingreso = new Scanner(System.in);
			
			int tamano,n,i;
			
			
			System.out.print( "Ingrese el tamaño del arreglo: ");
			
			tamano = ingreso.nextInt();
			
			
			int A[] = new int[tamano];
			
			
			for(i = 0; i < tamano; i++){
				
				System.out.print( " Ingrese el valor [" + (i+1) + "]: ");
				
				A[i] = ingreso.nextInt();
				
			}
			
			
			
			n = A[0];
			
			
			
			for(i = 1; i < tamano; i++){
				
				
				n = maximocd(n,A[i]);
				
			}

			
			
			System.out.print("\n El resultado es: " + n +"\n");
			
		}

		
}
