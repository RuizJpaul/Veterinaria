package clases;

public class Mascota {
	private String animal, nom, raza, obs;
	private int edad;
	private double peso, tama�o;
	private ListaConsultas listaC = new ListaConsultas();
	public Mascota(String animal, String nom, String raza, String obs, int edad, 
			double peso, double tama�o) {
		this.animal = animal;
		this.nom = nom;
		this.raza = raza;
		this.obs = obs;
		this.edad = edad;
		this.peso = peso;
		this.tama�o = tama�o;
	}
	public Mascota(){
	}
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
	public ListaConsultas getListaC() {
		return listaC;
	}
	public void setListaC(ListaConsultas listaC) {
		this.listaC = listaC;
	}
}
