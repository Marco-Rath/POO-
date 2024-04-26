
package Instrumentosmusicales;


public class principal {
    public static void main(String[] args) {
        sonido sonido01,sonido02;
        guarda guarda01,guarda02;
        sonido01=new reloj();
        sonido02=new piano();
        guarda01=new reloj();
        guarda02=new piano();
        
        //implementado
        guitarra guitarra01=new guitarra();
        sonido01.suena();
        sonido02.suena();
        guitarra01.suena();
        //para guarda
        guarda01.guarda();
        guarda02.guarda();
        guitarra01.guarda();
    }
    
}
