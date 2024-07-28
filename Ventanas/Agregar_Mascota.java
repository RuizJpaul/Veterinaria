package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ListaMascotas;
import clases.ListaUsuarios;
import clases.Mascota;
import clases.Usuario;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Agregar_Mascota extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private Button button;
	private Button button_1;
	private Button button_2;
	private Button button_3;
	private JLabel lblMascota;
	private JComboBox comboDueño;
	private JComboBox comboNom;
	private JTextField txtNomNuevo;
	private JComboBox comboAnimal;
	private JTextField txtRaza;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTam;
	private JScrollPane scrollPane;
	private JLabel lblDueo;
	private JLabel lblAnimal;
	private JLabel lblAnimal_1;
	private JLabel lblRaza;
	private JLabel lblEdad;
	private JLabel lblPeso;
	private JLabel lblTamao;
	private JLabel lblObservaciones;
	private JTextArea txtObs;
	private JTextField txtDueño;
	private JLabel lblDueo_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Agregar_Mascota dialog = new Agregar_Mascota();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Agregar_Mascota() {
		setModal(true);
		setBounds(100, 100, 355, 476);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 102, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(new Color(0, 153, 153));
			panel.setBounds(21, 11, 298, 366);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				lblMascota = new JLabel("Mascota");
				lblMascota.setForeground(Color.ORANGE);
				lblMascota.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 24));
				lblMascota.setBounds(21, 11, 117, 38);
				panel.add(lblMascota);
			}
			{
				comboDueño = new JComboBox();
				comboDueño.addActionListener(this);
				comboDueño.setBounds(135, 60, 117, 20);
				comboDueño.setModel(new DefaultComboBoxModel(new String[] {""}));
				for (int i = 0; i < ListaUsuarios.listaU.size(); i++) {
					Usuario u = ListaUsuarios.listaU.get(i);
					comboDueño.addItem(new String(""+u.getDni())); 
				}
				panel.add(comboDueño);
			}
			{
				int idx = comboDueño.getSelectedIndex();
				comboNom = new JComboBox();
				comboNom.addActionListener(this);
				comboNom.setBounds(135, 113, 117, 20);
				comboNom.setModel(new DefaultComboBoxModel(new String[] {"","[Agregar mascota]"}));
				panel.add(comboNom);
			}
			{
				txtNomNuevo = new JTextField();
				txtNomNuevo.setEditable(false);
				txtNomNuevo.setBounds(135, 139, 117, 20);
				panel.add(txtNomNuevo);
				txtNomNuevo.setColumns(10);
			}
			{
				comboAnimal = new JComboBox();
				comboAnimal.setBounds(135, 164, 117, 20);
				comboAnimal.setModel(new DefaultComboBoxModel(new String[] {"","Perro","Gato"}));
				panel.add(comboAnimal);       
			}
			{
				txtRaza = new JTextField();
				txtRaza.setBounds(135, 189, 117, 20);
				panel.add(txtRaza);
				txtRaza.setColumns(10);
			}
			{
				txtEdad = new JTextField();
				txtEdad.setBounds(135, 215, 117, 20);
				panel.add(txtEdad);
				txtEdad.setColumns(10);
			}
			{
				txtPeso = new JTextField();
				txtPeso.setBounds(135, 242, 117, 20);
				panel.add(txtPeso);
				txtPeso.setColumns(10);
			}
			{
				txtTam = new JTextField();
				txtTam.setBounds(135, 270, 117, 20);
				panel.add(txtTam);
				txtTam.setColumns(10);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(135, 301, 117, 54);
				panel.add(scrollPane);
				{
					txtObs = new JTextArea();
					scrollPane.setViewportView(txtObs);
				}
			}
			{
				lblDueo = new JLabel("Dni:");
				lblDueo.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDueo.setBounds(41, 62, 58, 14);
				panel.add(lblDueo);
			}
			{
				lblAnimal = new JLabel("Nombre:");
				lblAnimal.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblAnimal.setBounds(41, 116, 58, 14);
				panel.add(lblAnimal);
			}
			{
				lblAnimal_1 = new JLabel("Animal:");
				lblAnimal_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblAnimal_1.setBounds(41, 167, 58, 14);
				panel.add(lblAnimal_1);
			}
			{
				lblRaza = new JLabel("Raza:");
				lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblRaza.setBounds(41, 192, 58, 14);
				panel.add(lblRaza);
			}
			{
				lblEdad = new JLabel("Edad:");
				lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblEdad.setBounds(41, 218, 58, 14);
				panel.add(lblEdad);
			}
			{
				lblPeso = new JLabel("Peso:");
				lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblPeso.setBounds(41, 245, 58, 14);
				panel.add(lblPeso);
			}
			{
				lblTamao = new JLabel("Tama\u00F1o:");
				lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblTamao.setBounds(41, 273, 58, 14);
				panel.add(lblTamao);
			}
			{
				lblObservaciones = new JLabel("Observaciones:");
				lblObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblObservaciones.setBounds(41, 301, 97, 14);
				panel.add(lblObservaciones);
			}
			{
				txtDueño = new JTextField();
				txtDueño.setEditable(false);
				txtDueño.setBounds(135, 85, 117, 20);
				panel.add(txtDueño);
				txtDueño.setColumns(10);
			}
			{
				lblDueo_1 = new JLabel("Due\u00F1o:");
				lblDueo_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDueo_1.setBounds(41, 88, 58, 14);
				panel.add(lblDueo_1);
			}
		}
		{
			button = new Button("Registrar");
			button.addActionListener(this);
			button.setBackground(new Color(0, 153, 153));
			button.setBounds(21, 394, 70, 22);
			contentPanel.add(button);
		}
		{
			button_1 = new Button("Eliminar");
			button_1.addActionListener(this);
			button_1.setBackground(new Color(0, 153, 153));
			button_1.setBounds(97, 394, 70, 22);
			contentPanel.add(button_1);
		}
		{
			button_2 = new Button("Modificar");
			button_2.addActionListener(this);
			button_2.setBackground(new Color(0, 153, 153));
			button_2.setBounds(173, 394, 70, 22);
			contentPanel.add(button_2);
		}
		{
			button_3 = new Button("Cancelar");
			button_3.addActionListener(this);
			button_3.setBackground(new Color(0, 153, 153));
			button_3.setBounds(249, 394, 70, 22);
			contentPanel.add(button_3);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button_2) {
			do_button_2_actionPerformed(arg0);
		}
		if (arg0.getSource() == button_1) {
			do_button_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == button) {
			do_button_actionPerformed(arg0);
		}
		if (arg0.getSource() == comboNom) {
			do_comboNom_actionPerformed(arg0);
		}
		if (arg0.getSource() == comboDueño) {
			do_comboDueño_actionPerformed(arg0);
		}
		if (arg0.getSource() == button_3) {
			do_button_3_actionPerformed(arg0);
		}
	}
	protected void do_button_3_actionPerformed(ActionEvent arg0) {
		//Cancelar
		dispose();
	}
	protected void do_comboDueño_actionPerformed(ActionEvent arg0) {
		//Accion realizada para cada opcion del comboBox de dueños
		int idx = comboDueño.getSelectedIndex();
		txtNomNuevo.setEditable(false);
		comboAnimal.setSelectedItem("");
		txtNomNuevo.setText("");
		txtRaza.setText("");
		txtEdad.setText("");
		txtPeso.setText("");
		txtTam.setText("");
		txtObs.setText("");
		if(idx!=0){
			Usuario	u = ListaUsuarios.listaU.get(idx-1);
			txtDueño.setText(u.getNom());
			//LISTAR comboBox con los nombres de las mascotas
			comboNom.setModel(new DefaultComboBoxModel(new String[] {"","[Agregar mascota]"}));
			if(u.getListaM().getListaM().size()>0){
				for (int i = 0; i < u.getListaM().getListaM().size(); i++) {
					Mascota m = u.getListaM().getListaM().get(i);
					comboNom.addItem(new String(m.getNom()));
				}
			}
		}
		else{
			txtDueño.setText("");
			comboNom.setModel(new DefaultComboBoxModel(new String[] {"","[Agregar mascota]"}));
		}
	}
	protected void do_comboNom_actionPerformed(ActionEvent arg0) {
		//Accion realizada para cada opcion del comboBox de mascotas
		int idxUsua = comboDueño.getSelectedIndex();
		int idxMasc = comboNom.getSelectedIndex();
		if(idxMasc==0){
			txtNomNuevo.setEditable(false);
			comboAnimal.setSelectedItem("");
			txtNomNuevo.setText("");
			txtRaza.setText("");
			txtEdad.setText("");
			txtPeso.setText("");
			txtTam.setText("");
			txtObs.setText("");
		}
		else if(idxMasc==1){
			txtNomNuevo.setEditable(true);
			comboAnimal.setSelectedItem("");
			txtNomNuevo.setText("");
			txtRaza.setText("");
			txtEdad.setText("");
			txtPeso.setText("");
			txtTam.setText("");
			txtObs.setText("");
		}
		else if(idxMasc>1){
			txtNomNuevo.setEditable(false);
			Usuario u = ListaUsuarios.listaU.get(idxUsua-1);
			Mascota m = u.getListaM().getListaM().get(idxMasc-2);
			txtNomNuevo.setText("");
			comboAnimal.setSelectedItem(m.getAnimal());
			txtRaza.setText(m.getRaza());
			txtEdad.setText(""+m.getEdad());
			txtPeso.setText(""+m.getPeso());
			txtTam.setText(""+m.getTamaño());
			txtObs.setText(m.getObs());
		}
	}
	protected void do_button_actionPerformed(ActionEvent arg0) {
		//Registrar
		int idxUsua = comboDueño.getSelectedIndex();
		int idxMasc = comboNom.getSelectedIndex();
		if(idxUsua!=0 && idxMasc==1){
			int numMasc = ListaUsuarios.listaU.get(idxUsua-1).getListaM().getListaM().size();
			if(NombreNuevo()!=null && Animal()!=null && Raza()!=null && Edad()!=0 && Peso()!=0 && Tamaño()!=0 && Obs()!=null){
				if(numMasc>0){
					ListaMascotas lm  = ListaUsuarios.listaU.get(idxUsua-1).getListaM();
					if(!Buscar(NombreNuevo(), lm)){
						ListaUsuarios.listaU.get(idxUsua-1).getListaM().getListaM().
						add(new Mascota(Animal(), NombreNuevo(), Raza(), Obs(), Edad(), Peso(), Tamaño()));
						JOptionPane.showMessageDialog(this, "Se ha agregado a la mascota con exito");
						dispose();
					}
					else{
						JOptionPane.showMessageDialog(this, "La mascota ya existe en el sistema");
					}
				}
				else{
					ListaUsuarios.listaU.get(idxUsua-1).getListaM().getListaM().
					add(new Mascota(Animal(), NombreNuevo(), Raza(), Obs(), Edad(), Peso(), Tamaño()));
					JOptionPane.showMessageDialog(this, "Se ha agregado a la mascota con exito");
					dispose();
				}
			}
			else{
				JOptionPane.showMessageDialog(this, "Ingrese los datos correctos");
			}
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione [Agregar mascota]");
		}
	}
	public boolean Buscar(String nom, ListaMascotas lm){
		//Busca el nombre de la mascota en la lista
		for (int i = 0; i < lm.getListaM().size(); i++) {
			if(lm.getListaM().get(i).getNom().equals(nom)){
				return true;
			}
		}
		return false;
	}
	public String NombreNuevo(){
		if(txtNomNuevo.getText().isEmpty()){
			return null;
		}
		else{
			return txtNomNuevo.getText();
		}
	}
	public String Animal(){
		if(comboAnimal.getSelectedItem().toString().isEmpty()){
			return null;
		}
		else{
			return comboAnimal.getSelectedItem().toString();
		}
	}
	public String Raza(){
		if(txtRaza.getText().isEmpty()){
			return null;
		}
		else{
			return txtRaza.getText();
		}
	}
	public int Edad(){
		try {
			int ans = Integer.parseInt(txtEdad.getText());
			return ans;
		} catch (Exception e) {
			return 0;
		}
	}
	public double Peso(){
		try {
			double ans = Double.parseDouble(txtPeso.getText());
			return ans;
		} catch (Exception e) {
			return 0;
		}
	}
	public double Tamaño(){
		try {
			double ans = Double.parseDouble(txtTam.getText());
			return ans;
		} catch (Exception e) {
			return 0;
		}
	}
	public String Obs(){
		if(txtObs.getText().isEmpty()){
			return null;
		}
		else{
			return txtObs.getText();
		}
	}
	protected void do_button_1_actionPerformed(ActionEvent arg0) {
		//Eliminar
		int idxUsua = comboDueño.getSelectedIndex();
		int idxMasc = comboNom.getSelectedIndex();
		if(idxMasc!=0 && idxMasc!=1){
			Mascota m = ListaUsuarios.listaU.get(idxUsua-1).getListaM().getListaM().get(idxMasc-2);
			ListaUsuarios.listaU.get(idxUsua-1).getListaM().getListaM().remove(m);
			JOptionPane.showMessageDialog(this, "La mascota ha sido eliminada");
			dispose();
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione una mascota a eliminar");
		}
	}
	protected void do_button_2_actionPerformed(ActionEvent arg0) {
		//Modificar
		int idxUsua = comboDueño.getSelectedIndex();
		int idxMasc = comboNom.getSelectedIndex();
		if(idxMasc!=0 && idxMasc!=1){
			Mascota m = ListaUsuarios.listaU.get(idxUsua-1).getListaM().getListaM().get(idxMasc-2);
			if(Animal()!=null && Raza()!=null && Edad()!=0 && Peso()!=0 && Tamaño()!=0 && Obs()!=null){
				m.setAnimal(Animal());
				m.setRaza(Raza());
				m.setEdad(Edad());
				m.setPeso(Peso());
				m.setTamaño(Tamaño());
				m.setObs(Obs());
				JOptionPane.showMessageDialog(this, "Datos modificados");
				dispose();
			}
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione una mascota a modificar");
		}
	}
}




