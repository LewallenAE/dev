package Zoo;

public class Tiger extends Animal implements Walk {


    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    public Tiger() {
        super("Tiger");
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + ": I have eaten meat.");
    }

    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am moving at the speed " + getSpeed() + "mph.");
    }


}

