
public class Idari extends Personel {
	public Idari(int args) {
		super(args);
		System.out.println("�dari s�n�f� olu�turuldu.");
	}

	public void KayitYap(Personel personel) {
		System.out.println(personel.PersonelAdi + " personelinin kayd� yap�ld�.");
	}
}
