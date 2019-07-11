/*Hale Þahin
  HW5, Q2
  150116841*/

//class for regular polygon
public class RegularPolygon {
    
	 private int n;//declare private type for the number of sides as n
     private double side; //declare private type for the length of sides as side
     private double x; //declare private type for the x-coordinate
     private double y; //declare private type for the y-coordinate
     
     
     //constructor for the default values of data fields
     public RegularPolygon(){
    	 n = 3;
    	 side = 1;
    	 x = 0;
    	 y = 0;
     }
     //constructor for the specified values for number of side and length of side
     public RegularPolygon(int n, double side){
    	x = 0;
    	y = 0;
    	//accessing the data field
    	this.n = n;
    	this.side = side;
     }
     //constructor for the specified values of n,side,x and y
     public RegularPolygon(int n,double side,double x,double y){
    	 //accessing the data fields
    	 this.n = n;
    	 this.side = side;
    	 this.x = x;
    	 this.y = y;
     }
     //method for the return perimeter of the regular polygon
     public double getPerimeter(){
    	 return n*side;
     }
     //method for the return area of the regular polygon
     public double getArea(){
    	 double area = (n*Math.pow(side, 2)) / (4*Math.tan(Math.PI/n));
    	 return area;
     }
     //method for the return data fields and method returns as string of RegularPolygon class
     public String toString(){
    	 return  "The number of sides is " + n + "The length of side is " + side + 
    			 "The x-coordinate is " + x + "The y-coordinate is " + y +
    			 "The perimeter is " + getPerimeter() + " and The area is " + getArea();
    	
     }
}
