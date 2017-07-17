package org.model;

public class Ogrenci extends BasicModel{
	
	
	

	private String soyadi;
	
	private int tcNo;
	
	private int ogrNo;
	
	private int sinif;
	
	private Bolum bolum;
	

	public Ogrenci(int id, String adi, String soyadi, int tcNo, int ogrNo, int sinif, Bolum bolum) {
		super(id, adi);
		this.soyadi = soyadi;
		this.tcNo = tcNo;
		this.ogrNo = ogrNo;
		this.sinif = sinif;
		this.bolum = bolum;
	}
	
	
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public int getOgrNo() {
		return ogrNo;
	}

	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	public Bolum getBolum() {
		return bolum;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}
	
	

}
