package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setLayout(new GridLayout(2,1));
		
		JMenuBar barra = new JMenuBar();
		JMenuItem registrarse = new JMenuItem("Registrarse");
		JMenuItem iniciarSesion = new JMenuItem("Iniciar sesión");
		JMenu miCuenta = new JMenu("Mi cuenta");
		JMenuItem perfil = new JMenuItem("Perfil");
		JMenuItem pedidos = new JMenuItem("Pedidos");
		JMenuItem deseados = new JMenuItem("Lista de deseados");
		JMenuItem cerrarSesion = new JMenuItem("Cerrar sesión");

		JPanel superior=new JPanel();
		JPanel inferiores=new JPanel();
		JPanel izquierdo=new JPanel();
		JPanel derecho=new JPanel();
		JLabel titulo=new JLabel("Destacados/Ofertas");
		
		//superior.setBorder(BorderFactory.createEmptyBorder(200, 20, 20, 20));
		
		inferiores.setLayout(new GridLayout(1,2));
		
		
		superior.add(titulo);
		inferiores.add(izquierdo);
		inferiores.add(derecho);
		
		add(superior);
		add(inferiores);
		
		
		
		// Mas adelante eso será distinto para que sea igual en todas las ventanas
		registrarse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Registrandose");
			}
		});
		iniciarSesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				barra.removeAll();
				barra.add(miCuenta);
				validate();
				repaint();
			}
		});
		cerrarSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				barra.removeAll();
				barra.add(iniciarSesion);
				barra.add(registrarse);
				validate();
				repaint();
			}
		});
		barra.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
		
		iniciarSesion.setMaximumSize(new Dimension(120,30));
		
		registrarse.setMaximumSize(new Dimension(120,30));
		setJMenuBar(barra);
		miCuenta.add(perfil);
		miCuenta.add(pedidos);
		miCuenta.add(deseados);
		miCuenta.add(cerrarSesion);
		barra.add(iniciarSesion);
		barra.add(registrarse);
		

		setVisible(true);
		setSize(800, 600);

	}

	

}
