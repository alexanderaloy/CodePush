

import CodeValidate.SampleReviewSuperClass;

//Run Time Polymorphism or Method Overriding example
public class SampleReviewProject1 extends SampleReviewSuperClass{
	int r,base=60,height=40;	
    public void areaOfRectangle() {
    r = base * height;	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleReviewProject1 obj = new SampleReviewProject1();
		obj.areaOfTriangle();
		System.out.println("Area of triangle is "+obj.a);
		obj.areaOfRectangle();
		System.out.println("Area of Rectangle is "+obj.r);
	}

}
