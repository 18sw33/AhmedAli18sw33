class Shape
{
              void drawShape()
	 {
	    System.out.print("Draw Shape");
	 }

	void eraseShape()
	 {
	   System.out.print("Erase Shape");
	 } 
}

class Square extends Shape
{
	void drawShape()
	  {
	     System.out.print("Draw Square Method");
	  }
	 
                 void eraseShape()
	  {
	     System.out.print("Erase Square Method");
	  }
}

class Triangle extends Shape
{

	void drawShape()
	  {
                     System.out.print("Draw Triangle");
	  }
	
	void eraseShape()
	 {
	    System.out.print("Erase Triangle");
	 }
}