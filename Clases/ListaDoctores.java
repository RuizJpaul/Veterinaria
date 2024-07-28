package clases;

import java.util.ArrayList;

public class ListaDoctores {
	private static ArrayList<Doctor> listaD = new ArrayList<>();

	public ListaDoctores() {
		AgregarDoctor(new Doctor("Carmen", "Mendoza", "Analisis clinicos", 1001, 68473521));
		AgregarDoctor(new Doctor("Rodrigo", "Aguilar", "Cirujia general", 1002, 84698126));
		AgregarDoctor(new Doctor("Rafael", "Fuertes", "Medicina general", 1003, 76854321));
		AgregarDoctor(new Doctor("Emilio", "Fernandez", "Medicina general", 1004, 76854374));
	}
	public void AgregarDoctor(Doctor d){
		listaD.add(d);
	}
	public static ArrayList<Doctor> getListaD() {
		return listaD;
	}
	public void setListaD(ArrayList<Doctor> listaD) {
		this.listaD = listaD;
	}
}
