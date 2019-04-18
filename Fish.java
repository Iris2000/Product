public class Fish extends Animal{

    protected String fish;
    protected double weight;

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
        return "Product = " + getAnimal() + "\nFish = " + getFish() + "\nWeight = " + getWeight() +
                "\nPrice/kg = " + getPrice() + "Total Price = " + calculatePrice();
    }
}
