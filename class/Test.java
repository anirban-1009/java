class p
{
	public void m1()
	{
		System.out.println("parent");
	}
}

class c extends p
{
	public void m2()
	{
		System.out.println("child");
	}
}

class Test
{
	public static void main(String[ ] args)
	{
		c p = new c();
		p.m1();
		p.m2();
	}
}