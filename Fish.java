import java.text.DecimalFormat;

public class Fish extends Animal{

    protected String fish;
    protected double weight;

    private static DecimalFormat df2 = new DecimalFormat("0.00");
    
    public Fish(char animal, String fish, double price, double weight) {
        super(animal, price);
        setFish(fish);
        setWeight(weight);
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFish() {
        return fish;
    }

    public double getWeight() {
        return weight;
    }

    public double calculatePrice() {
        System.out.println("The total price for " + getFish() + " is ");
        return weight * price;
    }

    public String toString() {
        return "Product = " + getAnimal() + "\nFish = " + getFish() + "\nWeight = " + df2.format(getWeight()) +
                "\nPrice/kg = " + df2.format(getPrice()) + "Total Price = " + df2.format(calculatePrice());
    }
}
