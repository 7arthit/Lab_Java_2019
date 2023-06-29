
public class MyStudent {//5
	public static void main(String [] args) {
		Student arthit = new Student("Arthit","63011212019",null);//5.1
		Student leo = new Student("Leo","63011212053",arthit);
		arthit.setclassMate(leo);// ตอนแรกใส่ leo ลงไปแทน null มัน Error จึงใส่ .setclassMate(leo)
		arthit.print();//5.2
		leo.print();
	}
}
