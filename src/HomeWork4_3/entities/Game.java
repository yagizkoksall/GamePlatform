package HomeWork4_3.entities;

public class Game extends Product{

       private String gameName;
       private String informationAboutGame;
       private double unitPrice;


        public Game(){}

        public Game(String gameName, String informationAboutGame, double unitPrice) {
                this.gameName = gameName;
                this.informationAboutGame = informationAboutGame;
                this.unitPrice = unitPrice;
        }

        public String getGameName() {
                return gameName;
        }

        public void setGameName(String gameName) {
                this.gameName = gameName;
        }

        public String getInformationAboutGame() {
                return informationAboutGame;
        }

        public void setInformationAboutGame(String informationAboutGame) {
                this.informationAboutGame = informationAboutGame;
        }

        public double getUnitPrice() {
                return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
                this.unitPrice = unitPrice;
        }
}
