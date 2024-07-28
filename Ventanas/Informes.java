package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clases.ListaUsuarios;
import clases.Mascota;
import clases.Usuario;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Informes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Informes dialog = new Informes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	ArrayList<Usuario> listaU = ListaUsuarios.listaU;
	/**
	 * Create the dialog.
	 */
	public Informes() {
		setModal(true);
		setBounds(100, 100, 680, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 102, 153));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 44, 644, 206);
			contentPanel.add(scrollPane);
			{
				DefaultTableModel d = new DefaultTableModel();
				d.addColumn("DNI");
				d.addColumn("Dueño");
				d.addColumn("Mascota");
				d.addColumn("Tipo");
				d.addColumn("Numero de consultas");
				table = new JTable(d);
				for (int i = 0; i < listaU.size(); i++) {
					Usuario u = listaU.get(i);
					int cant = u.getListaM().getListaM().size();
					if(cant>0){
						for (int j = 0; j < cant; j++) {
							Mascota m = u.getListaM().getListaM().get(j); 
							d.addRow(new Object[]{u.getDni(),u.getNom(),m.getNom(),m.getAnimal(),m.getListaC().getListaC().size()});
						}
					}
					else{
						d.addRow(new Object[]{u.getDni(),u.getNom(),"null","null"}); 
					}
				}
				scrollPane.setViewportView(table);
			}
		}
	}
}
