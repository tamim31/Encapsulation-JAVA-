
package example2;

 class Circle {
    
    private final int radius;

     Circle(int radius) {
        this.radius=radius;
    }
    public void draw()
    {
        System.out.println("The radius of the circle is "+radius+" cm & this is given.Now you can draw.");
    }
}
