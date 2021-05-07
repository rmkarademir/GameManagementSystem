package Concrete;

import Abstract.SaleService;
import Entities.Camping;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{
	public void sell(Game game, Gamer gamer, Camping camping) {
		double totalPrice = game.getPrice() - (game.getPrice() * camping.getDiscount() / 100);
		System.out.println(gamer.getFirtsName() + " isimli oyuncuya " + game.getName() + " oyunu " + totalPrice + " TL ye satýldý.");
	}
}
