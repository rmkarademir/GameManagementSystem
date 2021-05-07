package Abstract;

import Entities.Camping;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void sell(Game game, Gamer gamer, Camping camping);
}
