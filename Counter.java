import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        char type = 'F';
        String name;
        double weight;
        double price;

        Fish[] fishObj = new Fish[2];

        for(int i = 0; i < fishObj.length; i++) {

            System.out.print("Fish name: ");
            name = sc1.nextLine();

            System.out.print("Fish price: ");
            price = sc1.nextDouble();

            System.out.print("fish weight: ");
            weight = sc1.nextDouble();
            sc1.nextLine();

            fishObj[i] = new Fish(type, name, price, weight);
        }

        for(int i = 0; i < fishObj.length; i ++) {
            System.out.println(fishObj[i]);
            System.out.println("-------------------------------");
        }
    }
}
