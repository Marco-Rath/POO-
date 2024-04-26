
package practicapan;
import java.awt.Color;//para agregar color 
import java.awt.Dimension;//para agregar una tamaño especifico
import javax.swing.JButton;//crear botones
import javax.swing.JFrame;////ventana para agregar
import javax.swing.JLabel;//crear etiquetas en el dibujo
import javax.swing.JPanel;//para agrupar componentes dentro de el
import javax.swing.JTextField;//agregar textos de letras
import javax.swing.SwingConstants;//cuando la etiqueta descrive un componente 
public class Ventana
{
    JFrame ventana;
    JPanel principal;
    
    public Ventana()
    {
        ventana=new JFrame();//crear objeto
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
        JPanel panel = new JPanel();//crear objeto
        panel.setLayout(null); //desactivando el diseño
        ventana.getContentPane().add(panel);
        panel.setBackground(Color.black); //color negro
        
        /* Etiquetas */
        JLabel etiqueta = new JLabel(); //crear objeto
        etiqueta.setText("Ingrese su nombre");//establecemos texto en la etiqueta
        etiqueta.setBounds(10,10,150,30);//dimension del boton
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //establecer alineacion horizontal del texto
        etiqueta.setForeground(Color.pink); //establecer color de texto
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.gray);//fondo de etiqueta
        panel.add(etiqueta);// agregamos la etiqueta al panel
        
        //Botones/
        
        JButton boton1 = new JButton();//crear objeto
        boton1.setText("Enviar");//cuadro de texto del boton
        boton1.setBounds(100,100,100,40);//dimension del boton
        //boton1.setEnabled(false); //habilitar y desabilitar
        boton1.setForeground(Color.orange);//color naranja
        boton1.setBackground(Color.GRAY);//color gris
        panel.add(boton1);
        
        //Cajas de Texto/
        JTextField cajaTexto = new JTextField();//crear objeto
        cajaTexto.setBounds(50,50,100,30);//dimension
        panel.add(cajaTexto);
        
      
    }
}