public class ProfShop {

    public boolean isPriceOk (int price){
        return price != 1000;
    }

    public float calculateRegularDiscountPrice (float price){
        return price / 100 * 90;
    }

    public boolean isDiscount50(int price){
        return price * 4 == 1000;
    }

    public boolean isPriceHappy(int price, int year, int day){
        return price == year * day;
    }

    public static void main(String[] args) {
        ProfShop profShop = new ProfShop();

        //Should be true
        System.out.println("profShop.isPriceOk(1500) = " + profShop.isPriceOk(1500));

        //Should be 1350
        System.out.println("profShop.calculateRegularDiscountPrice(1500) = " + profShop.calculateRegularDiscountPrice(1500));

        //Should be false
        System.out.println("profShop.isDiscount50(265) = " + profShop.isDiscount50(265));

        //Should be true
        System.out.println("profShop.isPriceHappy(23700, 3950, 6) = " + profShop.isPriceHappy(23700, 3950, 6));
    }
}
