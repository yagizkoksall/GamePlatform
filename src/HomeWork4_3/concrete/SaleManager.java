package HomeWork4_3.concrete;

import HomeWork4_3.abstracts.SaleService;
import HomeWork4_3.entities.Campaign;
import HomeWork4_3.entities.Game;
import HomeWork4_3.entities.Player;

public class SaleManager implements SaleService {


    @Override
    public void saleLogger(Player player, Game game, Campaign campaign) {
        System.out.println(game.getGameName() +" isimli oyunumuz %" + campaign.getDiscountRate() + " indirim ile " + player.getUserName() + " adlı kullanıcıya satılmıştır." );
    }
}
