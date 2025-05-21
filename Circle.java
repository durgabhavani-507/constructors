public class Circle { 
 double radius; 
  
 public Circle(double rad) { 
  this.radius=radius; 
 } 
 public double getArea() { 
  return (3.14*radius*radius); 
 } 
 public double getCircumference() { 
  return 2*3.14*radius; 
 } 
 public static void main(String[] args) { 
  Circle obj=new Circle(252); 
  double area=obj.getArea(); 
  System.out.println("Area of Circle is:"+area); 
  double circumference=obj.getCircumference(); 
  System.out.println("Circumference of Circle is:"+circumference); 
 } 
 
}