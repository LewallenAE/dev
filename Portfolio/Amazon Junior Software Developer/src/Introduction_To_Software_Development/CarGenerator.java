/*

package Introduction_To_Software_Development;


import java.util.Random;

public class CarGenerator {

    public static Car generateRandomCar() {



        String[] makes = {"Toyota", "Ford", "Honda", "Tesla", "Chevy"};
        String[] models = {"Camry", "Mustang", "Civic", "Model 3", "Impala"};
        String[] colors = {"Red", "Blue", "Black", "White", "Silver"};
        int[] years = {2020, 2021, 2022, 2023, 2024};

        Random rand = new Random();

        String make = makes[rand.nextInt(makes.length)];
        String model = models[rand.nextInt(models.length)];
        String color = colors[rand.nextInt(colors.length)];
        int year = years[rand.nextInt(years.length)];

        return new Car(make, model, color, year);
    }

    public static void main(String[] args) {

        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = generateRandomCar();
        }


    }
}

*/