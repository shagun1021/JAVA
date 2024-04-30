//yahi pattern follow karna hain
class Sum{
      int x=0,y=0; // instance variable
      Sum(int x,int y){
            this.x=x;// instance variable <- local variable
            this.y=y;

      }
      void getSum(){
            int s=x+y;
            System.out.println("sum="+s);
      }


}

class Mul{
      int x=0,y=0;
      Mul(int x,int y){
            this.x=x;
            this.y=y;
      }
      void multi(){
      int result=x*y;
      System.out.println(result);
      }
}


public class Calc {
      public static void main(String args[]){
            Sum obj=new Sum(1,5);
            Mul objMul=new Mul(2,5);
            obj.getSum();
            objMul.multi();
            Sum obj2=new Sum(4,8);
            obj2.getSum(); 
                  
      
      }
      
}
