package nyp_odev;

public class Proje extends Departman{

	private static int syc2=10;
	private int projeID;
	private String projeAd;
	private int projeSure;
	private int projeMaliyet;
	
	public Proje(int depNo, String projeAd, int projeSure, int projeMaliyet) {
		super(depNo);
		this.projeAd = projeAd;
		this.projeSure = projeSure;
		this.projeMaliyet = projeMaliyet;
	}

	public void projeYazdir()
	{
		System.out.println(projeID+" "+projeAd+" "+projeMaliyet+" "+projeSure);
	}
	public Proje() {
		
	}

	public Proje(String projeAd2, int projeSure2, int projeMaliyet2) {
		this.projeID = syc2++;
		projeAd = projeAd2;
		projeSure = projeSure2;
		projeMaliyet = projeMaliyet2;
	}

	public int getProjeID() {
		return projeID;
	}

	public void setProjeID(int projeID) {
		this.projeID = projeID;
	}

	public String getProjeAd() {
		return projeAd;
	}

	public void setProjeAd(String projeAd) {
		this.projeAd = projeAd;
	}

	public int getProjeSure() {
		return projeSure;
	}

	public void setProjeSure(int projeSure) {
		this.projeSure = projeSure;
	}

	public int getProjeMaliyet() {
		return projeMaliyet;
	}

	public void setProjeMaliyet(int projeMaliyet) {
		this.projeMaliyet = projeMaliyet;
	}
	
	
	
	
}
