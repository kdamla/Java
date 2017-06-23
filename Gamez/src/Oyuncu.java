
public class Oyuncu {
	public String oyuncuAdi;
	private int x;
	private int y;
	public int toplamPuan;

	public Oyuncu(String ad, int x, int y) {
		this.oyuncuAdi = ad;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getToplamPuan() {
		return this.toplamPuan;
	}

	public void setToplamPuan(int topPuan) {
		this.toplamPuan = topPuan;
	}

	public void puanEkle(int puan) {
		this.setToplamPuan(getToplamPuan() + puan);
	}

	public void hareketEt(char yon, int tahtaX, int tahtaY) {
		int oyuncuX = this.getX();
		int oyuncuY = this.getY();

		if (yon == 'K') {
			if (oyuncuX != 0) {
				this.setX(oyuncuX - 1);
			} else {
				System.out.println("Kuzeye gidemezsiniz. Yerinizde kaldýnýz.");
			}
		} else if (yon == 'G') {
			if (oyuncuX != tahtaX - 1) {
				this.setX(oyuncuX + 1);
			} else {
				System.out.println("Güneye gidemezsiniz. Yerinizde kaldýnýz.");
			}
		} else if (yon == 'B') {
			if (oyuncuY != 0) {
				this.setY(oyuncuY - 1);
			} else {
				System.out.println("Batýya gidemezsiniz. Yerinizde kaldýnýz.");
			}
		} else if (yon == 'D') {
			if (oyuncuY != tahtaY - 1) {
				this.setY(oyuncuY + 1);
			} else {
				System.out.println("Doðuya gidemezsiniz. Yerinizde kaldýnýz.");
			}
		}
		else{
			System.out.println("Yanlýþ yön girdiniz. Yerinizde kaldýnýz.");
		}
	}
}
