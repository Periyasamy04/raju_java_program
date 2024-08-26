package numberguessinggame;

public class Shop extends Dealer{

    int boostmrp=100;
    int boostsellingprice=98;

    public Shop(int boostmrp){
        super(boostmrp);
        System.out.println(this.boostmrp);
        System.out.println(super.boostmrp);

    }

    public static void main(String[] args) {
        Shop shop = new Shop(110);
    }
}
