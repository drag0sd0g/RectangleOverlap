package com.dragos.rectangleoverlap;

public class Rectangle {

    private final double topLeftX;
    private final double topLeftY;
    private final double width;
    private final double height;

    public Rectangle(double topLeftX, double topLeftY, double width, double height) {
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.width = width;
        this.height = height;
    }

    public double getTopLeftX() {
        return topLeftX;
    }

    public double getTopLeftY() {
        return topLeftY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean checkRectanglesOverlap(Rectangle rectangle) {
        return ((this.getTopLeftX() <= rectangle.getTopLeftX() && rectangle.getTopLeftX() <= (this.getTopLeftX() + this.getWidth())) ||
                (this.getTopLeftX() <= (rectangle.getTopLeftX() + rectangle.getWidth()) && ((rectangle.getTopLeftX() + rectangle.getWidth()) <=
                        this.getTopLeftX() + this.getWidth()))) &&
                ((this.getTopLeftY() <= rectangle.getTopLeftY() && rectangle.getTopLeftY() <= (this.getTopLeftY() + this.getHeight())) ||
                        (this.getTopLeftY() <= (rectangle.getTopLeftY() + rectangle.getHeight()) && ((rectangle.getTopLeftY() + rectangle.getHeight()) <=
                                this.getTopLeftY() + this.getHeight())));
    }
}
