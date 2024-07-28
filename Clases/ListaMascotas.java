package clases;

import java.util.ArrayList;

public class ListaMascotas {
	private ArrayList<Mascota> listaM = new ArrayList<>();
	public ListaMascotas(Mascota m){
		listaM.add(m);
	}
	public ListaMascotas(){
	}
	public ArrayList<Mascota> getListaM() {
		return listaM;
	}
	public void setListaM(ArrayList<Mascota> listaM) {
		this.listaM = listaM;
	}
	
}
 