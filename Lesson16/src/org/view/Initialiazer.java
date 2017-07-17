package org.view;

import org.model.Bolum;
import org.model.Ders;
import org.utils.EnumBolum;
import org.utils.EnumDers;
import org.utils.Utils;

public class Initialiazer {
	
	public Initialiazer() {
		// TODO Auto-generated constructor stub
	
		Utils utils=new Utils();
		
		bolumDoldur();
		dersDoldur();
	
	}
	
	
	public void bolumDoldur()
	{
		
		for (int i = 0; i < EnumBolum.values().length; i++) {
			
			EnumBolum enumBolum=EnumBolum.values()[i];
			
			Bolum bolum=new Bolum(enumBolum.getId(),enumBolum.getName(),enumBolum.getFakId());
			
			Utils.bolumList.add(bolum);
			
			
		}
		
	}
	
	public void dersDoldur()
	{
		
		
		for (int i = 0; i < EnumDers.values().length; i++) {
			
			EnumDers ders=EnumDers.values()[i];
			
			Ders ders2=new Ders(ders.getId(), ders.getAdi(), ders.getKredisi(), ders.getDonem());
			
			Utils.dersList.add(ders2);
			
		}
		
		
		
	}

}
