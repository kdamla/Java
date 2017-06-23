
public class Akademisyen extends Personel {
	public String Unvan;
	public String Birim;
	public Asistan asistanlar[];

	public Akademisyen(int args) {
		super(args);
		this.asistanlar = new Asistan[args];
		System.out.println("Akademisyen sýnýfý oluþturuldu.");
	}

	public void DersAc(String ders) {
		System.out.println(ders + " dersi açýldý.");
	}
}
