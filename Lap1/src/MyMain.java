
public class MyMain {//2
	public static void main(String[] args) {
	MyDate date1 = new MyDate();//2.1
	date1.setDay(8);//2.2
	date1.setMonth(1);
	date1.setYear(2019);
	date1.print();//2.3
	date1.setDay(29);//2.4
	date1.setMonth(2);
	date1.print();//2.5
	date1.setDay(32);
	date1.setMonth(13);
	date1.print();
	MyDate date2 = new MyDate(28,6,2021);//3.3
	date2.print();//3.4
	}
}