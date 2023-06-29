
public class Family {//3
	public static void main(String[] args) 
	{
		People beckham = new People("Beckham",'M',"Barcelona");//3.1
		People victoria = new People("Victoria",'F',"London");
		Children brooklyn = new Children("Brooklyn",'M',"Roma",beckham,victoria);//3.2
		Children harper = new Children("Harper",'F',"Paris",beckham,victoria);
	
		System.out.println(brooklyn.name);//4.1
		System.out.println(harper.name);//4.1
	
		System.out.println(brooklyn.name);//4.3
		System.out.println(harper.name);//4.3
		
		System.out.println(brooklyn.getFather());//5.2
		System.out.println(brooklyn.getMother());//5.2
		
		System.out.println(brooklyn.getFather().getWorkplace());//6.1
		System.out.println(brooklyn.getMother().getWorkplace());//6.1
		
		System.out.println(brooklyn.getWorkplace());//6.2
		System.out.println(harper.getWorkplace());//6.2
		
		if (brooklyn.equals(victoria))
		{
			System.out.println("รักแม่ที่สุดเลย สุขสันต์วันแม่");//7.1
		}
		else
		{
			System.out.println("ไม่ใช่แม่หนูซักหน่อย");//7.1
		}
		
		System.out.println(brooklyn.respectTo(beckham));//8.2
		System.out.println(brooklyn.respectTo(harper));//8.2
	}
}
