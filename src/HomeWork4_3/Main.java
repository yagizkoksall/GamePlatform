package HomeWork4_3;

import HomeWork4_3.abstracts.CampaignService;
import HomeWork4_3.abstracts.PlayerService;
import HomeWork4_3.abstracts.SaleService;
import HomeWork4_3.concrete.CampaignManager;
import HomeWork4_3.concrete.PlayerManager;
import HomeWork4_3.concrete.SaleManager;
import HomeWork4_3.entities.Campaign;
import HomeWork4_3.entities.Game;
import HomeWork4_3.entities.Player;

public class Main {

    public static void main(String[] args) {


        Player player = new Player(1,"yagizkoksall@hotmail.com", "yagizkoksall", "190701", "Yağız", "Köksal", "91924556123", 21 - 8 - 2000);
        Campaign campaign = new Campaign("16 Haziran'a kadar %15 indirim",1,15);
        Game CounterStrike = new Game("Counter Strike Global Offensive","Çok oyunculu fps oyun",60);

        PlayerService playerservice = new PlayerManager();
        CampaignService campaignService = new CampaignManager();
        SaleService saleService = new SaleManager();


        playerservice.add(player);
        campaignService.add(campaign,CounterStrike);
        saleService.saleLogger(player,CounterStrike,campaign);


    }
}


