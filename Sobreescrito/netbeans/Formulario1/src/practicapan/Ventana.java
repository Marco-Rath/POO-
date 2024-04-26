
package practicapan;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Ventana
{
    JFrame ventana;
    JPanel principal;
    
    public Ventana()
    {
        ventana=new JFrame();
        ventana.setSize(600, 400); //Tamaño de la ventana
        ventana.setTitle("Mi primera ventana"); //Titulo de la ventana
        ventana.setLocationRelativeTo(null); //Ubicacion de la ventana
        ventana.setMinimumSize(new Dimension(200,200)); //Estableciendo tamaño minimo
        iniciarComponentes();
        ventana.setVisible(true);      
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes()
    {
        //Panel/
        JPanel panel = new JPanel();
        panel.setLayout(null); //desactivando el diseño
        ventana.getContentPane().add(panel);
        panel.setBackground(Color.black); 
        
        /* Etiquetas */
        JLabel etiqueta = new JLabel(); 
        etiqueta.setText("Ingrese su nombre");//establecemos texto en la etiqueta
        etiqueta.setBounds(10,10,150,30);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //establecer alineacion horizontal del texto
        etiqueta.setForeground(Color.pink); //establecer color de texto
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.gray);//fondo de etiqueta
        panel.add(etiqueta);// agregamos la etiqueta al panel
        
        //Botones/
        
        JButton boton1 = new JButton();
        boton1.setText("Enviar");
        boton1.setBounds(100,100,100,40);
        //boton1.setEnabled(false); //habilitar y desabilitar
        boton1.setForeground(Color.orange);
        boton1.setBackground(Color.GRAY);
        panel.add(boton1);
        
        //Cajas de Texto/
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,100,30);
        panel.add(cajaTexto);
        
      
    }
}