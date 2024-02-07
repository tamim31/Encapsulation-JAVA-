
package example7;

public class Rect extends Shape{
    
    double x,y;
    Rect(double x,double y)
    {
        this.x=x;
        this.y=y;              
    }
    @Override
    public double getArea()
    {
        return x*y;
    }
    public void print()
    {
        System.out.println("Rect area is" +getArea());
    }
    
}

