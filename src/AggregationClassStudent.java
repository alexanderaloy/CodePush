

public class AggregationClassStudent {
	AggregationClassSubject sub;
	String name;
	int rollno;
	void studentdata() {
	name = "Alex";
	rollno = 6;
	//sub = new AggregationClassSubject();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationClassStudent obj = new AggregationClassStudent();
		obj.studentdata();
		obj.sub = new AggregationClassSubject();
		obj.sub.studentsubjectdetails();
		System.out.println("Result is" +obj.name+" "+obj.rollno+" "+obj.sub.subject+" "+obj.sub.chapter);
	}
}
