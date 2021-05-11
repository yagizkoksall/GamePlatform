package HomeWork4_3.concrete;

import HomeWork4_3.abstracts.GameService;
import HomeWork4_3.entities.Game;
import HomeWork4_3.entities.Player;

public class GameManager implements GameService {


    @Override
    public void add(Game game) {

        System.out.println(game.getGameName() + "isimli oyun platformumuza eklenmiştir.");

    }

    @Override
    public void aboutButton(Game game) {

        System.out.println(game.getInformationAboutGame());
    }
}
