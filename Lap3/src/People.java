
public class People {//1
	public String name;
	public char gender;
	private String workplace;
	
	 People(String name,char gender)//1.1
	 {
		 this.name = name;
		 this.gender = gender;
	 }
	 People(String name,char gender,String workplace)//1.2
	 {
		 this(name,gender);
		 this.workplace = workplace;
	 }
	 public String getWorkplace()
	 {
		 return this.workplace;
	 }
	 public String toString()//5.2
	 {
		return this.name;
	 }
}
class Children extends People implements GoodChild//2
{
	private People father;//2.1
	private People mother;//2.1
	public String school;//2.1
	
	public Children(String name,char gender,People father,People mother)//2.1
	{ 
		 super(name,gender);//2.2
		 this.setFather(father);//2.1
		 this.setMother(mother);
	}
	public Children(String name,char gender,String school,People father,People mother)//2.1
	{
		this(name,gender,father,mother);//2.2
		this.school = school;
	}
	@Override
	public String toString()//4.2
	{
		if(this.gender == 'M')
		{
			return this.name+"(Boy)";
		}
		else
		{
			return this.name+"(Girl)";
		}
	}
	public People getFather() //5.1
	{
		return father;
	}
	public void setFather(People father)//5.1
	{
		this.father = father;
	}
	public People getMother()//5.1
	{
		return mother;
	}
	public void setMother(People mother)//5.1
	{
		this.mother = mother;
	}
	@Override
	public String getWorkplace()//6.2
	{
		return "ยังเรียนหนังสืออยู่ที่ "+this.school ;
	}
	@Override
	public boolean equals(Object check)//7.1
	{
		if(this.mother == (People)check)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String respectTo(People people)//8.1.2
	{
		String who = "";
		if(this.father == people)
		{
			who = " father";
		}
		else if(this.mother == people)
		{
			who = " Mother";
		}
		if(this.gender == 'M')
		{
			return "สวัสดีครับ "+ who;
		}
		else if(this.gender == 'F')
		{
			return "สวัสดีค่ะ "+ who;
		}
		else
		{
			return "สวัสดี "+ who;
		}
	}
}
interface GoodChild//8.1
{
	String respectTo(People people);//8.1.1
}