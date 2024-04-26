
package practica6;
import javax.swing.JFrame;
public class ventana extends JFrame {
    public ventana(){
          setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);//dimencion de la ventana que aparece
        setTitle("Mi ventana personal");
       setLocation(300,300);
        setBounds(300,100,500,500); //posicion y tamaño;
        setLocationRelativeTo(null);//centro
       // setMinimumSize();
        
        
        
        
        
        setVisible(true);
    }
    
    
    
}
