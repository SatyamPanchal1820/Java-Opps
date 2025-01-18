
public class Rectangle {
   double length, breadth;
   Rectangle(double length, double breadth) {
       this.length = length;
       this.breadth = breadth;
   }

   double getArea() {
       return length * breadth;
   }

   double getPerimeter() {
       return 2 * (length + breadth);
   }

   public static void main(String[] args) {

       Rectangle rect = new Rectangle(10, 20);
       
      
       System.out.println("Area of Rectangle is " + rect.getArea());
       System.out.println("Perimeter of Rectangle is " + rect.getPerimeter());
   }
}