package ad211.babkov.Pizza;


public class Main {
    public static void main (String[] args){
        PizzaStore Store = new SuperCutePizzaShop();
        Store.orderPizza(PizzaTypes.EL_PAPITO);
    }
}
