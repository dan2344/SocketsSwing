
package socketswing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ser  extends JFrame{
    
    JLabel envio1,envio2, envio3, envio4, envio5;
    
    ser(){
        setSize(400, 400);
        setTitle("Servidor");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

	envio1=new JLabel("Esperando conexión...");
        envio1.setBounds(50,50,200,20);
        add(envio1);
        
        envio2=new JLabel("Conexion Completada");
        envio2.setBounds(50,75,200,20);
        add(envio2);
        envio2.setVisible(false);
        
        envio3=new JLabel("");
        envio3.setBounds(50,75,200,20);
        add(envio3);
        envio3.setVisible(false);
        
        
        envio4=new JLabel("");
        envio4.setBounds(50,100,200,20);
        add(envio4);
        envio4.setVisible(false);
        
        envio5=new JLabel("");
        envio5.setBounds(50,100,200,20);
        add(envio5);
        envio5.setVisible(false);
        setVisible(true);
		
    }
    
    
}
