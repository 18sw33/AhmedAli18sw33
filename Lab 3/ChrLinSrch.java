public class ChrLinSrch
{
   public static int linearSearch(char[] c,char x)
     {
	 for(int j=0;j<c.length;j++)
	  {
	      if(c[j]==x)
	        { 
                 	return j;
                        }
	}
	return -1;
	}

    public static void main(String[] args) 
      {
	char[] c={'a','b','c','d','e','f','g','h'};
	System.out.println("Character at index:"+ linearSearch(c,'e'));
      }	
}