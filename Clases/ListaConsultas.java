package clases;

import java.util.ArrayList;

public class ListaConsultas {
	public static int num = 100;
	private ArrayList<Consulta> listaC = new ArrayList<>();

	public ArrayList<Consulta> getListaC() {
		return listaC;
	}
	public void setListaC(ArrayList<Consulta> listaC) {
		this.listaC = listaC;
	}
}
