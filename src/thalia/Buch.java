package thalia;



public class Buch {
		
	private String titel;
	private String typ;
	private double preis;
	private int auflage;
	
	public Buch(String titel, String typ, double preis, int auflage) {
		this.titel = titel;
		this.typ = typ;
		this.preis = preis;
		this.auflage = auflage;
	}

	public String getTitel() {
		return titel;
	}

	public String getTyp() {
		return typ;
	}

	public double getPreis() {
		return preis;
	}

	public int getAuflage() {
		return auflage;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public void setAuflage(int auflage) {
		this.auflage = auflage;
	}
}
