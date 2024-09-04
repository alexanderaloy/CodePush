

import CodeValidate.SampleReviewSuperClass;

//Run Time Polymorphism or Method Overriding example
public class SampleReviewProject2 extends SampleReviewSuperClass{
	int s,side=5;	
    public void areaOfSquare() {
    s = side * side ;	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleReviewProject2 obj = new SampleReviewProject2();
		obj.areaOfTriangle();
		System.out.println("Area of triangle is "+obj.a);
		obj.areaOfSquare();
		System.out.println("Area of Rectangle is "+obj.s);
	}

}
