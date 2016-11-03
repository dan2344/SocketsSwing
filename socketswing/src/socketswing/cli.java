
package socketswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class cli extends JFrame{
    
    JLabel envio1,envio2,envio3,envio4,envio5;
    
    cli(){
        setSize(400, 400);
        setTitle("Cliente");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

	envio1=new JLabel("Conexion");
        envio1.setBounds(50,50,400,20);
        add(envio1);
        
        envio2=new JLabel("enviando...");
        envio2.setBounds(50,100,400,20);
        add(envio2);
        envio2.setVisible(false);
        setVisible(true);
	
        envio3=new JLabel("enviando...");
        envio3.setBounds(50,100,400,20);
        add(envio3);
        envio3.setVisible(false);
        setVisible(true);
        
        envio4=new JLabel("enviando...");
        envio4.setBounds(50,100,400,20);
        add(envio4);
        envio4.setVisible(false);
        setVisible(true);
        
        envio5=new JLabel("enviando...");
        envio5.setBounds(50,100,400,20);
        add(envio5);
        envio5.setVisible(false);
        setVisible(true);
    }
}
