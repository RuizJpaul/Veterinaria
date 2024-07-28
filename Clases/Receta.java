package clases;

public class Receta {
	private String mascNom, docNom, desc;
	public Receta(String mascNom, String docNom, String desc) {
		this.mascNom = mascNom;
		this.docNom = docNom;
		this.desc = desc;
	}
	public Receta(){
	}
	public String getMascNom() {
		return mascNom;
	}
	public void setMascNom(String mascNom) {
		this.mascNom = mascNom;
	}
	public String getDocNom() {
		return docNom;
	}
	public void setDocNom(String docNom) {
		this.docNom = docNom;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
