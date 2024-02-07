
package example1;

public class Main {

    public static void main(String[] args) {
      
        Student s1= new Student();
        s1.setName("Zannat Hossain Tamim");
        s1.setAge(24);
        System.out.println("My name is "+s1.getName()+".");
        System.out.println("I'm "+s1.getAge()+" years old.");
        //s1.print();//for constructor
        
        Teacher t1= new Teacher();
        t1.setName("MA");
        t1.setAge(34);
        System.out.println( t1.getName());
        System.out.println(t1.getAge());
      
                
    }
    
}
