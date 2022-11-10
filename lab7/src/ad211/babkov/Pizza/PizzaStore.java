package ad211.babkov.Pizza;



public abstract class PizzaStore {
    public Pizza orderPizza(PizzaTypes type) {
        Pizza pizza = createPizza(type);

        pizza.makePizza();
        pizza.PizzaReady();

        System.out.println("Ваша пицца готова! Спасибо, приходите еще!");
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaTypes type);
}
