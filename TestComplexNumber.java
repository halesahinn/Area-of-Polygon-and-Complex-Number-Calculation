/*Hale Þahin
  HW5, Q3
  150116841*/

//test program with main method for the complexnumber class
public class TestComplexNumber {
     public static void main(String[] args){
    	 
    	 ComplexNumber cn1 = new ComplexNumber(2,3); //create new object
    	 ComplexNumber cn2 = new ComplexNumber(-1,5); //create new object
    	 ComplexNumber cn3, cn4, cn5, cn6, cn7, cn8;  //create new objects
    	
    	 
    	 
    	 System.out.println("First Complex Number is: " + cn1.toString()); //show the complex number
    	 System.out.println("Second Complex Number is: " + cn2.toString()); 
    	 
    	 if (cn1.equals(cn2)){ //control equals method for cn1 and cn2 
    	     System.out.println("They are equal to each other.");
    	 }else{
    		 System.out.println("They are not equal to each other.");
    	 }
    	 
    	 cn3 = cn1.reciprocal(); //take reciprocal of cn1 and assign it to cn3
    	 System.out.println("The reciprocal of " + cn1 + " is " + cn3); //print cn3 
    	 
    	 cn4 = cn1.add(cn2); //add cn1 and cn2 assign the result to cn4
    	 System.out.println("cn1 + cn2 = " + cn4);
    	 
    	 cn5 = cn1.subtract(cn2); //subtract cn2 from cn1 assign the result to cn5 
    	 System.out.println("cn1 - cn2 = " + cn5);
    	 
    	 cn6 = cn1.multiply(cn2); //multiply cn1 and cn2 and assign the result to cn6
    	 System.out.println("cn1 * cn2 = " + cn6);
    	 
    	 cn7 = cn1.divide(cn2); //divide cn2 by cn1 and assign the result to cn7
    	 System.out.println("cn1 / cn2 = " + cn7);
    	 
    	 cn8 = cn1.conjugate(); //take the conjugate  of cn1 and assign it to cn8
    	 System.out.println("The conjugate of first complex number ("+ cn1.toString() + ") is " + cn8);
    	 
    	 double x = cn1.getAngle(); //want angle of cn1
    	 System.out.println("The angle of first complex number (" + cn1.toString() + ") is " + x);
    	 
    	 double y = cn1.getMagnitude(); //want magnitude of cn1
    	 System.out.println("The magnitude of first complex number (" + cn1.toString() + ") is " + y);
     }
}
