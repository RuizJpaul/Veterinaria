package clases;

public class Usuario {
	private String nom, ape, dir;
	private int tel, dni;
	private ListaMascotas listaM = new ListaMascotas();
	public Usuario(String nom, String ape, String dir, int dni, int tel) {
		this.nom = nom;
		this.ape = ape;
		this.dir = dir;
		this.dni = dni;
		this.tel = tel;
 	} 	
	public Usuario() {
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public ListaMascotas getListaM() {
		return listaM;
	}
	public void setListaM(ListaMascotas listaM) {
		this.listaM = listaM;
	}
}
