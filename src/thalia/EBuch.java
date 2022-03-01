package thalia;

public class EBuch extends Buch{
	
	private int version;
	
	public EBuch(String titel, String typ, double preis, int auflage, int version) {
		super(titel, typ, preis, auflage);
		this.version = version;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
