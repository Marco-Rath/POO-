
package Instrumentosmusicales;


public class principal {
    public static void main(String[] args) {
        sonido sonido01,sonido02;
        sonido01=new reloj();
        sonido02=new piano();
        //implementado
        guitarra guitarra01=new guitarra();
        sonido01.suena();
        sonido02.suena();
        guitarra01.suena();
    }
    
}
