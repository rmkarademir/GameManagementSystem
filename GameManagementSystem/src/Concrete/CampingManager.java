package Concrete;

import Abstract.CampingService;
import Entities.Camping;

public class CampingManager implements CampingService {
	public void add(Camping camping) {
		System.out.println(camping.getName() + " kampanyas� sisteme eklendi.");
	}
	
	public void delete(Camping camping) {
		System.out.println(camping.getName() + " kampanyas� sistemden silindi.");
	}
	
	public void update(Camping camping) {
		System.out.println(camping.getName() + " kampanyas� g�ncellendi.");
	}
}
