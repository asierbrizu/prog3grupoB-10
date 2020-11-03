package principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;

public class Cliente {
	
	private VentanaCliente v;
	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnPedidos;
	private JButton btnDeseos;
	private JList listPedidos;
	private JList listDeseos;
	private DefaultComboBoxModel dcm;
	public  DefaultListModel dlm;
	
	HiloCliente hc;
	
	public static void main(String[] args) {
		new Cliente(); 
	}
	
	public Cliente() {
        try {
			SwingUtilities.invokeAndWait( new Runnable() {
				@Override
				public void run() {
			        v = new VentanaCliente();
			        v.setVisible(true);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
        
	}
	private class VentanaCliente extends JFrame implements ActionListener {

    	
		public VentanaCliente() {
			
			// SOCKET CLIENTE
			hc = new HiloCliente();

	        // FINAL CONEXION CLIENTE
    		addWindowListener( new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("Cliente finaliza conexion");
					//hc.fin();
				}
			});
    		//TIEMPO ACTUALIZACION PEDIDOS
			Timer timer = new Timer(1000, this);
			timer.setActionCommand("actual");
			timer.setInitialDelay(0);
			timer.start();

			/*actualizarPedidos(null);
			
			public void actualizarPedidos() {}
			public void solicitarPedido() {}
			*/
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
		
	}
		
}


	
			
		
	
	
	
		
		
	
		
    
	

       
        
	

