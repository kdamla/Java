package org.model;

public class Ders extends BasicModel {
	
	private int kredi;
	
	private int donem;
	
	public Ders(int id,String adi,int kredi,int donem) {
		// TODO Auto-generated constructor stub
	
		super(id, adi);
		this.donem=donem;
		this.kredi=kredi;
	
	}
	
	public Ders() {
		// TODO Auto-generated constructor stub
	}

	public int getKredi() {
		return kredi;
	}

	public void setKredi(int kredi) {
		this.kredi = kredi;
	}

	public int getDonem() {
		return donem;
	}

	public void setDonem(int donem) {
		this.donem = donem;
	}
	
	
	

}
