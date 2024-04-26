
package contar.letras.ingresadas;
       
//Lee solo frases por separados no letras


import java.util.Scanner;
import java.util.StringTokenizer; //separa los string por partes
public class ContarLetrasIngresadas { //

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String frase;
       System.out.print("Introduce una frase: ");
       frase = sc.nextLine();
       StringTokenizer st = new StringTokenizer(frase);
       System.out.println("Número de palabras: " + st.countTokens());  //count para que lea                                           
    }
}
