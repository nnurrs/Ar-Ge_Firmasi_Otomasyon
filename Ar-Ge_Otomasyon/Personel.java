package nyp_odev;

public class Personel extends Departman {

	private static int syc1=100;
	private int perID;
	private String perAd;
	private String perSoyad;
	private int perYas;
	
	public Personel(int depNo, String perAd, String perSoyad, int perYas) {
		super(depNo);
		this.perAd = perAd;
		this.perSoyad = perSoyad;
		this.perYas = perYas;
	}

	public Personel() {
		
	}

	public Personel(String perAd2, String perSoyad2, int perYas2) {
		this.perID = syc1++;
		perAd =perAd2;
		perSoyad = perSoyad2;
		perYas=perYas2;
	}
	
	public void personelYazdir()
	{
		System.out.println(perID+" "+perAd+" "+perSoyad+" "+perYas);
		
	}
	
	public int getPerID() {
		return perID;
	}

	public void setPerID(int perID) {
		this.perID = perID;
	}

	public String getPerAd() {
		return perAd;
	}

	public void setPerAd(String perAd) {
		this.perAd = perAd;
	}

	public String getPerSoyad() {
		return perSoyad;
	}

	public void setPerSoyad(String perSoyad) {
		this.perSoyad = perSoyad;
	}

	public int getPerYas() {
		return perYas;
	}

	public void setPerYas(int perYas) {
		this.perYas = perYas;
	}
	
	
	
}
