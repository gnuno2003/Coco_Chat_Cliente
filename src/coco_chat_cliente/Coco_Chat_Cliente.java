package coco_chat_cliente;

import java.io.IOException;
import java.net.Socket;


public class Coco_Chat_Cliente {


    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket s = new Socket("192.168.84.44", 1234);
        s.getOutputStream().write("Hola UwU".getBytes());
        //System.out.println(s.getInputStream().read());
        System.out.println(s.getInputStream().read());
    }

    
}
