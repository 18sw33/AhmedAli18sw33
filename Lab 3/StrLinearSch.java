public class StrLinearSch
{
	public static int linearSearch(String[] s,String x)
	{
		for(int l=0;l<s.length;l++)
		{
			if(s[l]==x)
			{
				return l;
			}
		}
			return -1;
	}

	public static void main(String[] args) 
	{
		String[] s={"Smith","Adams","Abel","Baker","Jack","Hugo","Anne"};
		System.out.println("String Found at :"+linearSearch(s,"Adams"));	
	}
}