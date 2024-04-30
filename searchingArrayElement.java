
import java.util.Scanner;
public class searching {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[];
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    arr=new int[n];

    System.out.println("enter array elementys ->");

    for(int i=0;i<n;i++){
      System.out.println("enter "+(i+1)+" element : ");
      arr[i]=sc.nextInt();
    }

    System.out.println("enter Searching element -> ");
    int src=sc.nextInt();
    Boolean flag=false;
    for(int i=0;i<n;i++){
      if(arr[i]==src){
        System.out.println(src+" found at "+i+" index");
        flag=true;
        break;
      }
    
    }
    if(flag==false) System.out.println("not found!");
  }
}
