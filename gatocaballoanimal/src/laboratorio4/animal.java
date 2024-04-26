package laboratorio4;


public abstract class animal {
  protected String especie;
  private String nombre;
  public animal(){
  this.especie= new String();
  this.nombre=new String();
}

    public animal(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }
  
  public abstract void  comer();
    

  public void respirar(){
    System.out.println("Estoy respirando");
    
}

  
}
