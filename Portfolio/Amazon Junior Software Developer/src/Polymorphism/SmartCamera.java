package Polymorphism;

public class SmartCamera extends Camera  {

    public void takePicture() {


        super.takePicture();

        System.out.println("Applying AI to enhance the picture.");
    }

}
