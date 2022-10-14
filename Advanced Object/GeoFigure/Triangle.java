package GeoFigure;
public class Triangle extends GeoFigure {
    // Data Fields
    protected int base;
    protected int height;
    // Methods
    // Constructor

    public Triangle(int bas, int hei) {
      base = bas;
      height = hei;
    }
      
    public Triangle() {}
      
    // Modifiers
    public void setBase(int bas) {
      base = bas;
    }
    public void setHeight(int hei){
      height = hei;
    }
    // Accessors:
    public int getBase() {
      return base;
    }
    public int getHeight() {
      return height;
    }

    
    // Operations
    public double computeArea() {
      return height * base / 2.0;
    }
    public double computePerimeter() {
      return height + base + 
             Math.sqrt(height*height + base*base);
    }
    public void displayMessage() {
      System.out.println("Right Triangle: base is " + base +
             ", height is " + height);
    }
  }
