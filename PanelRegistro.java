import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PanelRegistro extends JPanel implements ActionListener
{
    int num1,num2;
    String signo;
    private JPanel panel,panel2;
    private JButton guardar,guardar2,guardar3,guardar4,guardar5,guardar6,guardar7,guardar8,guardar9,guardar0;
    private JButton dividir,porsentaje,igual,sumar,restar,multiplicar,borrar;
    public PanelRegistro()
    {
        setLayout(null);
        guardar = new JButton("1");
        guardar.setBounds(0,210,60,60);
        guardar.addActionListener(this);
        add(guardar);
        
        guardar2 = new JButton("2");
        guardar2.setBounds(65,210,60,60);
        guardar2.addActionListener(this);
        add(guardar2);
        
        guardar3 = new JButton("3");
        guardar3.setBounds(130,210,60,60);
        guardar3.addActionListener(this);
        add(guardar3);
        
        guardar4 = new JButton("4");
        guardar4.setBounds(0,145,60,60);
        guardar4.addActionListener(this);
        add(guardar4);
        
        guardar5 = new JButton("5");
        guardar5.setBounds(65,145,60,60);
        guardar5.addActionListener(this);
        add(guardar5);
        
        guardar6 = new JButton("6");
        guardar6.setBounds(130,145,60,60);
        guardar6.addActionListener(this);
        add(guardar6);
        
        guardar7 = new JButton("7");
        guardar7.setBounds(0,80,60,60);
        guardar7.addActionListener(this);
        add(guardar7);
        
        guardar8 = new JButton("8");
        guardar8.setBounds(65,80,60,60);
        guardar8.addActionListener(this);
        add(guardar8);
        
        guardar9 = new JButton("9");
        guardar9.setBounds(130,80,60,60);
        guardar9.addActionListener(this);
        add(guardar9);
        
        guardar0 = new JButton("0");
        guardar0.setBounds(65,275,60,60);
        guardar0.addActionListener(this);
        add(guardar0);
        
        dividir= new JButton("/");
        dividir.setBounds(130,275,60,60);
        dividir.setBackground(Color.gray);
        dividir.addActionListener(this);
        add(dividir);
        
        porsentaje= new JButton("%");
        porsentaje.setBounds(0,275,60,60);
        porsentaje.setBackground(Color.gray);
        porsentaje.addActionListener(this);
        add(porsentaje);
        
        igual= new JButton("=");
        igual.setBounds(195,275,60,60);
        igual.setBackground(Color.gray);
        igual.addActionListener(this);
        add(igual);
        
        sumar= new JButton("+");
        sumar.setBounds(195,210,60,60);
        sumar.setBackground(Color.gray);
        sumar.addActionListener(this);
        add(sumar);
        
        restar= new JButton("-");
        restar.setBounds(195,145,60,60);
        restar.setBackground(Color.gray);
        restar.addActionListener(this);
        add(restar);
        
        multiplicar= new JButton("X");
        multiplicar.setBounds(195,80,60,60);
        multiplicar.setBackground(Color.gray);
        multiplicar.addActionListener(this);
        add(multiplicar);
        
        borrar= new JButton("C");
        borrar.setBounds(195,25,60,43);
        borrar.setBackground(Color.red);
        borrar.addActionListener(this);
        add(borrar);

     //   unomas = new JLabel("1+");
       // unomas.setBounds(40,25,255,43);
      //  unomas.setVisible(false);
      //  add(unomas);
        
        label = new JLabel();
        label.setBounds(20,25,255,43);
        label.setVisible(true);
        add(label);
        
        panel = new JPanel();
        panel.setBounds(0,25,255,43);
        panel.setVisible(true);
        panel.setBackground(Color.white);
        add(panel);
        
        panel2 = new JPanel();
        panel2.setBounds(0,0,260,350);
        panel2.setVisible(true);
        panel2.setBackground(Color.black);
        add(panel2);
    }
    private JLabel label,dos;
    public void actionPerformed(java.awt.event.ActionEvent e)
     {
        Object objeto = e.getSource();
        if(objeto==guardar)
        {
            label.setText(label.getText()+"1");
        }
        if(objeto==guardar2)
        {
            label.setText(label.getText()+"2");
        }
        if(objeto==guardar3)
        {
            label.setText(label.getText()+"3");
        }
        if(objeto==guardar4)
        {
            label.setText(label.getText()+"4");
        }
        if(objeto==guardar5)
        {
            label.setText(label.getText()+"5");
        }
        if(objeto==guardar6)
        {
            label.setText(label.getText()+"6");
        }
        if(objeto==guardar7)
        {
            label.setText(label.getText()+"7");
        }
        if(objeto==guardar8)
        {
            label.setText(label.getText()+"8");
        }
        if(objeto==guardar9)
        {
            label.setText(label.getText()+"9");
        }
        if(objeto==guardar0)
        {
            label.setText(label.getText()+"0");
        }
        if(objeto==sumar)
        {
           num1=Integer.parseInt(label.getText());
           signo="+";
           label.setText("");            
        }
        if(objeto==restar)
        {
           num1=Integer.parseInt(label.getText());
           signo="-";
           label.setText("");            
        }
        if(objeto==dividir)
        {
           num1=Integer.parseInt(label.getText());
           signo="/";
           label.setText("");            
        }
        if(objeto==multiplicar)
        {
           num1=Integer.parseInt(label.getText());
           signo="*";
           label.setText("");            
        }
        if(objeto==borrar)
        {
           label.setText("");            
        }
        if(objeto==porsentaje)
        {
           num1=Integer.parseInt(label.getText());
           signo="%";
           label.setText("");            
        }
        if(objeto==igual)
        {
           num2=Integer.parseInt(label.getText());
           switch(signo){
            case"+":
                label.setText(Integer.toString(num1+num2));
                break;
            case"-":
                label.setText(Integer.toString(num1+num2));
                break; 
            case"*":
                label.setText(Integer.toString(num1+num2));
                break;
            case"/":
                label.setText(Integer.toString(num1+num2));
                break;    
        }
        }
     } 
}
