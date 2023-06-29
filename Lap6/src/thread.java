class  thread 
{
	public static void main(String[] args) 
	{
		System.out.println("Minute\tSecond");
		int m=2;
		for(int x=60 ;; x--)
		{		
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException arthit){}

			System.out.print("\r\t"+x );
			System.out.print("\t\r"+m );
			if(x==0)
			{
				m--; x=59;
			}
			if(m==-1)
				break;
		}		
		System.out.println();
	}
}
