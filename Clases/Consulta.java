package clases;

public class Consulta {
	private int cod;
	private String nomMasc;
	private String nomDoc;
	private String desc;
	private Receta r;
	public Consulta(int cod, String nomMasc,String nomDoc, String desc, Receta r){
		this.cod = cod;
		this.nomMasc = nomMasc;
		this.nomDoc = nomDoc;
		this.desc = desc;
		this.r = r;
	}
	public String getNomMasc() {
		return nomMasc;
	}
	public void setNomMasc(String nomMasc) {
		this.nomMasc = nomMasc;
	}
	public String getNomDoc() {
		return nomDoc;
	}
	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Receta getR() {
		return r;
	}
	public void setR(Receta r) {
		this.r = r;
	}
}
