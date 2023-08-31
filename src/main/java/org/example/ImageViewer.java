package org.example;

import java.util.*;

public class ImageViewer {
    private final Map<String, ImageViewerAdapter> adapters;

    public ImageViewer() {
        adapters = new HashMap<>();
        adapters.put("jpg", new JpgImageViewerAdapter(new JpgImage()));
        adapters.put("png", new PngImageViewerAdapter(new PngImage()));
    }

    public void displayImage(String fileName) {
        String extension = getExtension(fileName);
        ImageViewerAdapter adapter = adapters.get(extension.toLowerCase());

        if (adapter != null) {
            adapter.displayImage(fileName);
        } else {
            System.out.println("Unsupported image format.");
        }
    }

    private String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1);
        }
        return "";
    }
}