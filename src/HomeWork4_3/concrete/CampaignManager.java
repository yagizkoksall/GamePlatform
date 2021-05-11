package HomeWork4_3.concrete;

import HomeWork4_3.abstracts.CampaignService;
import HomeWork4_3.entities.Campaign;
import HomeWork4_3.entities.Game;

public class CampaignManager implements CampaignService {


    @Override
    public void add(Campaign campaign, Game game) {

        System.out.println(game.getGameName() + " adlı oyunda %" + campaign.getDiscountRate()  + " indirim");

    }

    public void delete(Campaign campaign){

        System.out.println(campaign.getInformationAboutDiscount());
    }
    void update(Campaign campaign){
        System.out.println(campaign.getInformationAboutDiscount() + " kampanyamız güncellenmiştir.");
    }



}
