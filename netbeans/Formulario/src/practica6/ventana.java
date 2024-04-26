
package practica6;
import javax.swing.JFrame;//Jframe sirbe para crear ventana 
//Japplet sirbe para para una ventana animada e interactiva
public class ventana extends JFrame {
    public ventana(){
          setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra la ventana
        setSize(500,500);//dimencion de la ventana que aparece
        setTitle("Mi ventana personal");
       setLocation(300,300);
        setBounds(300,100,500,500); //posicion y tamaño;
        setLocationRelativeTo(null);//centro
       // setMinimumSize();
        
        
        
        
        
        setVisible(true);
    }
    
    
    
}
