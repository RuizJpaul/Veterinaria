package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ListaDoctores;
import clases.ListaUsuarios;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Veterinaria extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel label;
	private JPanel panel;
	private JLabel label_1;
	private JButton btnNewButton;
	private JButton btnMascota;
	private JButton btnConsultaMedica;
	private JButton btnInformes;
	private JButton btnContacto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Veterinaria frame = new Veterinaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Veterinaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			label = new JLabel("");
			label.setIcon(new ImageIcon(Veterinaria.class.getResource("/img/FondoPrincipal.png.jpg")));
			label.setBounds(0, 0, 552, 430);
			contentPane.add(label);
		}
		{
			panel = new JPanel();
			panel.setBackground(new Color(0, 204, 153));
			panel.setBounds(550, 0, 234, 430);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				label_1 = new JLabel("");
				label_1.setIcon(new ImageIcon(Veterinaria.class.getResource("/img/Logo.png.jpg")));
				label_1.setBounds(58, 40, 123, 123);
				panel.add(label_1);
			}
			{
				btnNewButton = new JButton("Cliente");
				btnNewButton.addActionListener(this);
				btnNewButton.setBounds(52, 206, 129, 23);
				panel.add(btnNewButton);
			}
			{
				btnMascota = new JButton("Mascota");
				btnMascota.addActionListener(this);
				btnMascota.setBounds(52, 240, 129, 23);
				panel.add(btnMascota);
			}
			{
				btnConsultaMedica = new JButton("Consulta medica");
				btnConsultaMedica.addActionListener(this);
				btnConsultaMedica.setBounds(52, 274, 129, 23);
				panel.add(btnConsultaMedica);
			}
			{
				btnInformes = new JButton("Informes");
				btnInformes.addActionListener(this);
				btnInformes.setBounds(52, 308, 129, 23);
				panel.add(btnInformes);
			}
			{
				btnContacto = new JButton("Contacto");
				btnContacto.addActionListener(this);
				btnContacto.setBounds(52, 342, 129, 23);
				panel.add(btnContacto);
			}
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnContacto) {
			do_btnContacto_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnInformes) {
			do_btnInformes_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnConsultaMedica) {
			do_btnConsultaMedica_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnMascota) {
			do_btnMascota_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(arg0);
		}
	}
	//Se instancian las listas a usar
	ListaUsuarios lu = new ListaUsuarios();
	ListaDoctores ld = new ListaDoctores();
	
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {
		//Agregar cliente
		Agregar_Cliente ac = new Agregar_Cliente();
		ac.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		ac.setVisible(true);
	}
	protected void do_btnMascota_actionPerformed(ActionEvent arg0) {
		//Agregar mascota
		Agregar_Mascota ag = new Agregar_Mascota();
		ag.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		ag.setVisible(true);
	}
	protected void do_btnConsultaMedica_actionPerformed(ActionEvent arg0) {
		//Consulta medica
		Consulta_Medica cm = new Consulta_Medica();
		cm.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		cm.setVisible(true);
	}
	protected void do_btnInformes_actionPerformed(ActionEvent arg0) {
		//Informes
		Informes i = new Informes();
		i.setVisible(true);
	}
	protected void do_btnContacto_actionPerformed(ActionEvent arg0) {
		//Contacto
		Contacto c = new Contacto();
		c.setVisible(true);
	}
}





