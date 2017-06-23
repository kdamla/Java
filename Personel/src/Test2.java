import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç tane akademisyen gireceksiniz?");
		int akaSayi = scanner.nextInt();
		int asistanSayi = 0;
		int akademisyenAdresSayi = 0;
		int asistanAdresSayi = 0;
		Akademisyen[] akademisyenler = new Akademisyen[akaSayi];

		for (int i = 0; i < akaSayi; i++) {
			System.out.println("Akademisyenin kaç adresi var?");
			akademisyenAdresSayi = scanner.nextInt();

			akademisyenler[i] = new Akademisyen(akademisyenAdresSayi);

			System.out.println((i + 1) + ". Akademisyeni adý:");
			akademisyenler[i].PersonelAdi = scanner.next();
			for (int j = 0; j < akademisyenAdresSayi; j++) {
				akademisyenler[i].adresler[j] = new Adres();
				System.out.println(
						akademisyenler[i].PersonelAdi + " adlý akademisyenin " + (j + 1) + ". yaþadýðý þehir:");
				akademisyenler[i].adresler[j].Sehir = scanner.next();
				System.out.println(
						akademisyenler[i].PersonelAdi + " adlý akademisyenin " + (j + 1) + ". yaþadýðý bölge:");
				akademisyenler[i].adresler[j].Bolge = scanner.next();
			}

			System.out.println("Akademisyenin kaç asistaný var?");
			asistanSayi = scanner.nextInt();
			akademisyenler[i].asistanlar = new Asistan[asistanSayi];

			for (int k = 0; k < asistanSayi; k++) {
				System.out.println("Asistanýn kaç adresi var?");
				asistanAdresSayi = scanner.nextInt();
				akademisyenler[i].asistanlar[k] = new Asistan(asistanAdresSayi);
				System.out.println(
						akademisyenler[i].PersonelAdi + " adlý akademisyenin " + (k + 1) + ". asistanýnýn adý:");
				akademisyenler[i].asistanlar[k].PersonelAdi = scanner.next();

				for (int j = 0; j < asistanAdresSayi; j++) {
					akademisyenler[i].asistanlar[k].adresler[j] = new Adres();
					System.out.println(akademisyenler[i].asistanlar[k].PersonelAdi + " asistanýnýn " + (j + 1)
							+ ". yaþadýðý þehir");
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
				System.out.println(akademisyenler[i].PersonelAdi + " akademisyeninin " + (j + 1) + ". asistan adý: "
						+ akademisyenler[i].asistanlar[j].PersonelAdi);
				for (int j2 = 0; j2 < akademisyenler[i].asistanlar[j].adresler.length; j2++) {
					System.out.println(akademisyenler[i].asistanlar[j].PersonelAdi + " asistanýna ait " + (j2 + 1)
							+ ". adres:" + akademisyenler[i].asistanlar[j].adresler[j2].Sehir);
				}
			}
		}
	}
}
