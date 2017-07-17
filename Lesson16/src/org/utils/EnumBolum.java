package org.utils;

public enum EnumBolum {
	
	COMPUTER(1,"Bilgisayar M�hendisli�i",1),
	CEVRE(2,"�evre M�hendisli�i",1),
	ISLETME(3,"��letme",2),
	MIMARLIK(4,"Mimarl�k",1),
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
