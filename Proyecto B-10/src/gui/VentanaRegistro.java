package gui;

import java.awt.*;
import javax.swing.*;





public class VentanaRegistro extends JFrame{
	
	
	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventana Registro");
		
		JLabel lNombre=new JLabel("Nombre:");
		JLabel lContrasenya=new JLabel("Contraseña:");
		JLabel lCorreo=new JLabel("Correo electrónico:");
		JLabel lFechaNacimiento=new JLabel("Fecha de nacimiento:");
		JLabel lDireccion=new JLabel("Dirección de envío:");
		JTextField tNombre=new JTextField(25);
		JTextField tContrasenya=new JTextField(25);
		JTextField tCorreo=new JTextField(25);
		JTextField tFechaNacimiento=new JTextField(25);
		JTextField tDirección=new JTextField(25);
		JButton bRegistrarse=new JButton("Registrarse");
		
		setLayout(new GridLayout(7,1));
		
		JPanel pNombre=new JPanel(new FlowLayout(FlowLayout.LEFT));
		pNombre.add(lNombre);
		pNombre.add(tNombre);
		add(pNombre);
		
		JPanel pContrasenya=new JPanel(new FlowLayout(FlowLayout.LEFT));
		pContrasenya.add(lContrasenya);
		pContrasenya.add(tContrasenya);
		add(pContrasenya);
		
		JPanel pCorreo=new JPanel(new FlowLayout(FlowLayout.LEFT));
		pCorreo.add(lCorreo);
		pCorreo.add(tCorreo);
		add(pCorreo);
		
		JPanel pFechaNacimiento=new JPanel(new FlowLayout(FlowLayout.LEFT));
		pFechaNacimiento.add(lFechaNacimiento);
		pFechaNacimiento.add(tFechaNacimiento);
		add(pFechaNacimiento);

		
		JPanel pDireccion=new JPanel(new FlowLayout(FlowLayout.LEFT));
		pDireccion.add(lDireccion);
		pDireccion.add(tDirección);
		add(pDireccion);
		
		//En obras
		add(new JLabel("No soy un robot"));
		
		add(bRegistrarse);
		
		setVisible(true);
		setSize(800, 600);
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new VentanaRegistro();
			}

		});
	}
}
