package Zoo;

public class Dolphin extends Animal implements Swim {

    public Dolphin() {
        super("Dolphin");
    }

    private int swimmingSpeed;
    private String color;

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ": I am eating delicious fish.");
    }
    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten fish.");
    }

    @Override
    public void swimming() {System.out.println(getNameOfAnimal() +
            ": I am swimming at the speed of " + getSwimmingSpeed() +
            " nautical miles per hour.");}
}
