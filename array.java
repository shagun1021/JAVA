import java.util.*;
public class createArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [] arr=new int[5];

    System.out.println("enter array elements->");

    for(int i=0;i<5;i++){
      System.out.println("enter "+i+" element");
      arr[i]=sc.nextInt();
    }

    for (int i : arr) {
      System.out.println(i);
      
    }
    

  }
}

