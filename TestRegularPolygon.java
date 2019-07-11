/*Hale Þahin
  HW5, Q2
  150116841*/


//test class with main method for the regular polygon
public class TestRegularPolygon {
    public static void main(String[] args){
	 
       //create regular polygon object with default values
       RegularPolygon rp1 = new RegularPolygon(); 
       
       //create regular polygon object with specified values of n and side
       RegularPolygon rp2 = new RegularPolygon(6,4); 
       
       //create regular polygon object with specified values of n,side and coordinates x-and-y
       RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);
       
       //print out area and perimeter methods for each objects
       System.out.println("The area of first regular polygon is " + rp1.getArea());
       System.out.println("The perimeter of first regular polygon is " + rp1.getPerimeter());
       System.out.println("The area of first regular polygon is " + rp2.getArea());
       System.out.println("The perimeter of first regular polygon is " + rp2.getPerimeter());
       System.out.println("The area of first regular polygon is " + rp3.getArea());
       System.out.println("The perimeter of first regular polygon is " + rp3.getPerimeter());
      
       
}
}
