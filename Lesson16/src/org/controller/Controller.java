package org.controller;

import java.util.List;

import org.model.BasicModel;

public interface Controller<E extends BasicModel> 
{

	void kaydet(E e);
	
	void sil(E e);
	
	List<E> getList(E e);
	
	E getEFromId(E e);	
}
