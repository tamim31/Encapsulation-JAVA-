
package example5;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Author a1=new Author();
        a1.setName("tamim");
        System.out.println(a1.getName());
        a1.setEmail("tamim@gmail.com");
        System.out.println(a1.getEmail());
        a1.setGender("female");
        System.out.println(a1.getGender());
        
        Book b1=new Book("book name", a1.getName(),"123.00 taka", 10);
        
        System.out.println(b1.getName());
         System.out.println(b1.getAuthor());
          System.out.println(b1.getPrice() );
           System.out.println(b1.getTotal());
        
        
        
    }
    
}
