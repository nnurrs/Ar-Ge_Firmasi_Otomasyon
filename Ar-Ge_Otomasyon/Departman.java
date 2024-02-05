package nyp_odev;

public class Departman {

	private int syc3;
	private int depNo; 
	
	private String depAd;
	public Personel personeller[];
	public Proje projeler[];
	
	public Departman(String depAd,Personel[] personeller, Proje[] projeler) {
		this.depAd = depAd;
		this.personeller = personeller;
		this.projeler = projeler;
		
	}
	public Departman(int depNo) {
		this.depNo = syc3++;
	}
	public Departman(String depAd, int depNo) {
		this.depAd=depAd;
		this.depNo=depNo;
	}
	
	public void departmanYazdir()
	{
		System.out.println("Departman adı: "+depAd +" Departman no: "+depNo);
	}
	public Departman() {
		// TODO Auto-generated constructor stub
	}
	public int getDepNo() {
		return depNo;
	}
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	public String getDepAd() {
		return depAd;
	}
	public void setDepAd(String depAd) {
		this.depAd = depAd;
	}
	public Personel[] getPersoneller() {
		return personeller;
	}
	public void setPersoneller(Personel[] personeller) {
		this.personeller = personeller;
	}
	public Proje[] getProjeler() {
		return projeler;
	}
	public void setProjeler(Proje[] projeler) {
		this.projeler = projeler;
	}
	
	public String departmanAd()
	{
		return depAd;
		
	}
	
	
	
	
	
}


