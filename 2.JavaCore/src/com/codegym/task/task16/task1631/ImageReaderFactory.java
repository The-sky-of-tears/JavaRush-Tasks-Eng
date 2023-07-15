package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null) {
            throw new IllegalArgumentException("Unknown image type");
        }

        return switch (type) {
            case BMP -> new BmpReader();
            case JPG -> new JpgReader();
            case PNG -> new PngReader();
            default -> throw new IllegalArgumentException("Unknown image type");
        };
    }
}
