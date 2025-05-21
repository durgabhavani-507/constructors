public class Rectangle { 
 int length; 
 int breadth; 
 public Rectangle() { 
  this.length=length; 
  this.breadth=breadth; 
 } 
 public Rectangle(int length,int breadth) { 
 this.length=length; 
  this.breadth=breadh; 
 } 
 public int area() { 
  return length*breadth; 
 } 
 public static void main(String[] args) { 
  Rectangle obj=new Rectangle(10,45); 
  int obj1 =obj.area(); 
  System.out.println("Area of rectangle is:"+obj1); 
 } 
} 