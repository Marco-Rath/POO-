
package Potencia;


public class Potencia {
   public double pow2 (int n)
{
if (n==0)
{
return 1;
}
else
{
return (pow2(n-1) + pow2(n-1));
}
}
    
}
