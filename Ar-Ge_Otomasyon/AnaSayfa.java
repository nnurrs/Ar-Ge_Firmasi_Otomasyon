package nyp_odev;

import java.util.Scanner;
import java.util.Arrays;

public class AnaSayfa {

	public static int personelSayisi;
	public static int projeSayisi;
	public static Personel[] personeller;
	public static Proje[] projeler;
	public static Departman[] departman;
	public static String enKucukAd;
	public static String enBuyukAd;

	public static void main(String[] args) {
		Scanner veriAl = new Scanner(System.in);
		int departmanSayisi;

		Departman dep = new Departman();
		Personel per = new Personel();
		Proje pro = new Proje();

		System.out.print("Departman sayısı giriniz: ");
		departmanSayisi = veriAl.nextInt();

		departman = new Departman[departmanSayisi];
		int i;

		for (i = 0; i < departmanSayisi; i++) {
			System.out.print(i + 1 + ". Departman no giriniz: ");
			dep.setDepNo(veriAl.nextInt());

			System.out.print(i + 1 + ". Departmanın adını giriniz: ");
			dep.setDepAd(veriAl.next());

			departman[i] = new Departman(dep.getDepAd(), dep.getDepNo());

			System.out.print(dep.getDepAd() + " departmanındaki personel sayısını giriniz: ");

			personelSayisi = veriAl.nextInt();
			departman[i].personeller = new Personel[personelSayisi];

			for (int j = 0; j < personelSayisi; j++) {

				System.out.print(j + 1 + ". Personelin adını giriniz: ");
				per.setPerAd(veriAl.next());

				System.out.print(j + 1 + ". Personelin soyadını giriniz: ");
				per.setPerSoyad(veriAl.next());

				System.out.print(j + 1 + ". Personelin yaşını giriniz: ");
				per.setPerYas(veriAl.nextInt());

				departman[i].personeller[j] = new Personel(per.getPerAd(), per.getPerSoyad(), per.getPerYas());

			}

			System.out.print(dep.getDepAd() + " departmanında yürütülen kaç proje var?");
			projeSayisi = veriAl.nextInt();

			departman[i].projeler = new Proje[projeSayisi];

			for (int x = 0; x < projeSayisi; x++) {
				System.out.print(x + 1 + ". Projenin adını giriniz: ");
				pro.setProjeAd(veriAl.next());

				System.out.print(x + 1 + ". Projenin süresini ay cinsinden giriniz: ");
				pro.setProjeSure(veriAl.nextInt());

				System.out.print(x + 1 + ". Projenin maliyetini TL cinsinden giriniz: ");
				pro.setProjeMaliyet(veriAl.nextInt());

				departman[i].projeler[x] = new Proje(pro.getProjeAd(), pro.getProjeSure(), pro.getProjeMaliyet());
			}
		}

		while (1 == 1) {
			System.out.println("\n-------------------------------------------------");
			System.out.println("(1) - Tüm Departmanların Bilgilerini Listele");
			System.out.println("(2) - Departman Adına Göre Arama Yap");
			System.out.println("(3) - Personel Adına Göre Arama Yap");
			System.out.println("(4) - Proje Adına Göre Arama Yap");
			System.out.println("(5) - Yaş Bilgisine Göre Personelleri Bul");
			System.out.println("(6) - Yaş Bilgisine Göre Personelleri Analiz Et");
			System.out.println("(7) - Proje Süresine Göre Projeleri Bul");
			System.out.println("(8) - Proje Maliyetine Göre Projeleri Bul");
			System.out.println("(9) - Proje Maliyetine Göre Projeleri Analiz Et");
			System.out.println("(10) - Çıkış");
			System.out.println("-------------------------------------------------\n");

			System.out.print("Seçiminiz: ");
			int secim = veriAl.nextInt();

			switch (secim) {
			case 1:
				for (int t = 0; t < departmanSayisi; t++) {
					departman[t].departmanYazdir();

					System.out.println("Personeller: ");
					for (int k = 0; k < departman[t].personeller.length; k++) {
						System.out.print(k + 1 + ". Personel: ");
						departman[t].personeller[k].personelYazdir();
					}

					System.out.println("------------------");
					System.out.println("Projeler: ");
					for (int y = 0; y < departman[t].projeler.length; y++) {
						System.out.print(y + 1 + ". Proje: ");
						departman[t].projeler[y].projeYazdir();
					}
				}

				break;
			case 2:
				boolean p = true;
				System.out.print("Aramak istediğiniz departman ismini giriniz: ");
				String aranacakDepartman = new String(veriAl.next());
				for (int h = 0; h < departmanSayisi; h++) {
					if (aranacakDepartman.equals(departman[h].getDepAd())){

						departman[h].departmanYazdir();
						System.out.println("Personeller: ");
						for (int k = 0; k < departman[h].personeller.length; k++) {
							System.out.print(k + 1 + ". Personel: ");
							departman[h].personeller[k].personelYazdir();
						}

						System.out.println("------------------");

						System.out.println("Projeler: ");
						for (int y = 0; y < departman[h].projeler.length; y++) {
							System.out.print(y + 1 + ". Proje: ");
							departman[h].projeler[y].projeYazdir();
						}
						System.out.println("-------------------------------------------");
						p = false;
					}
				}
				if (p) {
					System.out.println("Aranan departman bulunamadı!");
				}
				break;
			case 3:
				boolean x1 = true;
				System.out.print("Aramak istediğiniz personel ismini giriniz: ");
				String aranacakIsim = new String(veriAl.next());

				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].personeller.length; a++) {
						if (aranacakIsim.equals(departman[h].personeller[a].getPerAd())) {
							departman[h].departmanYazdir();
							departman[h].personeller[a].personelYazdir();
							x1 = false;
						}
					}
				}
				if (x1) {
					System.out.println("Aranan personel bulunamadı!");
				}
				break;
			
