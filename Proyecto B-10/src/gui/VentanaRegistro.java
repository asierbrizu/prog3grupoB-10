package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class VentanaRegistro extends JFrame {

	public VentanaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventana Registro");

		JLabel lNombre = new JLabel("Nombre:");
		JLabel lContrasenya = new JLabel("Contrase�a:");
		JLabel lCorreo = new JLabel("Correo electr�nico:");
		JLabel lFechaNacimiento = new JLabel("Fecha de nacimiento:");
		JLabel lDireccion = new JLabel("Direcci�n de env�o:");
		JTextField tNombre = new JTextField(25);
		JTextField tContrasenya = new JTextField(25);
		JTextField tCorreo = new JTextField(25);
		JTextField tFechaNacimiento = new JTextField(25);
		JTextField tDirecci�n = new JTextField(25);
		JButton bRegistrarse = new JButton("Registrarse");

		setLayout(new GridLayout(7, 1));

		JPanel pNombre = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pNombre.add(lNombre);
		pNombre.add(tNombre);
		add(pNombre);

		JPanel pContrasenya = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pContrasenya.add(lContrasenya);
		pContrasenya.add(tContrasenya);
		add(pContrasenya);

		JPanel pCorreo = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pCorreo.add(lCorreo);
		pCorreo.add(tCorreo);
		add(pCorreo);

		JPanel pFechaNacimiento = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pFechaNacimiento.add(lFechaNacimiento);
		pFechaNacimiento.add(tFechaNacimiento);
		add(pFechaNacimiento);

		JPanel pDireccion = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pDireccion.add(lDireccion);
		pDireccion.add(tDirecci�n);
		add(pDireccion);

		// En obras
		JPanel pRobot= new JPanel(new FlowLayout(FlowLayout.CENTER));
		pRobot.add(new JLabel("No soy un robot"));
		pRobot.add(new JCheckBox());
		add(pRobot);
		
		bRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal.ventana.dispose();
				VentanaPrincipal.ventana=new VentanaPrincipal();
			}
		});

		add(bRegistrarse);

		setVisible(true);
		setSize(800, 600);
	}

	
}
