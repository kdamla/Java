package org.view;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.controller.Controller;
import org.controller.ControllerImpl;
import org.controller.IslemControllerImpl;
import org.model.BasicModel;
import org.model.Bolum;
import org.model.Ders;
import org.model.Ogrenci;
import org.utils.Utils;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//
		Initialiazer initialiazer = new Initialiazer();

		Scanner scanner = new Scanner(System.in);

		for (Bolum bolum : Utils.bolumList) {

			System.out.println("Bolum Id :" + bolum.getId() + " Bolum Adý :" + bolum.getAdi());
		}

		System.out.println("Ogrenci Bolum Id Seciniz :");

		int bolumId = scanner.nextInt();

		Ogrenci ogrenci = new Ogrenci();

		System.out.println("ID :");

		ogrenci.setId(scanner.nextInt());

		System.out.println("ADI :");

		ogrenci.setAdi(scanner.next());

		System.out.println("SOYADI :");

		ogrenci.setSoyadi(scanner.next());

		System.out.println("OGR NO :");

		ogrenci.setOgrNo(scanner.nextInt());

		ogrenci.setBolum(Utils.bolumList.get(bolumId));

		Controller controller = new ControllerImpl();

		controller.kaydet(ogrenci);

		IslemControllerImpl islemController = new IslemControllerImpl();

		for (Ders ders : Utils.dersList) {

			System.out.println("Ders Id :" + ders.getId() + " Ders Adý :" + ders.getAdi());

		}

		for (int i = 0; i < 3; i++) {

			System.out.println("Ders Id Seciniz :");

			int dersId = scanner.nextInt();

			islemController.kaydet(ogrenci, Utils.dersList.get(dersId));

		}

		for (Map.Entry<Integer, List<Ders>> entry : Utils.ogrDersList.entrySet()) {

			System.out.println("Öðrenci No : " + entry.getKey());

			for (int i = 0; i < entry.getValue().size(); i++) {

				Ders ders = entry.getValue().get(i);

				System.out.println(ders.getId() + " " + ders.getAdi() + " " + ders.getKredi());

			}
		}

		/*
		 * System.out.println("Aranacak ders idsini giriniz"); Ders ders = new
		 * Ders(); ders.setId(scanner.nextInt());
		 * 
		 * ders = (Ders) controller.getEFromId(ders);
		 * 
		 * System.out.println(ders.getAdi());
		 */

		/*
		 * List<BasicModel> list = controller.getList(ogrenci);
		 * 
		 * for (int i = 0; i < list.size(); i++) { ogrenci = (Ogrenci)
		 * list.get(i); System.out.println(ogrenci.getAdi() + "-" +
		 * ogrenci.getSoyadi()); }
		 */

		////////////

		System.out.println("Silinecek Ders Id Seciniz :");
		Ders ders = new Ders();
		int dersId = scanner.nextInt();

		ders.setId(dersId);

		islemController.OgrDersSil(ogrenci, ders);

		for (Map.Entry<Integer, List<Ders>> entry : Utils.ogrDersList.entrySet()) {

			System.out.println("Öðrenci No : " + entry.getKey());

			for (int i = 0; i < entry.getValue().size(); i++) {

				ders = entry.getValue().get(i);

				System.out.println(ders.getId() + " " + ders.getAdi() + " " + ders.getKredi());
			}
		}

	}
}
