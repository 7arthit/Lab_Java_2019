
public class Student {//4
	String name,id ;
	Student classMate;
	
	Student(String Name,String Id,Student ClassMate) {//4.1
		name = Name;
		id = Id;
		classMate = ClassMate ;
	}
	void setclassMate(Student sm) {
		classMate = sm;
	}
	void print() {
		System.out.println("Name : "+ name +" Id : "+ id +" ClassMate : "+ classMate.name );
	}// .name เพราะว่า จะได้เรียกชื่อเพื่อน
	
}