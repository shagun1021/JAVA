// Abstract class
abstract class Shape {
  // Abstract method
  abstract void draw();
}

// Concrete subclass extending the abstract class
class Rectangle extends Shape {
  // Implementing the abstract method
  void draw() {
      System.out.println("Drawing Rectangle");
  }
}

// Concrete subclass extending the abstract class
class Circle extends Shape {
  // Implementing the abstract method
  void draw() {
      System.out.println("Drawing Circle");
  }
}

public class Main {
  public static void main(String[] args) {
      // Creating objects of concrete classes
      Rectangle rectangle = new Rectangle();
      Circle circle = new Circle();

      // Calling the draw method on objects
      rectangle.draw();
      circle.draw();
  }
}
