package HomeWork4_3.abstracts;


import HomeWork4_3.entities.Campaign;
import HomeWork4_3.entities.Game;

public interface CampaignService {

    void add(Campaign campaign, Game game);
    void delete(Campaign campaign);


}
