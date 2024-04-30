class students{

  int id;
  String name="";
  char gender;

 void display(){
  
  System.err.println("id-> "+id);
  System.err.println("name-> "+name);
  System.err.println("gender-> "+gender);
  
 }
}


class object{
  public static void main(String[] args) {
    students s1=new students();
    s1.name="shagun" ;
    s1.id=40;
    s1.gender='f';
    students s2=new students();
    s2.name="thakur" ;
    s2.id=50;
    s2.gender='f';

    s1.display();
    s2.display();
  }
}
