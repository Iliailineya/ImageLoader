package org.example;

public class Main {
    public static void main(String[] args) {
      runDemo();
    }

    public static void runDemo(){
        ImageViewer imageViewer = new ImageViewer();

        imageViewer.displayImage("my_image.jpg");
        System.out.println();
        imageViewer.displayImage("another_image.png");
        System.out.println();
        imageViewer.displayImage("unsupported_image.gif");
    }
}