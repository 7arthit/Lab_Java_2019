
public class MyStudent {//5
	public static void main(String [] args) {
		Student arthit = new Student("Arthit","63011212019",null);//5.1
		Student leo = new Student("Leo","63011212053",arthit);
		arthit.setclassMate(leo);// �͹�á��� leo ŧ�᷹ null �ѹ Error �֧��� .setclassMate(leo)
		arthit.print();//5.2
		leo.print();
	}
}
