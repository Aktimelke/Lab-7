package ad211.babkov.CoffeeShop;

import ad211.babkov.CoffeeShop.Styles.*;


public class UkranianCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new UkranianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new UkranianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new UkranianStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new UkranianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
