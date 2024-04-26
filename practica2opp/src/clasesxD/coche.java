
package clasesxD;

public class coche {
    String color,marca,model;
    int km;
// constructorrrrr
    //metodo

 public coche(String color, String marca, int km,String model) {// "_"compañar al color marca etc;
        this.color = color;
        // o color=_color; cualquiera de los 2 
        this.marca = marca;
        this.km = km;
        this.model=model;
    }

    //METODOOOOOOOOO de la clase
   public void enceder(){
       System.out.println("Estado encendido ");
   }
  public void acelerar(){
      System.out.println("ACELERANO ");
  }
  public void frenar(){
       System.out.println("FRENANDO");
  }
  public void mostrarcoche() {
        System.out.println("El coche 01 es de color "+ color);
       System.out.println("El coche 01 es de marca "+ marca);
         System.out.println("con Kilometrage de  : "+ km);
         System.out.println("y es una : "+ model);
  }
   
   
  
}
