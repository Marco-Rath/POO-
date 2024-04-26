package laboratorio4;


public class caballo extends animal {
    private String color;
    private int edad;
    //constructor
    
    public caballo(){
        super();
        this.color=new String();
        this.edad=0;
    }

    public caballo(String color, int edad, String nombre, String especie) {
      
       super(especie,nombre);
       this.color=color;
       this.edad =edad;
       
    }
    
  
    public void galopa(){
        System.out.println("Soy un caballo estoy galopeando xD");
    }
   @Override
    public void comer(){
        System.out.println("Soy un caballo estoy comiendo xD");
    }
    
}
