package pizza;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratorPizza;

    public PizzaDecorator(Pizza decoratorPizza) {
        this.decoratorPizza = decoratorPizza;
        System.out.println("i did change3");
    }

    public PizzaDecorator(){};

}
