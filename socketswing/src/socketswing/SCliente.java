package socketswing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SCliente {

    public static void main(String[] args) {
//        
        cli c= new cli();
        
       String ip = "127.0.0.1";
        int puerto = 4000;
        c.envio1.setText(" socket " + ip + " " + puerto);
        try {
            Socket sk = new Socket(ip, puerto);
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(sk.getInputStream()));
            PrintWriter salida = new PrintWriter(
                    new OutputStreamWriter(sk.getOutputStream()), true);
            c.envio2.setVisible(true);
            c.envio3.setText("Usuario conectado " + " " +"");
            c.envio3.setVisible(true);
            c.envio4.setText("... " + entrada.readLine());
            c.envio4.setVisible(true);
            sk.close();
        } catch (Exception e) {
            c.envio5.setText("Error 404:/: " + e.toString());
            c.envio5.setVisible(true);
        }
       
       
    }

}
