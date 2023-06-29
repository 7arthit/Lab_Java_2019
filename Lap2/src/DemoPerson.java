
public class DemoPerson {//2

	public static void main(String[] args) {
		Person dome = new Person("Dome");//2.1,2.2
		Person ploy = new Person("Ploy");//2.1,2.2
		Person ken = new Person("Ken",'M',"0968960752");//2.1,2.2
		Person may = new Person("May",'F',"0968960753");//2.1,2.2
		Person ann = new Person("Ann",'F',"0968960754");//2.1,2.2
		Person fon = new Person("Fon",'F',"0968960755");//2.1,2.2
		
		dome.gender = 'M';//2.2
		//dome.telno = "0967353968";//2.2
		dome.setTelno("0967353968");
		
		ploy.gender = 'F';//2.2
		//ploy.telno = "0968960751";//2.2
		ploy.setTelno("0968960751");
		
		System.out.println(dome.getPhone(ploy));//3	//4.3 ถ่าเพศเดยวกันไม่บอก
		
		System.out.println(dome.getFan());//6.1
		
		dome.setFan(ploy);//5.1 ค่าพารามิเตอร์ จากบรรทัด 5-10 // 7.1 เซตชื่อ ken
		
		System.out.println(dome.getFan());//6.2
		
		dome.getFan(may);//8.1 ค่าพารามิเตอร์ จากบรรทัด 5-10
		
		dome.setFan(may);//9.1
		
		dome.setgig(may);//9.3
		
		dome.setgig(ann);//9.4
		
		dome.setgig(fon);//9.4
		
		dome.getgig(ken);//9.5
		
		dome.removegig();//10.1
		dome.getgig(ken);//10.1
	}
}
