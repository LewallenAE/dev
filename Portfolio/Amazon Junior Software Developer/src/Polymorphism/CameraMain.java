package Polymorphism;

public class CameraMain {
    public static void main(String[] args) {


        Camera myFavCamera = new Camera();
        myFavCamera.takePicture();
        myFavCamera.takePicture("portrait");
        myFavCamera.takePicture(12);
        myFavCamera.takePicture("landscape", 24);

        Camera smartCamera = new SmartCamera();
        smartCamera.takePicture();
        smartCamera.takePicture("portrait");
        smartCamera.takePicture(12);
        smartCamera.takePicture("landscape", 24);
    
}
}
