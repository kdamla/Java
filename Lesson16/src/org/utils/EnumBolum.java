package org.utils;

public enum EnumBolum {
	
	COMPUTER(1,"Bilgisayar Mühendisliði",1),
	CEVRE(2,"Çevre Mühendisliði",1),
	ISLETME(3,"Ýþletme",2),
	MIMARLIK(4,"Mimarlýk",1),
	HUKUK(5,"Hukuk",3);
	
	
	private int id;
	
	private String name;
	
	private int fakId;
	
	private EnumBolum(int id,String name,int fakId) {
		
		this.fakId=fakId;
		this.id=id;
		this.name=name;
		
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFakId() {
		return fakId;
	}

	public void setFakId(int fakId) {
		this.fakId = fakId;
	}
	
	

}
