package clases;

public class Doctor {
	private String nom, ape, espec;
	private int cod, dni;
	public Doctor(String nom, String ape, String espec, int cod, int dni) {
		this.nom = nom;
		this.ape = ape;
		this.espec = espec;
		this.cod = cod;
		this.dni = dni;
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
	public String getEspec() {
		return espec;
	}
	public void setEspec(String espec) {
		this.espec = espec;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
}
