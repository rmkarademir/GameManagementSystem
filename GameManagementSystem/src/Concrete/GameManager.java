package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
	public void add(Game game) {
		System.out.println(game.getName() + " oyunu sisteme eklendi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getName() + " oyunu sistemden silindi.");
	}
	
	public void update(Game game) {
		System.out.println(game.getName() + " oyunu güncellendi.");
	}
}
