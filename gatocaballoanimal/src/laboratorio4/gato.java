package laboratorio4;


public class gato extends animal{
    private String raza;
    private int edad;
    private boolean sexo;
    //constructor

    public gato(String raza, int edad, boolean sexo,String nombre, String especie) {
        super(especie,raza);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }
    

    public gato() {
        super();
        this.raza = new String();
        this.edad = 0;
        this.sexo = true;
    }
    //metodos
  
    public void caza(){
        System.out.println("Soy un gato estoy cazando xD");
    }
    @Override  //sirve cuando se utiliza la misma funcion pero se debe agregar eso 
    public void respirar (){
        System.out.println("Soy un gato estoy respirando");
    }
    @Override
    public void comer(){
        System.out.println("Estoy comiendo xD");
    }
    
    
}
