import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame implements ActionListener

{
     private JButton Vcolor, Vimagen, VRegistro;
     private PanelRegistro panelRegistro;
     private JLabel label;
    public Ventana()
    {
        setLayout(null);
        setBounds(100,100,700,350);
        setVisible(true);
        
        VRegistro = new JButton ("inicio");
        VRegistro.addActionListener(this);
        VRegistro.setBounds(110,140,150,25);
        VRegistro.setVisible(true);
        add(VRegistro);
       
        panelRegistro = new PanelRegistro();
        panelRegistro.setVisible(false);
        panelRegistro.setBounds(0,0,500,500);
        add(panelRegistro);
        
        label = new JLabel("CALCULADORA");
        label.setBounds(140,0,200,200);
        label.setVisible(true);
        add(label);
    }
   
    public static void main(String[] args)
        {
        Ventana v = new Ventana();
        }
      public void actionPerformed(ActionEvent e)
        {
            Object objeto = e.getSource();
           if(objeto == VRegistro)
           {
              VRegistro.setVisible(false);
              panelRegistro.setVisible(true);
           }
        }  
}

