import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ka� tane akademisyen gireceksiniz?");
		int akaSayi = scanner.nextInt();
		int asistanSayi = 0;
		int akademisyenAdresSayi = 0;
		int asistanAdresSayi = 0;
		Akademisyen[] akademisyenler = new Akademisyen[akaSayi];

		for (int i = 0; i < akaSayi; i++) {
			System.out.println("Akademisyenin ka� adresi var?");
			akademisyenAdresSayi = scanner.nextInt();

			akademisyenler[i] = new Akademisyen(akademisyenAdresSayi);

			System.out.println((i + 1) + ". Akademisyeni ad�:");
			akademisyenler[i].PersonelAdi = scanner.next();
			for (int j = 0; j < akademisyenAdresSayi; j++) {
				akademisyenler[i].adresler[j] = new Adres();
				System.out.println(
						akademisyenler[i].PersonelAdi + " adl� akademisyenin " + (j + 1) + ". ya�ad��� �ehir:");
				akademisyenler[i].adresler[j].Sehir = scanner.next();
				System.out.println(
						akademisyenler[i].PersonelAdi + " adl� akademisyenin " + (j + 1) + ". ya�ad��� b�lge:");
				akademisyenler[i].adresler[j].Bolge = scanner.next();
			}

			System.out.println("Akademisyenin ka� asistan� var?");
			asistanSayi = scanner.nextInt();
			akademisyenler[i].asistanlar = new Asistan[asistanSayi];

			for (int k = 0; k < asistanSayi; k++) {
				System.out.println("Asistan�n ka� adresi var?");
				asistanAdresSayi = scanner.nextInt();
				akademisyenler[i].asistanlar[k] = new Asistan(asistanAdresSayi);
				System.out.println(
						akademisyenler[i].PersonelAdi + " adl� akademisyenin " + (k + 1) + ". asistan�n�n ad�:");
				akademisyenler[i].asistanlar[k].PersonelAdi = scanner.next();

				for (int j = 0; j < asistanAdresSayi; j++) {
					akademisyenler[i].asistanlar[k].adresler[j] = new Adres();
					System.out.println(akademisyenler[i].asistanlar[k].PersonelAdi + " asistan�n�n " + (j + 1)
							+ ". ya�ad��� �ehir");
					akademisyenler[i].asistanlar[k].adresler[j].Sehir = scanner.next();
				}
			}
		}

		for (int i = 0; i < akaSayi; i++) {
			System.out.println(akademisyenler[i].PersonelAdi);

			for (int j = 0; j < akademisyenler[i].adresler.length; j++) {
				System.out.println(akademisyenler[i].PersonelAdi + " akademisyenine ait " + (j + 1) + ". adres:"
						+ akademisyenler[i].adresler[j].Sehir);
			}

			for (int j = 0; j < akademisyenler[i].asistanlar.length; j++) {
				System.out.println(akademisyenler[i].PersonelAdi + " akademisyeninin " + (j + 1) + ". asistan ad�: "
						+ akademisyenler[i].asistanlar[j].PersonelAdi);
				for (int j2 = 0; j2 < akademisyenler[i].asistanlar[j].adresler.length; j2++) {
					System.out.println(akademisyenler[i].asistanlar[j].PersonelAdi + " asistan�na ait " + (j2 + 1)
							+ ". adres:" + akademisyenler[i].asistanlar[j].adresler[j2].Sehir);
				}
			}
		}
	}
}
