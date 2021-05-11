package HomeWork4_3.entities;

public class Campaign extends Product {


    private int discountRate;
    private String informationAboutDiscount;

    public Campaign() {
    }

    public Campaign(String informationAboutDiscount,int id, int discountRate) {
        this.setId(id);
        this.discountRate = discountRate;
    }


    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getInformationAboutDiscount() {
        return informationAboutDiscount;
    }

    public void setInformationAboutDiscount(String informationAboutDiscount) {
        this.informationAboutDiscount = informationAboutDiscount;
    }
}
