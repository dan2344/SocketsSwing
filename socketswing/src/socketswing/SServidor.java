package socketswing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class SServidor {
 
   public static void main(String args[]) {
       
       ser ss= new ser();
 
       Vector<String> datosRecibidos = new Vector<String>();
 
       try {
             ServerSocket s = new ServerSocket(4000);
                   
             while (true) {
                 
                    Socket cliente = s.accept();
                    ss.envio2.setVisible(true);
                    BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(cliente.getInputStream()));
                    PrintWriter salida = new PrintWriter(
                    new OutputStreamWriter(cliente.getOutputStream()),true);
                    String datos = entrada.readLine();
                    if (datos.equals("DATOS")){
                           for (int n=0; n<datosRecibidos.size(); n++ ){
                                  salida.println(datosRecibidos.get(n));
                           }
                    } else {
                           datosRecibidos.add(0, datos);
                           salida.println("OK");
                    }
                    ss.envio4.setVisible(true);
                    cliente.close();
                    
             }
             
       } catch (IOException e) {
             System.out.println(e);
       }
       
}
    private Object texto2;
    private Object texto4;
}
