package GeoFigure;

public class Rectangle extends GeoFigure{
     // Data Fields
  protected int width;
  protected int height;
  // Methods
  // Constructors

  public Rectangle() {}
  public Rectangle(int wid, int hei) {
    width = wid;
    height = hei;
  }
  // Modifiers
  public void setWidth(int wid) {
    width = wid;
  }
  public void setHeight(int hei) {
    height = hei;
  }
  // Accessors:
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }

  public double computeArea() {
    return height * width;
  }
  public double computePerimeter() {
    return 2 * (height + width);
  }
  public void displayMessage() {
    System.out.println("Rectangle: width is " + width + ", height is " + height);
  }
} 


