
class A{
  A(){
    System.out.println("hello A constructor");
  }
}

class B extends A{
  B(){
    System.out.println("hello B constructor");
  }
}


public class constractor {
  public static void main(String[] args) {
    
    B obj=new B();
  }
}
