package org.controller;

import java.util.ArrayList;
import java.util.List;

import org.model.BasicModel;
import org.model.Bolum;
import org.model.Ders;
import org.model.Ogrenci;
import org.utils.Utils;

public class ControllerImpl implements Controller<BasicModel> {

	@Override
	public void kaydet(BasicModel e) {

		if (e instanceof Ogrenci) {
			Utils.ogrenciList.add((Ogrenci) e);
		}
	}

	@Override
	public void sil(BasicModel e) {
		if (e instanceof Ogrenci) {
			Utils.ogrenciList.remove(e);
		} else if (e instanceof Bolum) {
			Utils.bolumList.remove(e);
		} else if (e instanceof Ders) {
			Utils.dersList.remove(e);
		}
	}

	@Override
	public List<BasicModel> getList(BasicModel e) {
		List<BasicModel> list = new ArrayList<>();

		if (e instanceof Ogrenci) {
			list.addAll(Utils.ogrenciList);
		}else if (e instanceof Bolum) {
			list.addAll(Utils.bolumList);
		} else if (e instanceof Ders) {
			list.addAll(Utils.dersList);
		}

		return list;
	}

	@Override
	public BasicModel getEFromId(BasicModel e) {
		if (e instanceof Ogrenci) {
			for (Ogrenci ogr : Utils.ogrenciList) {
				if (ogr.getId() == e.getId()) {
					return ogr;
				}
			}
		} else if (e instanceof Bolum) {
			for (Bolum bolum : Utils.bolumList) {
				if (bolum.getId() == e.getId()) {
					return bolum;
				}
			}
		} else if (e instanceof Ders) {
			for (Ders ders : Utils.dersList) {
				if (ders.getId() == e.getId()) {
					return ders;
				}
			}
		}

		return null;
	}
}
