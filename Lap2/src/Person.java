
public class Person {//1
	public String name;
	public char gender;
	private String telno;//4.1 public > private
	private Person fan;//6.1 public > private
	private Person [] gig = new Person[2];//9.2
	
	public Person(String name)
	{
		this.name = name;//�� This ���Ъ��ͫ��
	}
	public Person (String name, char gender,String telno)
	{
		this.name = name;
		this.gender = gender;
		this.telno = telno;
	}
	public String toString()//1.1 //6.3 ���ͧ // ��÷Ѵ 18 - 21
	{
		return name;
	} // 6.4 ���Ѻ�׹
	
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
			return "���º͡";
		}
	}
	public Person getFan ()//5
	{
		return fan ;
	}
//	public void setFan(Person Whofan)//6.1 method setFan//7.1�� setFan 
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
				System.out.println("����¹Ό�͹���������");
			}

		}
		else 
		{
			System.out.println("����ǿ�Ҽ��!!! ��Ό�ѹ������");
		}
	}
	public void getFan(Person Whofan)//8.1
	{
		if (this.fan == Whofan)
		{
			System.out.println("�ش����ѡ��Ш��");
		}
		else 
		{
			System.out.println("�ѧ�����Ό���");
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
			System.out.println("�� 2 �������� ����������");
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
			System.out.println("����ա���ѡ�����");
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