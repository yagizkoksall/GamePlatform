package HomeWork4_3.concrete;

import HomeWork4_3.abstracts.PlayerService;
import HomeWork4_3.entities.Player;

public class PlayerManager implements PlayerService {


    @Override
    public void add(Player player) {

        System.out.println("Kullanıcı " + player.getUserName() +  " adı ile aramıza katıldı.");

    }

    @Override
    public void update(Player player) {

        System.out.println("Şifreniz güncellendi şu mail adresine gönderildi : " + player.geteMail());

    }

    @Override
    public void delete(Player player) {

        System.out.println("Hesap silindi.");
    }
}
