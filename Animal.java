public abstract class Animal {

    protected char animal;
    protected double price;

    public Animal(char animal, double price) {
        this.animal = animal;
        this.price = price;
        setAnimal(animal);
        setPrice(price);
    }

    public void setAnimal(char animal) {
        this.animal = animal;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getAnimal() {
        return animal;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();

}
