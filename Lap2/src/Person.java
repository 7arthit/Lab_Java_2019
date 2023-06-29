
public class Person {//1
	public String name;
	public char gender;
	private String telno;//4.1 public > private
	private Person fan;//6.1 public > private
	private Person [] gig = new Person[2];//9.2
	
	public Person(String name)
	{
		this.name = name;//ใช้ This เพราะชื่อซ้ำ
	}
	public Person (String name, char gender,String telno)
	{
		this.name = name;
		this.gender = gender;
		this.telno = telno;
	}
	public String toString()//1.1 //6.3 ทดลอง // บรรทัด 18 - 21
	{
		return name;
	} // 6.4 แก้กลับคืน
	
	public void setTelno(String telno)//4.2
	{
		this.telno = telno;
	}
	public String getPhone(Person Who)//4.3
	{
		if (this.gender != Who.gender)
		{
			return this.telno;
		}
		else 
		{
			return "ม่ายบอก";
		}
	}
	public Person getFan ()//5
	{
		return fan ;
	}
//	public void setFan(Person Whofan)//6.1 method setFan//7.1แก้ setFan 
//	{
//		this.fan = Whofan;
//	}
	public void setFan(Person  Whofan)//7.1
	{
		if (this.gender != Whofan.gender)
		{
			if(this.fan == null) //9.1
			{
				this.fan = Whofan;
			}
			else 
			{
				System.out.println("เปลื่ยนแฟนตอนนี้ไม่ได้นะ");
			}

		}
		else 
		{
			System.out.println("เดี๋ยวฟ้าผ่า!!! เป็นแฟนกันไม่ได้นะ");
		}
	}
	public void getFan(Person Whofan)//8.1
	{
		if (this.fan == Whofan)
		{
			System.out.println("สุดที่รักไงละจ๊ะ");
		}
		else 
		{
			System.out.println("ยังไม่มีแฟนจ้า");
		}
	}
	public void setgig(Person Whofan)//9.3
	{
		if(gig[0] == null) //9.4
		{
			gig[0] = Whofan;
		}
		else if(gig[1] == null) 
		{
			gig[1] = Whofan;
		}
		else
		{
			System.out.println("แค่ 2 คนพอแล้ว ดูแลไม่ไหว");
		}
	}
	public void getgig(Person Whofan)//9.5
	{
		if (this.gender == Whofan.gender)
		{
			for (int i = 0 ; i < gig.length ; i++)
			{
				System.out.println((i+1) + " " + gig[i]);
			}
		}
		else 
		{
			System.out.println("ไม่มีกิ๊กสักคนเลย");
		}
	}
	public void removegig()//10.1
	{
		for (int i = 0 ; i < gig.length ; i++)
		{
			gig[i] = null;
		}
	}
	public void removegig(Person Whofan)//10.2
	{
		for (int i = 0 ; i < gig.length ; i++)
		{
			if (gig[i] == Whofan) 
			{
				gig[i] = null;
			}
		}
	}
	public void getPersonInfo()//11
	{
		System.out.println("");
	}
}