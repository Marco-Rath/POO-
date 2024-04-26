
package practica;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Formulario {
    JFrame ventana;
JButton botonHola;
JButton botonSalir;
FlowLayout miFlowLayout;
JLabel tituloPrincipal;
JTextField cajaDato01;
public Formulario()
{
//Layouts
miFlowLayout = new FlowLayout(FlowLayout.RIGHT,3,3);
//Formulario ventana
ventana=new JFrame();
ventana.setSize(600, 400); //Tamaño de la ventana
ventana.setTitle("Mi primera ventana"); //titulo de la ventana
//ventana.setBackground(new Color(10,12,15) );
ventana.getContentPane().setLayout(null);
ventana.getContentPane().setBackground(new Color(255,127,42) );
ventana.setLocation(400,200);
ventana.setDefaultCloseOperation(2);//2=DISPOSE_ON_CLOSE
//Botones
//BotonHola
botonHola=new JButton();
botonHola.setSize(100, 30);
botonHola.setText("Hola");
botonHola.setBounds(250, 100, 100, 30);
ventana.add(botonHola);
//BotonSalir
botonSalir=new JButton();
botonSalir.setSize(100, 30);
botonSalir.setText("Salir");
botonSalir.setBounds(420, 300, 100, 30);
ventana.add(botonSalir);
//Label tituloPrincipal
tituloPrincipal=new JLabel();
tituloPrincipal.setText("UNIVERSIDAD NACIONAL MICAELA BASTIDAS DE APURIMAC");
tituloPrincipal.setBounds(100, 10, 400, 80);
ventana.add(tituloPrincipal);
//Cajas de texto
//JTextField
cajaDato01=new JTextField();
cajaDato01.setBounds(20,100,200,20);
ventana.add(cajaDato01);
ventana.setVisible(true);
    
}      
}
