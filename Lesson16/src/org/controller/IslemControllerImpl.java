package org.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.model.Ders;
import org.model.Ogrenci;
import org.utils.Utils;

public class IslemControllerImpl {

	public void kaydet(Ogrenci ogrenci, Ders ders) {

		if (Utils.ogrDersList.get(ogrenci.getOgrNo()) != null) {
			Utils.ogrDersList.get(ogrenci.getOgrNo()).add(ders); // ArrayList<Ders>
		} else {
			List listDers = new ArrayList<>();
			listDers.add(ders);

			Utils.ogrDersList.put(ogrenci.getOgrNo(), listDers);
		}
	}

	public void OgrDersSil(Ogrenci ogrenci, Ders ders) {

		if (Utils.ogrDersList.get(ogrenci.getOgrNo()) != null) {
			for (Iterator<Ders> iterator = Utils.ogrDersList.get(ogrenci.getOgrNo()).iterator(); iterator.hasNext();) {
				Ders ders1 = iterator.next();
				if (ders1.getId() == ders.getId()) {
					iterator.remove();
				}
			}
		}
	}
}
