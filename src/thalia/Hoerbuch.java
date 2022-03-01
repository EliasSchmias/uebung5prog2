package thalia;

public class Hoerbuch extends Buch{
	
	private String modus;
	
	public Hoerbuch(String titel, String typ, double preis, int auflage, String modus) {
		super(titel, typ, preis, auflage);
		this.modus = modus;
	}

	public String getModus() {
		return modus;
	}

	public void setModus(String modus) {
		this.modus = modus;
	}

}
