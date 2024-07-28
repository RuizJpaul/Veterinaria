package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Button;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnO;
	private JButton btnX;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JTextField txtUsua;
	private JPasswordField txtPass;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 381, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(20, 21, 328, 318);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				btnO = new JButton("");
				btnO.setIcon(new ImageIcon(Login.class.getResource("/img/comprobado.png")));
				btnO.addActionListener(this);
				btnO.setBounds(96, 256, 40, 40);
				panel.add(btnO);
			}
			{
				btnX = new JButton("");
				btnX.setIcon(new ImageIcon(Login.class.getResource("/img/error.png")));
				btnX.addActionListener(this);
				btnX.setBounds(189, 256, 40, 40);
				panel.add(btnX);
			}
			{
				lblNewLabel = new JLabel("Usuario:");
				lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
				lblNewLabel.setBounds(58, 187, 67, 16);
				panel.add(lblNewLabel);
			}
			{
				lblPassword = new JLabel("Password:");
				lblPassword.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
				lblPassword.setBounds(58, 214, 90, 16);
				panel.add(lblPassword);
			}
			{
				txtUsua = new JTextField();
				txtUsua.setBackground(new Color(51, 255, 204));
				txtUsua.setBounds(189, 186, 86, 20);
				panel.add(txtUsua);
				txtUsua.setColumns(10);
			}
			{
				txtPass = new JPasswordField();
				txtPass.setBackground(new Color(51, 255, 204));
				txtPass.setBounds(189, 213, 86, 20);
				panel.add(txtPass);
			}
			{
				label = new JLabel("");
				label.setBackground(Color.WHITE);
				label.setIcon(new ImageIcon(Login.class.getResource("/img/usuario.png")));
				label.setBounds(96, 29, 131, 132);
				panel.add(label);
			}
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnX) {
			do_btnX_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnO) {
			do_btnO_actionPerformed(arg0);
		}
	}
	protected void do_btnO_actionPerformed(ActionEvent arg0) {
		//Ingresar
		if (txtUsua.getText().equals("Usuario") && txtPass.getText().equals("123456")) {		
			JOptionPane.showMessageDialog(this, "Datos correctos");
			Veterinaria v = new Veterinaria();
			v.setVisible(true); 
			dispose();
		}
		else{
			JOptionPane.showMessageDialog(this, "Usuario o contraseņa incorrectos");
			txtUsua.setText("");
			txtPass.setText("");
		}
	}
	protected void do_btnX_actionPerformed(ActionEvent arg0) {
		//Cerrar
		System.exit(0);
	}
}




