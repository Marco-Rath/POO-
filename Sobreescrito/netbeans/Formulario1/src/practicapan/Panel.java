
package practicapan;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {
    JFrame ventana;
    JPanel principal; 
    JPanel panDerecho; 
    JPanel panInferior; 
    JButton btnHola;
    
    public Panel()
    {
        ventana = new JFrame(); 
        principal = new JPanel(); 
        panDerecho = new JPanel(); 
        panInferior = new JPanel(); 
        btnHola = new JButton(); 
        inicializaControles();
    }
    private void inicializaControles()
    {
        //Formulario 
        ventana.setSize(600,400);
        ventana.getContentPane().setLayout(null);
        ventana.getContentPane().setBackground(new Color(0,0,0)); 
        ventana.setTitle("Paneles");

        //Paneles 
        principal.setBounds(0,0,400, 200);
        principal.setBackground(new Color(188,136,43));
        ventana.add(principal);

        panDerecho.setBounds(400,0,200, 200); 
        panDerecho.setBackground(new Color(188,102,43)); 
        panDerecho.setLayout(null); 
        ventana.add(panDerecho);

        panInferior.setBounds(0,200,400,    100); 
        panInferior.setBackground(new Color(252,203,209)); 
        panInferior.setLayout(new BoxLayout(panInferior,BoxLayout.Y_AXIS));

        ventana.add(panInferior);

        //Botones 
        btnHola.setText("Saludo");
        btnHola.setBounds(10, 10, 100, 20);
        panDerecho.add(btnHola);
        panInferior.add(btnHola);

        ventana.setVisible(true);
    }
}
