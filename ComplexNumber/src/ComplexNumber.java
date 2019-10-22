package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
* It is an <em>immutable</em> object.
*
* @author Harkiran
*/
public class ComplexNumber {
    public double rectangle_re;
    public double rectangle_im;
//Instance variable declarations
/**
* Construct a ComplexNumber given its
* real and imaginary parts.
* @param re The real component
* @param im The imaginary component
*/
public ComplexNumber(double re, double im) {
    
   rectangle_re = re;
   rectangle_im = im;
//Initialize the instance variables
}
/**
* Returns the real component.
* @return the real
*/
public double getReal() {
return rectangle_re;
}
/**
* Returns the imaginary component.
* @return the imaginary
*/
public double getImaginary() {
return rectangle_im;
}
/**
* Returns a new ComplexNumber number that is
* the negative of <em>this</em>. Note: the
* original ComplexNumber is <b>NOT</b>
* modified.
* @return -this
*/
public ComplexNumber negate() {
ComplexNumber y= new ComplexNumber(-rectangle_re,-rectangle_im);
return y; 
// Create a new object of the ComplexNumber class 
// Initialize the new class with the negative varialbe values of the class
}
/**
* Returns a new ComplexNumber that is the
* sum of <em>this</em> and <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this + z
*/
public ComplexNumber add(ComplexNumber z) {
ComplexNumber a= new ComplexNumber((rectangle_re +z.getReal()),
        rectangle_im+ z.getImaginary());
return a;
}
/**
* Returns a new ComplexNumber that is the
* difference of <em>this</em> and <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this + z
*/
public ComplexNumber subtract(ComplexNumber z) {
    ComplexNumber s= new ComplexNumber((rectangle_re -z.getReal()),
        rectangle_im- z.getImaginary());
return s; 
}
/**
* Returns a new ComplexNumber that is the
* product of <em>this</em> and <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this * z
*/
public ComplexNumber multiply(ComplexNumber z) {
ComplexNumber m= new ComplexNumber((rectangle_re *z.getReal()) -(rectangle_im *z.getImaginary()),
        ((rectangle_re* z.getImaginary()) + (rectangle_im *z.getReal())));
return m;
}
/**
* Returns a new ComplexNumber that is
* the reciprocal of <em>this</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @return 1.0 / this
*/
public ComplexNumber reciprocal() {
   double new_real = rectangle_re / ((rectangle_re*rectangle_re) +(rectangle_im *rectangle_im));
   double new_im = -rectangle_im / ((rectangle_re*rectangle_re) +(rectangle_im *rectangle_im));
   ComplexNumber r = new ComplexNumber(new_real, new_im);
return r;
}
/**
* Returns a new ComplexNumber that is
* <em>this</em> divided by <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this / z
*/
public ComplexNumber divide(ComplexNumber z) {
    double new_re = (((rectangle_re* z.getReal()) + (rectangle_im *z.getImaginary()))/ ((z.getReal()*z.getReal()) + (z.getImaginary()*z.getImaginary())));
    double new_im = (((rectangle_im* z.getReal()) - (rectangle_re *z.getImaginary()))/ ((z.getReal()*z.getReal()) + (z.getImaginary()*z.getImaginary())));
ComplexNumber d = new ComplexNumber( new_re, new_im);
return d;
}
/**
* Returns a String representation of
* <em>this</em> in the format:
* <pre>
* real +-(optional) i imaginary
* </pre>
* If the imaginary part is zero, only the
* real part is converted to a String.
* A "+" or "-" is placed between the real
* and imaginary parts depending on the
* the sign of the imagrinary part.
* <p>
* Examples:
* <pre>
* ..println(new ComplexNumber(0,0); -> "0.0"
* ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
* ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
* </pre>
* @return the String representation.
*/
@Override
public String toString() {
//DO NOT MODIFY THIS CODE!
String str = "" + this.getReal();
if (this.getImaginary() == 0.0) {
return str;
}
if (this.getImaginary() > 0) {
return str + " + i" + this.getImaginary();
} else {
return str + " - i" + -this.getImaginary();
}
}
}




