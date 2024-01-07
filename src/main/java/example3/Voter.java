
package example3;


public class Voter {
    
        private int age;

    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
           if(age>=18)
           {
                
               System.out.println("Eligable for vote.");
           }
           else
           {
                
               System.out.println("Is not eligable for vote.");
           }
    }

}
