package academy.learnprogramming;

public class WallArea {
    private double width;
    private double height;

    public WallArea() {
        this(0, 0);
    }

    public WallArea(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double getArea() {
        return height * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}
