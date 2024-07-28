package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ListaUsuarios;
import clases.Usuario;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Agregar_Cliente extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private Button button;
	private Button button_1;
	private Button button_2;
	private Button button_3;
	private JLabel lblCliente;
	private JComboBox comboDni;
	private JTextField txtDniNuevo;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtDir;
	private JTextField txtTel;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDireccin;
	private JLabel lblTelfono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Agregar_Cliente dialog = new Agregar_Cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Agregar_Cliente() {
		setModal(true);
		setBounds(100, 100, 355, 349);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 102, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(new Color(0, 153, 153));
			panel.setBounds(20, 11, 298, 241);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				lblCliente = new JLabel("Cliente");
				lblCliente.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 24));
				lblCliente.setForeground(Color.ORANGE);
				lblCliente.setBounds(22, 11, 129, 42);
				panel.add(lblCliente);
			}
			{
				comboDni = new JComboBox();
				comboDni.addActionListener(this);
				comboDni.setBounds(127, 54, 119, 20);
				comboDni.setModel(new DefaultComboBoxModel(new String[] {"","[Agregar dni/usuario]"}));
				for (int i = 0; i < ListaUsuarios.listaU.size(); i++) {
					Usuario u = ListaUsuarios.listaU.get(i);
					comboDni.addItem(new String(""+u.getDni()));
				}
				panel.add(comboDni);
			}
			{
				txtDniNuevo = new JTextField();
				txtDniNuevo.setEditable(false);
				txtDniNuevo.setBounds(127, 81, 119, 20);
				panel.add(txtDniNuevo);
				txtDniNuevo.setColumns(10);
			}
			{
				txtNom = new JTextField();
				txtNom.setBounds(127, 112, 119, 20);
				panel.add(txtNom);
				txtNom.setColumns(10);
			}
			{
				txtApe = new JTextField();
				txtApe.setBounds(127, 137, 119, 20);
				panel.add(txtApe);
				txtApe.setColumns(10);
			}
			{
				txtDir = new JTextField();
				txtDir.setBounds(127, 162, 119, 20);
				panel.add(txtDir);
				txtDir.setColumns(10);
			}
			{
				txtTel = new JTextField();
				txtTel.setBounds(127, 187, 119, 20);
				panel.add(txtTel);
				txtTel.setColumns(10);
			}
			{
				lblDni = new JLabel("DNI:");
				lblDni.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDni.setBounds(51, 57, 46, 14);
				panel.add(lblDni);
			}
			{
				lblNombre = new JLabel("Nombre:");
				lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNombre.setBounds(51, 115, 66, 14);
				panel.add(lblNombre);
			}
			{
				lblApellido = new JLabel("Apellido:");
				lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblApellido.setBounds(51, 140, 66, 14);
				panel.add(lblApellido);
			}
			{
				lblDireccin = new JLabel("Direcci\u00F3n:");
				lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDireccin.setBounds(51, 165, 66, 14);
				panel.add(lblDireccin);
			}
			{
				lblTelfono = new JLabel("Tel\u00E9fono:");
				lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblTelfono.setBounds(51, 190, 66, 14);
				panel.add(lblTelfono);
			}
		}
		{
			button = new Button("Registrar");
			button.addActionListener(this);
			button.setBackground(new Color(0, 153, 153));
			button.setBounds(20, 267, 70, 22);
			contentPanel.add(button);
		}
		{
			button_1 = new Button("Eliminar");
			button_1.addActionListener(this);
			button_1.setBackground(new Color(0, 153, 153));
			button_1.setBounds(96, 267, 70, 22);
			contentPanel.add(button_1);
		}
		{
			button_2 = new Button("Modificar");
			button_2.addActionListener(this);
			button_2.setBackground(new Color(0, 153, 153));
			button_2.setBounds(172, 267, 70, 22);
			contentPanel.add(button_2);
		}
		{
			button_3 = new Button("Cancelar");
			button_3.addActionListener(this);
			button_3.setBackground(new Color(0, 153, 153));
			button_3.setBounds(248, 267, 70, 22);
			contentPanel.add(button_3);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button_2) {
			do_button_2_actionPerformed(e);
		}
		if (e.getSource() == button_1) {
			do_button_1_actionPerformed(e);
		}
		if (e.getSource() == comboDni) {
			do_comboDni_actionPerformed(e);
		}
		if (e.getSource() == button) {
			do_button_actionPerformed(e);
		}
		if (e.getSource() == button_3) {
			do_button_3_actionPerformed(e);
		}
	}
	protected void do_button_3_actionPerformed(ActionEvent e) {
		//Cancelar
		dispose();
	}
	protected void do_button_actionPerformed(ActionEvent e) {
		//Registrar 
		int idx = comboDni.getSelectedIndex();
		if(idx==1){
			if(DniNuevo()!=0 && Nom()!=null && Ape()!=null && Dir()!=null && Tel()!=0){
				if(!Buscar(DniNuevo())){
					ListaUsuarios.listaU.add(new Usuario(Nom(), Ape(), Dir(), DniNuevo(), Tel()));
					JOptionPane.showMessageDialog(this, "Cliente registrado");
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(this, "El cliente ya existe"); 
				}
			}
			else{
				JOptionPane.showMessageDialog(this, "Ingrese los datos correctos");
			}
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione la opcion correcta");
		}
	}
	public boolean Buscar(int dni){
		for (int i = 0; i < ListaUsuarios.listaU.size(); i++) {
			if(ListaUsuarios.listaU.get(i).getDni()==dni){
				return true;
			} 
		}
		return false;
	}
	public int DniNuevo(){
		try {
			int ans = Integer.parseInt(txtDniNuevo.getText());
			return ans;
		} catch (Exception e) {
			return 0;
		}
	}
	public String Nom(){
		if(txtNom.getText().isEmpty()){
			return null;
		}
		else{
			return txtNom.getText();
		}
	}
	public String Ape(){
		if(txtApe.getText().isEmpty()){
			return null;
		}
		else{
			return txtApe.getText();
		}
	}
	public String Dir(){
		if(txtDir.getText().isEmpty()){
			return null;
		}
		else{
			return txtDir.getText();
		}
	}
	public int Tel(){
		try {
			int ans = Integer.parseInt(txtTel.getText());
			return ans;
		} catch (Exception e) {
			return 0;
		}
	}
	protected void do_comboDni_actionPerformed(ActionEvent e) {
		//Accion realizada para cada opcion
		int idx = comboDni.getSelectedIndex();
		if(idx==0){
			txtDniNuevo.setEditable(false);
			txtDniNuevo.setText("");
			txtNom.setText("");
			txtApe.setText("");
			txtDir.setText("");
			txtTel.setText("");
		}
		else if(idx==1){
			txtDniNuevo.setEditable(true);
			txtDniNuevo.setText("");
			txtNom.setText("");
			txtApe.setText("");
			txtDir.setText("");
			txtTel.setText("");
		} 
		else if(idx>1){
			txtDniNuevo.setEditable(false);
			Usuario u = ListaUsuarios.listaU.get(idx-2);
			txtDniNuevo.setText("");
			txtNom.setText(u.getNom());
			txtApe.setText(u.getApe());
			txtDir.setText(u.getDir());
			txtTel.setText(""+u.getTel());
		}
	}
	protected void do_button_1_actionPerformed(ActionEvent e) {
		//Eliminar
		int idx = comboDni.getSelectedIndex();
		if(idx!=0 && idx!=1){
			ListaUsuarios.listaU.remove(idx-2);
			JOptionPane.showMessageDialog(this, "Cliente eliminado");
			dispose();
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione un dni a eliminar");
		}
	}
	protected void do_button_2_actionPerformed(ActionEvent e) { 
		//Modificar
		int idx = comboDni.getSelectedIndex();
		if(idx!=0 && idx!=1){
			if(Nom()!=null && Ape()!=null && Dir()!=null && Tel()!=0){
				Usuario u = ListaUsuarios.listaU.get(idx-2);
				u.setNom(Nom());
				u.setApe(Ape());
				u.setDir(Dir());
				u.setTel(Tel());
				JOptionPane.showMessageDialog(this, "Dato modificados correctamente");
				dispose();
			}
			else{
				JOptionPane.showMessageDialog(this, "Ingrese los datos correctos"); 
			}
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione un dni a modificar");
		}
	}
}




