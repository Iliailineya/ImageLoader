package org.example;

public class JpgImageViewerAdapter implements ImageViewerAdapter {
    private final JpgImage image;

    public JpgImageViewerAdapter(JpgImage image) {
        this.image = image;
    }

    @Override
    public void displayImage(String fileName) {
        System.out.println("Image format: JPG");
        System.out.println("Image file name: " + fileName);
        image.display();
    }
}
