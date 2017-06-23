
public class Idari extends Personel {
	public Idari(int args) {
		super(args);
		System.out.println("Ýdari sýnýfý oluþturuldu.");
	}

	public void KayitYap(Personel personel) {
		System.out.println(personel.PersonelAdi + " personelinin kaydý yapýldý.");
	}
}