			case 4:
				boolean x2 = true;
				System.out.print("Aramak istediğiniz Proje ismini giriniz: ");
				String aranacakProje = veriAl.next();

				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].projeler.length; a++) {
						if (aranacakProje.equals(departman[h].projeler[a].getProjeAd())) {
							departman[h].departmanYazdir();
							departman[h].projeler[a].projeYazdir();
							x2 = false;
						}
					}
				}

				if (x2) {
					System.out.println("Aranan proje bulunamadı!");
				}
				break;
			
			case 5:
				
				boolean x3 = true;
				
				System.out.print("Hangi yaştaki personelleri arıyorsunuz?: ");
				int aranacakYas = veriAl.nextInt();

				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].personeller.length; a++) {
						int kontrol = departman[h].personeller[a].getPerYas();
						if (aranacakYas==kontrol) {
							departman[h].departmanYazdir();
							departman[h].personeller[a].personelYazdir();
							x3 = false;
						}
					}
				}

				if (x3) {
					System.out.println("Aranan yaşta personel bulunamadı!");
				}
				break;
			case 6:
				
				boolean x4 = true;
				int yasAraligi;
				int syc2030=0;
				int syc3140=0;
				int syc4150=0;
				int syc51=0;
				int toplamYas=0;
				int sycToplam=0;
				double yasOrtalama;
				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].personeller.length; a++) {
						yasAraligi=(departman[h].personeller[a].getPerYas());
						sycToplam++;
						toplamYas=toplamYas+yasAraligi;
						if (20<=yasAraligi && yasAraligi<=30){
							syc2030++;
							x4 = false;
						}
						else if(31<=yasAraligi && yasAraligi<=40){
							syc3140++;
							x4 = false;
						}
						else if(41<=yasAraligi && yasAraligi<=50){
							syc4150++;
							x4 = false;
						}
						else if(51 <= yasAraligi){
							syc51++;
							x4 = false;
						}
					}
				}
				System.out.println("20-30 Yaş Aralığındaki Personel Sayısı: "+syc2030);
				System.out.println("31-40 Yaş Aralığındaki Personel Sayısı: "+syc3140);
				System.out.println("41-50 Yaş Aralığındaki Personel Sayısı: "+syc4150);
				System.out.println(">51 Yaş Aralığındaki Personel Sayısı: "+syc51);
				if(x4) {
					System.out.println("Kimse çalışmıyor!");
				}
				else {
					yasOrtalama=toplamYas/sycToplam;
					System.out.print("Tüm Personellerin Yaş Ortalaması= "+yasOrtalama);
				}
					break;
			
			case 7:

				boolean x5 = true;
				System.out.print("Aramak istediğiniz Proje süresini giriniz: ");
				int aranacakProjeSuresi = veriAl.nextInt();

				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].projeler.length; a++) {
						int kontrol2 = departman[h].projeler[a].getProjeSure();
						if (aranacakProjeSuresi==kontrol2) {
							departman[h].departmanYazdir();
							departman[h].projeler[a].projeYazdir();
							x5 = false;
						}
					}
				}

				if (x5) {
					System.out.println("Aranan surede proje bulunamadı!");
				}
				break;

			case 8:
				boolean x6 = true;
				System.out.print("Aramak istediğiniz Proje maliyet giriniz: ");
				long aranacakProjeMaliyet = veriAl.nextLong();

				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].projeler.length; a++) {
						long kontrol3 = departman[h].projeler[a].getProjeMaliyet();
						if (aranacakProjeMaliyet==kontrol3) {
							departman[h].departmanYazdir();
							departman[h].projeler[a].projeYazdir();
							x6 = false;
						}
					}
				}

				if (x6) {
					System.out.println("Aranan maliyette proje bulunamadı!");
				}
				break;

			case 9:

				boolean x7=true;
				int boyut=0;
				int syc7=0;
				int sycToplamMaliyet=0;
				double maliyetOrtalama;
				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].projeler.length; a++) {
						boyut++;
					}
				}
				
				long maliyetSort[] = new long[boyut];
				
				for (int h = 0; h < departmanSayisi; h++) {
					for (int a = 0; a < departman[h].projeler.length; a++) {
						maliyetSort[syc7] = departman[h].projeler[a].getProjeMaliyet();
						sycToplamMaliyet=sycToplamMaliyet+departman[h].projeler[a].getProjeMaliyet();
						syc7++;
					}
				}
				
				if(boyut!=0) {
					x7=false;
				}
				
				if(x7) {
					System.out.println("En Düşük Maliyetli Proje: 0");
					System.out.println("En Yüksek Maliyetli Proje: 0");
					System.out.println("______________________________________________");
					System.out.println("Hiç Proje Olmadığından Ortalama Hesaplanamaz!");
				}
				else {
					Arrays.sort(maliyetSort);
					
					long aranacakProjeEnKucukMaliyeti = maliyetSort[0];
					for (int h = 0; h < departmanSayisi; h++) {
						for (int a = 0; a < departman[h].projeler.length; a++) {
							long kontrol3 = departman[h].projeler[a].getProjeMaliyet();
							if (aranacakProjeEnKucukMaliyeti==kontrol3) {
								enKucukAd=departman[h].projeler[a].getProjeAd();
							}
						}
					}
					long aranacakProjeEnBuyukMaliyeti = maliyetSort[boyut-1];
					for (int h = 0; h < departmanSayisi; h++) {
						for (int a = 0; a < departman[h].projeler.length; a++) {
							long kontrol3 = departman[h].projeler[a].getProjeMaliyet();
							if (aranacakProjeEnBuyukMaliyeti==kontrol3) {
								enBuyukAd=departman[h].projeler[a].getProjeAd();
							}
						}
					}
					maliyetOrtalama=sycToplamMaliyet/boyut;
					System.out.println("En Düşük Maliyetli Proje: "+ enKucukAd +" "+ maliyetSort[0]);
					System.out.println("En Yüksek Maliyetli Proje: "+ enBuyukAd +" "+ maliyetSort[boyut-1]);
					System.out.println("________________________________________________");
					System.out.println("Tüm Projelerin Maliyet ortalaması: "+maliyetOrtalama);
				}
				break;
				
			case 10:
				System.out.println("Menüden Çıkış Yapıldı");
				return;
			default:
				System.out.println("Yanlış tuşlama yaptınız!");

			}

		}
	}
}
