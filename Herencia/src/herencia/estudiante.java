
package herencia;


public class estudiante extends persona {
 private int codigo;
 protected float nofinal;
 public estudiante(String nombre, String apellido, int edad,int codigo,float nofinal){//depende de este parametro
     super(nombre,apellido,edad);
     this.codigo=codigo;
     this.nofinal=nofinal;
 }
 
 public void mostrardatos(){
     System.out.println("Nombre: "+ getNombre());
     System.out.println("Apellido: "+ getApellido());
     System.out.println("edad: "+ getEdad());
     System.out.println("codigo: "+ codigo);
      System.out.println("nota final: "+ nofinal);
 }
}
