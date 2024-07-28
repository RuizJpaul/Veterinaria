package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Consulta;
import clases.Doctor;
import clases.ListaConsultas;
import clases.ListaDoctores;
import clases.ListaMascotas;
import clases.ListaUsuarios;
import clases.Mascota;
import clases.Receta;
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

public class Consulta_Medica extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JPanel panel_1;
	private Button button;
	private Button button_1;
	private JLabel lblCliente;
	private JLabel lblMascota;
	private JLabel lblConsultaMedica;
	private JLabel lblReceta;
	private JComboBox comboDueño;
	private JComboBox comboNomM;
	private JTextField txtAnimal;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTam;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JLabel lblAnimal;
	private JLabel lblEdad;
	private JLabel lblPeso;
	private JLabel lblTamao;
	private JLabel lblObservaciones;
	private JLabel lblDueo;
	private JComboBox comboDoctor;
	private JTextField txtCodCm;
	private JTextField txtEspecDoc;
	private JTextField txtFecha;
	private JScrollPane scrollPane_1;
	private JTextField txtCodR;
	private JScrollPane scrollPane_2;
	private JLabel lblDoctor;
	private JLabel lblCodigo;
	private JLabel lblEspecialidad;
	private JLabel lblFecha;
	private JLabel lblDescripcin;
	private JLabel lblCodigo_1;
	private JLabel lblDescripcin_1;
	private JTextArea txtObsM;
	private JLabel label;
	private JTextField txtDueño;
	private JTextArea txtDescCm;
	private JTextArea txtDescR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Consulta_Medica dialog = new Consulta_Medica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);	
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Consulta_Medica() {
		setModal(true);
		setBounds(100, 100, 663, 428);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 102, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel = new JPanel();
			panel.setBackground(new Color(0, 153, 153));
			panel.setBounds(20, 11, 298, 343);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				lblCliente = new JLabel("Cliente");
				lblCliente.setForeground(Color.WHITE);
				lblCliente.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
				lblCliente.setBounds(10, 11, 87, 19);
				panel.add(lblCliente);
			}
			{
				lblMascota = new JLabel("Mascota");
				lblMascota.setForeground(Color.WHITE);
				lblMascota.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
				lblMascota.setBounds(10, 96, 87, 19);
				panel.add(lblMascota);
			}
			{
				comboDueño = new JComboBox();
				comboDueño.addActionListener(this);
				comboDueño.setBounds(115, 41, 146, 20);
				comboDueño.setModel(new DefaultComboBoxModel(new String[] {""}));
				for (int i = 0; i < ListaUsuarios.listaU.size(); i++) {
					Usuario u = ListaUsuarios.listaU.get(i);
					comboDueño.addItem(new String(""+u.getDni())); 
				}
				panel.add(comboDueño);
			}
			{
				comboNomM = new JComboBox();
				comboNomM.addActionListener(this);
				comboNomM.setBounds(115, 123, 146, 20);
				comboNomM.setModel(new DefaultComboBoxModel(new String[] {""}));
				panel.add(comboNomM);
			}
			{
				txtAnimal = new JTextField();
				txtAnimal.setEditable(false);
				txtAnimal.setBounds(115, 154, 146, 20);
				panel.add(txtAnimal);
				txtAnimal.setColumns(10);
			}
			{
				txtEdad = new JTextField();
				txtEdad.setEditable(false);
				txtEdad.setBounds(115, 185, 146, 20);
				panel.add(txtEdad);
				txtEdad.setColumns(10);
			}
			{
				txtPeso = new JTextField();
				txtPeso.setEditable(false);
				txtPeso.setBounds(115, 216, 146, 20);
				panel.add(txtPeso);
				txtPeso.setColumns(10);
			}
			{
				txtTam = new JTextField();
				txtTam.setEditable(false);
				txtTam.setBounds(115, 247, 146, 20);
				panel.add(txtTam);
				txtTam.setColumns(10);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(115, 278, 146, 54);
				panel.add(scrollPane);
				{
					txtObsM = new JTextArea();
					txtObsM.setEditable(false);
					scrollPane.setViewportView(txtObsM);
				}
			}
			{
				lblNewLabel = new JLabel("Nombre:");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNewLabel.setBounds(20, 126, 64, 14);
				panel.add(lblNewLabel);
			}
			{
				lblAnimal = new JLabel("Animal:");
				lblAnimal.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblAnimal.setBounds(20, 157, 64, 14);
				panel.add(lblAnimal);
			}
			{
				lblEdad = new JLabel("Edad:");
				lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblEdad.setBounds(20, 188, 64, 14);
				panel.add(lblEdad);
			}
			{
				lblPeso = new JLabel("Peso:");
				lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblPeso.setBounds(20, 219, 64, 14);
				panel.add(lblPeso);
			}
			{
				lblTamao = new JLabel("Tama\u00F1o:");
				lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblTamao.setBounds(20, 250, 64, 14);
				panel.add(lblTamao);
			}
			{
				lblObservaciones = new JLabel("Observaciones:");
				lblObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblObservaciones.setBounds(20, 278, 100, 14);
				panel.add(lblObservaciones);
			}
			{
				lblDueo = new JLabel("Dni:");
				lblDueo.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDueo.setBounds(20, 44, 64, 14);
				panel.add(lblDueo);
			}
			{
				label = new JLabel("Due\u00F1o:");
				label.setFont(new Font("Tahoma", Font.PLAIN, 13));
				label.setBounds(20, 71, 64, 14);
				panel.add(label);
			}
			{
				txtDueño = new JTextField();
				txtDueño.setEditable(false);
				txtDueño.setBounds(115, 69, 146, 20);
				panel.add(txtDueño);
				txtDueño.setColumns(10);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(0, 153, 153));
			panel_1.setBounds(334, 11, 298, 343);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			{
				lblConsultaMedica = new JLabel("Consulta medica");
				lblConsultaMedica.setForeground(Color.WHITE);
				lblConsultaMedica.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
				lblConsultaMedica.setBounds(10, 11, 144, 19);
				panel_1.add(lblConsultaMedica);
			}
			{
				lblReceta = new JLabel("Receta");
				lblReceta.setForeground(Color.WHITE);
				lblReceta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
				lblReceta.setBounds(10, 217, 87, 19);
				panel_1.add(lblReceta);
			}
			{
				comboDoctor = new JComboBox();
				comboDoctor.addActionListener(this);
				comboDoctor.setBounds(138, 41, 126, 19);
				comboDoctor.setModel(new DefaultComboBoxModel(new String[] {""}));
				for (int i = 0; i < ListaDoctores.getListaD().size(); i++) {
					Doctor d = ListaDoctores.getListaD().get(i);
					comboDoctor.addItem(new String(d.getNom()+" "+d.getApe()));  
				}
				panel_1.add(comboDoctor);
			}
			{
				txtCodCm = new JTextField();
				txtCodCm.setEditable(false);
				txtCodCm.setBounds(138, 71, 126, 20);
				txtCodCm.setText(""+ListaConsultas.num++); 
				panel_1.add(txtCodCm);
				txtCodCm.setColumns(10);
			}
			{
				txtEspecDoc = new JTextField();
				txtEspecDoc.setEditable(false);
				txtEspecDoc.setBounds(138, 102, 126, 20);
				panel_1.add(txtEspecDoc);
				txtEspecDoc.setColumns(10);
			}
			{
				txtFecha = new JTextField();
				txtFecha.setBounds(138, 133, 126, 20);
				panel_1.add(txtFecha);
				txtFecha.setColumns(10);
			}
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(138, 164, 126, 42);
				panel_1.add(scrollPane_1);
				{
					txtDescCm = new JTextArea();
					scrollPane_1.setViewportView(txtDescCm);
				}
			}
			{
				txtCodR = new JTextField();
				txtCodR.setEditable(false);
				txtCodR.setBounds(138, 242, 126, 20);
				panel_1.add(txtCodR);
				txtCodR.setColumns(10);
			}
			{
				scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(138, 273, 126, 47);
				panel_1.add(scrollPane_2);
				{
					txtDescR = new JTextArea();
					scrollPane_2.setViewportView(txtDescR);
				}
			}
			{
				lblDoctor = new JLabel("Doctor:");
				lblDoctor.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDoctor.setBounds(33, 43, 64, 14);
				panel_1.add(lblDoctor);
			}
			{
				lblCodigo = new JLabel("Codigo:");
				lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblCodigo.setBounds(33, 70, 95, 20);
				panel_1.add(lblCodigo);
			}
			{
				lblEspecialidad = new JLabel("Especialidad:");
				lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblEspecialidad.setBounds(33, 105, 86, 14);
				panel_1.add(lblEspecialidad);
			}
			{
				lblFecha = new JLabel("Fecha:");
				lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblFecha.setBounds(33, 136, 64, 14);
				panel_1.add(lblFecha);
			}
			{
				lblDescripcin = new JLabel("Descripci\u00F3n:");
				lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDescripcin.setBounds(33, 164, 86, 14);
				panel_1.add(lblDescripcin);
			}
			{
				lblCodigo_1 = new JLabel("Codigo:");
				lblCodigo_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblCodigo_1.setBounds(33, 245, 64, 14);
				panel_1.add(lblCodigo_1);
			}
			{
				lblDescripcin_1 = new JLabel("Descripci\u00F3n:");
				lblDescripcin_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblDescripcin_1.setBounds(33, 273, 86, 14);
				panel_1.add(lblDescripcin_1);
			}
		}
		{
			button = new Button("Cancelar");
			button.addActionListener(this);
			button.setBackground(new Color(0, 153, 153));
			button.setBounds(562, 360, 70, 22);
			contentPanel.add(button);
		}
		{
			button_1 = new Button("Registrar");
			button_1.addActionListener(this);
			button_1.setBackground(new Color(0, 153, 153));
			button_1.setBounds(477, 360, 70, 22);
			contentPanel.add(button_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button_1) {
			do_button_1_actionPerformed(e);
		}
		if (e.getSource() == comboNomM) {
			do_comboNomM_actionPerformed(e);
		}
		if (e.getSource() == comboDoctor) {
			do_comboDoctor_actionPerformed(e);
		}
		if (e.getSource() == comboDueño) {
			do_comboDueño_actionPerformed(e);
		}
		if (e.getSource() == button) {
			do_button_actionPerformed(e);
		}
	}
	protected void do_button_actionPerformed(ActionEvent e) {
		//Cancelar
		int num = ListaConsultas.num--;
		dispose();
	}
	protected void do_comboDueño_actionPerformed(ActionEvent e) {
		//Acciones a realizar por cada opcion seleccionada del combo de DNI
		int idxUsua = comboDueño.getSelectedIndex();
		txtDueño.setText("");
		txtAnimal.setText("");
		txtEdad.setText("");
		txtPeso.setText("");
		txtTam.setText("");
		txtObsM.setText("");
		comboNomM.setModel(new DefaultComboBoxModel(new String[] {""}));
		if(idxUsua!=0){
			Usuario u = ListaUsuarios.listaU.get(idxUsua-1);
			txtDueño.setText(u.getNom());
			if(u.getListaM().getListaM().size()>0){
				for (int i = 0; i < u.getListaM().getListaM().size(); i++) {
					Mascota m = u.getListaM().getListaM().get(i);
					comboNomM.addItem(new String(m.getNom()));
				}
			}
		}
	}
	protected void do_comboDoctor_actionPerformed(ActionEvent e) {
		//Acciones a realizar por cada opcion seleccionada del combo doctor
		int idxDoc = comboDoctor.getSelectedIndex();
		//txtCodDoc.setText("");
		txtEspecDoc.setText("");
		if(idxDoc!=0){
			Doctor d = ListaDoctores.getListaD().get(idxDoc-1);
			//txtCodDoc.setText(""+d.getCod());
			txtEspecDoc.setText(d.getEspec()); 
		}
	}
	protected void do_comboNomM_actionPerformed(ActionEvent e) {
		//Acciones a realizar por cada opcion seleccionada del combo nombre de las mascotas
		int idxUsua = comboDueño.getSelectedIndex();
		int idxMasc = comboNomM.getSelectedIndex();
		txtAnimal.setText("");
		txtEdad.setText("");
		txtPeso.setText("");
		txtTam.setText("");
		txtObsM.setText("");
		if(idxMasc!=0){
			Mascota m = ListaUsuarios.getListaU().get(idxUsua-1).getListaM().getListaM().get(idxMasc-1);
			txtAnimal.setText(m.getAnimal());
			txtEdad.setText(""+m.getEdad());
			txtPeso.setText(""+m.getPeso());
			txtTam.setText(""+m.getTamaño());
			txtObsM.setText(m.getObs());
		}
	}
	protected void do_button_1_actionPerformed(ActionEvent e) {
		//Registrar
		int idxUsua = comboDueño.getSelectedIndex();
		int idxMasc = comboNomM.getSelectedIndex();
		int idxDoc = comboDoctor.getSelectedIndex();
		if(idxMasc!=0 && idxDoc!=0){
			if(Fecha()!=null && DescCm()!=null && DescR()!=null){
				Usuario u = ListaUsuarios.listaU.get(idxUsua-1);
				Mascota m = u.getListaM().getListaM().get(idxMasc-1);
				Receta r = new Receta(NomMasc(), NomDoc(), DescR());
				Consulta c = new Consulta(CodCm(),NomMasc(), NomDoc(), DescCm(), r);
				m.getListaC().getListaC().add(c);
				JOptionPane.showMessageDialog(this, "Consulta realizada exitosamente");
				dispose();
				ListaConsultas.num++;
			}
			else{
				JOptionPane.showMessageDialog(this, "Ingrese los datos correctos");
			}
		}
		else{
			JOptionPane.showMessageDialog(this, "Seleccione la opcion correcta");
		}
	}
	public String Fecha(){
		if(txtFecha.getText().isEmpty()){
			return null;
		}
		else{
			return txtFecha.getText(); 
		}
	}
	public String DescCm(){
		if(txtDescCm.getText().isEmpty()){
			return null;
		}
		else{
			return txtDescCm.getText();
		}
	}
	public String DescR(){
		if(txtDescR.getText().isEmpty()){
			return null;
		}
		else{
			return txtDescR.getText();
		}
	}
	public String NomMasc(){
		return comboNomM.getSelectedItem().toString();
	}
	public String NomDoc(){
		return comboDoctor.getSelectedItem().toString();
	}
	public int CodCm(){
		return Integer.parseInt(txtCodCm.getText());
	}
}











