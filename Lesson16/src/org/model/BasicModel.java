package org.model;

public class BasicModel {
	
	private int id;
	
	private String adi;
	
	public BasicModel() {
		// TODO Auto-generated constructor stub
	}
	
	public BasicModel(int id,String adi)
	{
		this.id=id;
		this.adi=adi;
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	

}
