package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	public void add(Gamer gamer) {
		if (!(gamer.getFirtsName() == null) && !(gamer.getLastName() == null) && gamer.getNationalyNumber().length() == 11) {
			System.out.println(gamer.getFirtsName() + " " + gamer.getLastName() + " oyuncu sisteme eklendi.");
		}else {
			System.out.println("Oyuncu bilgileri eksik, sisteme eklenemedi!");
		}
	}
	
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirtsName() + " " + gamer.getLastName() + " oyuncu sistemden silindi.");
	}
	
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirtsName() + " " + gamer.getLastName() + " oyuncu güncellendi.");
	}
}
