/* Hale Þahin
  HW5, Q1
  150116841*/

public class Rectangle {
	    double width; //declare width for rectangle
	    double height; //declare height for rectangle
	    
	    //constructor with default values
	    Rectangle() {  
	        width = 1.0;
	        height = 1.0;
	    }
	    //constructor with specified values
	    Rectangle(double newWidth,double newHeight){
	        width = newWidth;
	        height = newHeight;
	    }
	    //method for the return area of rectangle
	    double getArea(){
	        double area = width * height;
	        return area;
	    }
	    //method for the return perimeter of rectangle
	    double getPerimeter(){
	        double perimeter = 2 * (width + height);
	        return perimeter;
	    }
	    //method for the return string combinations of data fields of rectangle class
	    public String toString(){
	        return width + " is width " + height + " is height " + width*height + " is area " + 2*(width+height) + " is perimeter";
	    }
}
