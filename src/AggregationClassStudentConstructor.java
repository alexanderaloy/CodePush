

public class AggregationClassStudentConstructor {
	AggregationClassSubjectConstructor sub;
	String name;
	int rollno;
	public AggregationClassStudentConstructor(String name,int rollno,AggregationClassSubjectConstructor sub) {
	this.name = name;
	this.rollno = rollno;
	this.sub = sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AggregationClassSubjectConstructor sub = new AggregationClassSubjectConstructor("maths",5);
	AggregationClassStudentConstructor obj = new AggregationClassStudentConstructor("Alex",2,sub);
	System.out.println("values  are \n"+obj.name+" "+obj.rollno+" "+obj.sub.subject+""+obj.sub.chapter);
	}

}
