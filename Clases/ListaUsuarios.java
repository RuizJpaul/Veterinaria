package clases;

import java.util.ArrayList;

public class ListaUsuarios {
	public static ArrayList<Usuario> listaU = new ArrayList<>();
	public ListaUsuarios(){
		//Cliente 1 
		Mascota m1 = new Mascota("Perro", "Fido", "Pastor aleman", "Ninguna", 7, 45, 65.8);
		Usuario u1 = new Usuario("Carlos", "Perez", "Cercado de lima", 78459621, 987546123);
		u1.getListaM().getListaM().add(m1);
		//Cliente 2
		Mascota m2 = new Mascota("Gato", "Tom", "Siberiano", "Alergias", 4, 8.150, 34);
		Usuario u2 = new Usuario("Luana", "Garcia", "Breña", 77684211, 916875492);
		u2.getListaM().getListaM().add(m2);
		//Cliente 3
		Mascota m3 = new Mascota("Perro", "Kuki", "Shitzu", "Dermatitis", 7, 8, 26);
		Usuario u3 = new Usuario("Juan", "Cortez", "Jesus Maria", 51847652, 967483721);
		u3.getListaM().getListaM().add(m3);
		//Cliente 4
		Mascota m4 = new Mascota("Perro", "Doki", "Shitzu", "Ninguno", 2, 12, 27);
		Usuario u4 = new Usuario("Paul", "Arones", "Cercado de lima", 76984251, 965874321);
		u4.getListaM().getListaM().add(m4);
		listaU.add(u1);
		listaU.add(u2);
		listaU.add(u3);
		listaU.add(u4);
	} 
	public static void Agregar(Usuario u){
		listaU.add(u);
	}
	public static ArrayList<Usuario> getListaU() {
		return listaU;
	}
	public static void setListaU(ArrayList<Usuario> listaU) {
		ListaUsuarios.listaU = listaU;
	}
}
