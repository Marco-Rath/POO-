
package ejemplo;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ejemplo {
    public  ejemplo(){
        JFrame frame;
        JButton botonHola;
        
      
        frame = new JFrame("Ejemplo frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        botonHola= new JButton();
        botonHola.setSize(100,30);
        botonHola.setText("HOLA xD");
        botonHola.setBounds(250,100,100,30);
        frame.add(botonHola);
        
        
        
    }
    public static void main(String[] args) {
        ejemplo guia =new ejemplo();
        
    }
    
}
