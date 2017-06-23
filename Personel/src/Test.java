import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Akademisyenin kaç adresi var?");
		int adresSayisi = scanner.nextInt();

		Akademisyen akademisyen = new Akademisyen(adresSayisi);
		// akademisyen.PersonelAdi = "Ayþe";
		// akademisyen.Birim = "Mühendislik";

		System.out.println("Akademisyen adý:");
		akademisyen.PersonelAdi = scanner.next();
		System.out.println("Akademisyen birimi:");
		akademisyen.Birim = scanner.next();

		for (int i = 0; i < adresSayisi; i++) {
			System.out.println("Akademisyen adres " + (i + 1) + ".");
			akademisyen.adresler[i] = new Adres();
			akademisyen.adresler[i].Sehir = scanner.next();
		}

		for (int i = 0; i < adresSayisi; i++) {
			System.out.println("Akademisyen adres " + (i + 1) + ". " + akademisyen.adresler[i].Sehir);
		}
		/*
		 * Idari idari = new Idari(adresSayisi); idari.PersonelAdi = "Ali";
		 * 
		 * idari.KayitYap(akademisyen); idari.KayitYap(idari);
		 * akademisyen.DersAc("Java");
		 */

		Asistan asistan = new Asistan(2);
		asistan.CalismaYap();
	}

}
