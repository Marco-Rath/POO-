
package Potencia;


public class principal {

public static void main(String[] args)
{
Potencia p2=new Potencia();
long tiempoIni = System.currentTimeMillis();
double p=p2.pow2(41);
System.out.println("La potencia es: "+p);
long tiempoFinal =System.currentTimeMillis();
long total=tiempoFinal-tiempoIni;
System.out.println("El tiempo en minutos: " +total/ (60 * 1000));

}
}
    
    
