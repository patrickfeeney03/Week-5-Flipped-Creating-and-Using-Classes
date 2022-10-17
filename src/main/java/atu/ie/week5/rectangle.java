package atu.ie.week5;

public class rectangle
{
    private double length;
    private  double width;

    public rectangle()
    {
        this.length = 0;
        this.width = 0;
    }

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
