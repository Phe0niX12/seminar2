package Model;

public class Apple implements IObject{

    double weight;

    public final String TYPE = "Apple";

    public Apple(double volume){this.weight = volume;}

    public double getMinWeight(){return this.weight;}

    public String getString(){return this.TYPE;}

}
