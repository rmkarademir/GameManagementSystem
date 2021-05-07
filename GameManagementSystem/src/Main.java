import java.time.LocalDate;

import Concrete.CampingManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Camping;
import Entities.Sale;


public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager();
		GameManager gameManager = new GameManager();
		CampingManager campingManager = new CampingManager();
		SaleManager saleManager = new SaleManager();
		Game game1 = new Game(1, "PES 21", "Konomi", 200);	
		Game game2 = new Game(2, "FÝFA 21","EA",250);
		Gamer gamer1 = new Gamer(1, "Rüstem", "Karademir", "12345678912", LocalDate.of(1991, 10, 03));
		Gamer gamer2 = new Gamer(2, "Muhammed", "Karademir", "123456789", LocalDate.of(1991, 10, 03));
		Camping camping1 = new Camping(1, "Muhteþem Cuma Kampanyasý" , 25);
		Camping camping2 = new Camping(2, "Yeni Yýl Kampanyasý", 30);
		
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.delete(game2);
		campingManager.add(camping2);
		saleManager.sell(game1, gamer1, camping2);
		
		
	
	}
	
	

}
