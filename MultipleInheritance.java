// Interface for the first parent
interface Parent1 {
  void method1();
}

// Interface for the second parent
interface Parent2 {
  void method2();
}

// Class implementing both interfaces
class Child implements Parent1, Parent2 {
  // Implementing method from Parent1 interface
  public void method1() {
      System.out.println("Method from Parent1");
  }

  // Implementing method from Parent2 interface
  public void method2() {
      System.out.println("Method from Parent2");
  }
}

public class MultipleInheritance {
  public static void main(String[] args) {
      // Creating object of Child class
      Child child = new Child();

      // Calling methods of both interfaces
      child.method1();
      child.method2();
  }
}
