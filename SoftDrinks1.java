package day8;

abstract class SoftDrinks
{
	abstract void color(String a);
	void display()
	{
		System.out.println("color of softdrinks");
		
	}
}

class Pepsi extends SoftDrinks
{
	
	@Override
	void color(String a)
	{
		System.out.println(a);
	}
	
}

class S7up extends SoftDrinks
{
	@Override
	void color(String a)
	{
		System.out.println( a);
	}
}

class Sprite extends SoftDrinks
{
	@Override
	void color(String a)
	{
		System.out.println(a);
	}
}



public class SoftDrinks1 {

	public static void main(String[] args) {
		
		
		Pepsi p=new Pepsi();
		p.display();
		p.color("Pepsi is brown in color");
		
		S7up s=new S7up();
		s.color("Seven up is transparent in color");
		
		Sprite s1=new Sprite();
		s1.color("Sprite is transparent in color");
		

	}

}
