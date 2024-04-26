 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla.de.multi.en.java;
import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class TABLADEMULTIENJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner m = new Scanner(System.in);
        System.out.println("Ingrese el numero : ");
        n=m.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i + "*"+ j + "=" + i*j);
            }
            System.out.println();
        }
    }
    
}
