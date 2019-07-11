/*Hale Þahin
  HW5, Q3
  150116841*/


//class for complex number operations 
public class ComplexNumber {
	
	private double re; //data field for real number
	private double im; //data field for imaginary number
	
	//constructor for a specified complex number
	public ComplexNumber(double r, double i) {
		re = r;
		im = i;
	}
	//method wants real part of the complex number
	public double getReal(){
		return re;
	}
	//method wants imaginary part of the complex number
	public double getImaginary(){
		return im;
	}	
	//method takes the opposite part of complex number according to the multiply
	public ComplexNumber reciprocal() {
		double denom = re*re + im*im;
        return new ComplexNumber(re / denom, -im / denom); //returns new complex number
	}
	//class do the addition operation of two complex number, returns new complex number
	public ComplexNumber add(ComplexNumber x){
	        double newre = re + x.re;
	        double newim = im + x.im;
	        return new ComplexNumber(newre, newim);
	}
	////class do the subtraction operation of two complex number, returns new complex number
	public ComplexNumber subtract(ComplexNumber y){
		ComplexNumber a = this;
        double newre = a.re - y.re;
        double newim = a.im - y.im;
        return new ComplexNumber(newre, newim);
	}
	//class do the multiplication operation of two complex number, returns new complex number
	public ComplexNumber multiply(ComplexNumber z){
		ComplexNumber a = this;
        double newre = a.re * z.re - a.im * z.im;
        double newim = a.re * z.im + a.im * z.re;
        return new ComplexNumber(newre, newim);
	}
	//class do the division operation of two complex number, returns new complex number
	public ComplexNumber divide(ComplexNumber t){
		ComplexNumber a = this;
        return a.multiply(t.reciprocal());
	}
	//method controls if two complex numbers are equal, returns boolean function.
	public boolean equals(ComplexNumber p){
		boolean equals;
		if ((re == p.re) && (im == p.im))
		     equals = true;
	    else
		     equals = false;
		
		return equals;
	}
	
	//method returns conjugate complex number of a complex number
	public ComplexNumber conjugate(){
		return new ComplexNumber(re, -im);
	}
	
	//method returns the angle of the complex number
	public double getAngle(){
		double degree = 0;
		if (re > 0){ 
			degree = Math.toDegrees(Math.atan(im/re));
		}else if ((re < 0) && (im >= 0)){
		    degree = Math.toDegrees(Math.atan(im/re) + Math.PI);
	    }else if((re < 0) && (im < 0)){
	    	degree = Math.toDegrees(Math.atan(im/re) - Math.PI);
	    }else if ((re == 0) && (im > 0)){
	    	degree = Math.toDegrees(Math.PI / 2);
	    }else if ((re == 0) && (im < 0)){
	    	degree = Math.toDegrees(-Math.PI / 2);
	    }
	        return degree; //return angle in terms of degree
	}
	
	
	public double getMagnitude(){
		return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
	}
	// return a string representation of the invoking Complex object
    public String toString() {
        String result;
        if (im == 0) {
        	result = re + "";
        }else if (re == 0) {
        	result = im + "i";
        }else if (im <  0) {
        	result = re + " - " + (-im) + "i";
        }else{
        	result = re + " + " + im + "i";
        }
    return result;
    		}
	
}
