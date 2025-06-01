package Zoo;

public class Penguin extends Animal implements Walk, Swim {



    public Penguin() {
        super("Penguin");
    }

    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am waddling across the ice at " + getWalkSpeed() + "mph.");
    }

    @Override
    public void swimming() {
        System.out.println(getNameOfAnimal() + ": I am swimming through the water at " + getSwimSpeed() +
                " nautical miles per hour.");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }



    @Override
    public void eatingFood() {
        System.out.println("The " + getNameOfAnimal() + " is eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("The " + getNameOfAnimal() + " is done eating.");
    }
}
