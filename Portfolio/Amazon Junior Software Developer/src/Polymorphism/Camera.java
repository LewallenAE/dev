package Polymorphism;

public class Camera {

    public void takePicture() {
        System.out.println("Taking an 8 megapixel picture in landscape mode.");
    }

    public void takePicture(String mode) {
        System.out.println("Taking picture in " + mode + " mode.");

    }

    public void takePicture(int resolution) {
        System.out.println("Taking a picture in " + resolution + " megapixels.");
    }

    public void takePicture(String mode, int resolution) {
        System.out.println("Taking a " + resolution + " megapixels picture in " + mode + " mode.");
    }
}
