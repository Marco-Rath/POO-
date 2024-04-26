
package paquete;


public class Mochila {
    
    private int pesoMaximo;//objeto te tenga el peso maximo
    private Elemento[] elementos;// de igual manera creamos una array
 
    private int peso;
    private int beneficio;
 
    public Mochila(int pesoMaximo, int numElementos) {//constructor 
        this.pesoMaximo = pesoMaximo;
        this.elementos = new Elemento[numElementos];//
        this.beneficio = 0;
        this.peso = 0;
    }
 
    public Elemento[] getElementos() {//getters y setter 
        return elementos;
    }
 
     public int getPeso() {
       return peso;
    }
     
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
 
    public int getPesoMaximo() {
        return pesoMaximo;
    }
 
    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
 
  //metodos
    public void aniadirElemento(Elemento e) {//agregar elemento ala mochila
    
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = e; //lo añade
                this.beneficio+=e.getBeneficio(); // aumenta el beneficio
                this.peso+=e.getPeso(); // Aumenta el peso
                break;
            }
        }
 
    }
 //vaciar todo de la mochila
    public void clear() {
        this.peso=0;
        this.beneficio=0;
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = null;
        }
    }
 
 
    //eliminar partes de la mochila
    public void eliminarElemento(Elemento e) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i].equals(e)) {
                this.elementos[i] = null; //el elemento fuera
                this.peso-=e.getPeso(); //Reduce el peso
                this.beneficio-=e.getBeneficio(); // reduce el beneficio
                break;
            }
        }
    }
     //verifica si el elemento insertado existe
   //se puede insertar maximo 1 sin repetirse
    public boolean existeElemento(Elemento e) {
        for (int i = 0; i< this.elementos.length; i++) {
            if (this.elementos[i] != null && this.elementos[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
 
//dar informacion a ala mochila
    public String toString() {
        String cadena="";
        for (int i = 0; i< this.elementos.length; i++) {
            if (this.elementos[i] != null) {
                cadena+=elementos[i]+"\n";
            }
        }
        cadena+="Peso: " + getPeso()+"\n";
        cadena+="Beneficio: " + getBeneficio()+"\n";
        return cadena;
    }
 
}
