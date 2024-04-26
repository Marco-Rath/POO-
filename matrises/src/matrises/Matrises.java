
package matrises;
import java.util.Scanner;
import javax.swing.JOptionPane; //llamada del nuevo imprimir
public class Matrises {

    public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);
        int matris[][],nfilas,ncolumnas;
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de filas: " )); //nuevo impr
        ncolumnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de columnas: ")); //nuevo
        matris= new int[nfilas][ncolumnas];
       System.out.println("Ingrese la Matris : ");
      for(int i=0;i<nfilas;i++){
          for(int j=0;j<ncolumnas;j++){
              System.out.println("Matris "+ "["+i+"]["+j+"]: ");
              matris[i][j]= entrada.nextInt();   
          }
      }
      System.out.println("\nla matris es ; ");
       for(int i=0;i<nfilas;i++){
          for(int j=0;j<ncolumnas;j++){
           System.out.print(matris[i][j]+ " ");
      
          }
         System.out.println("");
          
       }
    }
   
    
}
