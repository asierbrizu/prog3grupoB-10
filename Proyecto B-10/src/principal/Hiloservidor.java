package principal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import datos.Producto;
import datos.Usuario;
import principal.Servidor;

public class Hiloservidor extends Thread{
	private ObjectInputStream oin;
	private ObjectOutputStream oou;
	private Socket socket = null;
	private Servidor srv;
	
	private int cliente;
	private boolean funcionando = true;
	
	public void Hiloservidor(Socket socket, int cliente, Servidor srv) {
        //super("ServerThread");
        this.socket = socket;
        this.cliente = cliente;
        this.srv = srv;
    }
	public void run() {
		   
        try {
        	System.out.println("Cliente "+cliente+" trabajando");
        	
			
			oou = new ObjectOutputStream(socket.getOutputStream());
        	oin = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
        	//
        }
     
        	
	
        
	}

}
