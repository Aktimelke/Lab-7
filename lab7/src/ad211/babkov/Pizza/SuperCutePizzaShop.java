package ad211.babkov.Pizza;


import ad211.babkov.Pizza.Styles.*;

public class SuperCutePizzaShop extends PizzaStore {
    @Override
    public Pizza createPizza (PizzaTypes type) {
        Pizza pizza = null;
        switch (type) {
            case MARGARITA:
                pizza = new PizzaBogdan();
                break;
            case EL_PAPITO:
                pizza = new PizzaEl_Papito();
                break;
            case DYADYA_BOGDAN:
                pizza = new PizzaKey();
                break;
            case KLU4_NA_12:
                pizza = new PizzaMargarita();
                break;
            case EDINSTVENUII_3RITEL:
                pizza = new PizzaSingleViewer();
                break;
        }
        return pizza;
    }
}
