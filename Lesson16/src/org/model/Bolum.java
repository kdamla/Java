package org.model;

public class Bolum extends BasicModel{
	
	private int fakulteId;
	
	public Bolum(int id,String adi,int fakulteId) {
		
		super(id, adi);
		this.fakulteId=fakulteId;
		// TODO Auto-generated constructor stub
	}
	
	public Bolum() {
		// TODO Auto-generated constructor stub
	}

	public int getFakulteId() {
		return fakulteId;
	}

	public void setFakulteId(int fakulteId) {
		this.fakulteId = fakulteId;
	}
	
	
	

}
