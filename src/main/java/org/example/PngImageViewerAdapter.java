package org.example;

public class PngImageViewerAdapter implements ImageViewerAdapter {
    private final PngImage image;

    public PngImageViewerAdapter(PngImage image) {
        this.image = image;
    }

    @Override
    public void displayImage(String fileName) {
        System.out.println("Image format: PNG");
        System.out.println("Image file name: " + fileName);
        image.display();
    }
}