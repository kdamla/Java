package org.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.model.*;

public class Utils {
	
	public static List<Bolum> bolumList;
	
	public static List<Ders> dersList;
	
	public static List<Ogrenci> ogrenciList;
	
	public static Map<Integer, List<Ders>> ogrDersList;
	
	public Utils() {
	
		bolumList=new ArrayList<Bolum>();
		
		dersList=new ArrayList<>();
		
		ogrenciList=new ArrayList<>();
		
		ogrDersList=new HashMap<>();
		
		// TODO Auto-generated constructor stub
	}
	
	
}
