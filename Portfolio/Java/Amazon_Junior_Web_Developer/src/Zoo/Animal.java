package Zoo;

abstract public class Animal implements Eat {

    private String nameOfAnimal;

    private int weight;

    private int height;

    private int age;

    // private String animalDiet;

    public Animal() { nameOfAnimal = "Unknown Animal";}

    public Animal(String nameOfAnimal) {this.nameOfAnimal = nameOfAnimal;}

    public String getNameOfAnimal(){ return nameOfAnimal;}

    public void setNameOfAnimal(String nameOfAnimal) {this.nameOfAnimal = nameOfAnimal;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) { this.weight = weight;}

    public int getHeight() { return height;}

    public void setHeight(int height) {this.height = height;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    // public String getDiet() {return animalDiet;}

    // public void setDiet(String animalDiet) { this.animalDiet = animalDiet;}

    @Override
    public void eatingFood() { System.out.println("The animal: " + nameOfAnimal + " is eating.");}


}
