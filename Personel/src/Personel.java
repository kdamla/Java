
public class Personel {
	public String PersonelAdi;
	public int DogumYili;
	public Adres[] adresler;

	public Personel(int adresSayisi) {
		this.adresler = new Adres[adresSayisi];
		
		System.out.println("Personel s�n�f� olu�turuldu.");
	}

	public int maasHesapla() {
		return (int) (Math.random() * 100);
	}
}
