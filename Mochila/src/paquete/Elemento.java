    
package paquete;

public class Elemento {
    //creacion de objetos
      private int peso;
    private int beneficio;
 
    public Elemento(int peso, int beneficio) {//constructor
        this.peso = peso;
        this.beneficio = beneficio;
    }
 
    public int getPeso() {//getters and setters
        return peso;
    }
 
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {//constructor para la variable objeto
        this.beneficio = beneficio;
    }
 //sobre escritura
    @Override 
    public boolean equals(Object obj) {//tipo bolean
        if (this == obj) {  //usamos los getters y setters 
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elemento other = (Elemento) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.beneficio != other.beneficio) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString(){
        return "Peso:"+peso+","+" beneficio:"+beneficio;
    }
     
     
}
