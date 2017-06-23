import java.util.Scanner;

public class Tahta {
	public int[][] oyunMatrisi;
	public Oyuncu[] oyuncular;

	public Tahta(int satirSayi, int sutunSayi) {
		oyunMatrisi = new int[satirSayi][sutunSayi];
		for (int i = 0; i < oyunMatrisi.length; i++) {
			for (int j = 0; j < oyunMatrisi[i].length; j++) {
				oyunMatrisi[i][j] = (int) ((Math.random()) * 9);
			}
		}
		this.setOyunMatrisi(oyunMatrisi);
	}

	public int[][] getOyunMatrisi() {
		return oyunMatrisi;
	}

	public void setOyunMatrisi(int[][] oyunMatrisi) {
		this.oyunMatrisi = oyunMatrisi;
	}

	public Oyuncu[] getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(Oyuncu[] oyuncular) {
		this.oyuncular = oyuncular;
		for (int i = 0; i < oyuncular.length; i++) {
			this.oyuncular[i].setX(0);// oyuncular 0 dan baþlamayacaksa
										// bulunduklarý indexler buradan
										// sýfýrlanacak
			this.oyuncular[i].setY(0);
		}

		this.oyunMatrisi[0][0] = 0;
	}

	public boolean oyunBittiMi() {
		for (int i = 0; i < oyunMatrisi.length; i++) {
			for (int j = 0; j < oyunMatrisi[i].length; j++) {
				if (oyunMatrisi[i][j] > 0) {
					return false;
				}
			}
		}

		return true;
	}

	public void tahtayiYazdir() {
		for (int i = 0; i < oyunMatrisi.length; i++) {
			for (int j = 0; j < oyunMatrisi[i].length; j++) {
				if (oyuncular[0].getX() == i && oyuncular[0].getY() == j) {
					System.out.print(oyuncular[0].oyuncuAdi + " ");
				} else if (oyuncular[1].getX() == i && oyuncular[1].getY() == j) {
					System.out.print(oyuncular[1].oyuncuAdi + " ");
				} else {
					System.out.print(oyunMatrisi[i][j] + " ");
				}
			}

			System.out.println("");
		}

		for (int i = 0; i < oyuncular.length; i++) {
			System.out.println(this.oyuncular[i].oyuncuAdi + "=" + this.oyuncular[i].getToplamPuan());
		}
	}

	public void oyunuOynat() {
		Scanner scanner = new Scanner(System.in);
		char yon;
		Tahta tahta = new Tahta(4, 4);
		Oyuncu[] oyuncular = new Oyuncu[2];
		oyuncular[0] = new Oyuncu("A", 0, 0);
		oyuncular[1] = new Oyuncu("B", 0, 0);
		this.setOyuncular(oyuncular);

		System.out.println("Oyun baþlýyor!");
		this.tahtayiYazdir();
		int oyuncu = 1;
		int puan = 0;
		while (!this.oyunBittiMi()) {
			oyuncu = this.oyuncuDegis(oyuncu);
			System.out.println("Sayýn " + oyuncular[oyuncu].oyuncuAdi + " yön seçiniz. (B,D,K,G)");
			yon = scanner.next().charAt(0);
			oyuncular[oyuncu].hareketEt(yon, tahta.oyunMatrisi.length, tahta.oyunMatrisi.length);
			puan = this.oyunMatrisi[oyuncular[oyuncu].getX()][oyuncular[oyuncu].getY()];

			System.out.println("Eklenecek puan :" + puan + "\n");
			oyuncular[oyuncu].puanEkle(puan);
			System.out.println(
					oyuncular[oyuncu].oyuncuAdi + "- X:" + oyuncular[oyuncu].getX() + " Y:" + oyuncular[oyuncu].getY());
			this.oyunMatrisi[oyuncular[oyuncu].getX()][oyuncular[oyuncu].getY()] = 0;
			this.tahtayiYazdir();
		}

		System.out.println("Oyun bitti!");
		if (oyuncular[0].toplamPuan > oyuncular[1].toplamPuan) {
			System.out.println(
					"Sayýn " + oyuncular[0].oyuncuAdi + "," + oyuncular[0].toplamPuan + " puan ile kazandýnýz!!!");
		} else if (oyuncular[1].toplamPuan > oyuncular[0].toplamPuan) {
			System.out.println(
					"Sayýn " + oyuncular[1].oyuncuAdi + "," + oyuncular[1].toplamPuan + " puan ile kazandýnýz!!!");
		} else {
			System.out.println("Sayýn " + oyuncular[0].oyuncuAdi + " ve " + oyuncular[1].oyuncuAdi
					+ oyuncular[1].toplamPuan + " puan ile kazandýnýz!!!");
		}

		this.tahtayiYazdir();
	}

	public int oyuncuDegis(int oyuncu) {
		if (oyuncu == 0) {
			return 1;
		} else
			return 0;
	}
}
