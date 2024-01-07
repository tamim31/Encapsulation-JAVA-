
package example2;

 class Rectangle {

     private int wide;
     private int height;

    Rectangle(int wide,int height){
        this.wide=wide;
        this.height=height;
    }
        public void getArae(){
            int area= wide * height;
            System.out.println("Area of the Rectangle is "+ area);
        }   
     
}
