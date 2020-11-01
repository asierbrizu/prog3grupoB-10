package principal;

import java.io.ObjectInputStream;

import datos.Producto;
import datos.Usuario;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

public class HiloCliente {
	
	public final String DEFAULT_DIRECC = "127.0.0.1";
	public final int DEFAULT_PUERTO = 4442;
    private String direcc;
    private int puerto;
    
    private ObjectInputStream oin = null;
    private ObjectOutputStream oos = null;
    private Socket ssocket = null;
    
    public HiloCliente() {
    	super();
    	this.direcc = DEFAULT_DIRECC;
    	this.puerto = DEFAULT_PUERTO;
    	
    	try {
    		ssocket = new Socket(this.direcc, this.puerto);
    		oin = new ObjectInputStream(ssocket.getInputStream());
			oos = new ObjectOutputStream(ssocket.getOutputStream());
    	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //DESCONEXION CLIENTE SERVIDOR
    public void finconexion() {
		System.out.println("FIN CLIENTE");
		try {
			oos.writeObject("FIN");

			if (oin!=null)  oin.close();
			if ( oos!=null)  oos.close();
			if (ssocket!=null) ssocket.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    //GETS Y SETTERS
    public String getDirecc() {
		return direcc;
	}

	public void setDirecc(String direcc) {
		this.direcc = direcc;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
    
	

}
