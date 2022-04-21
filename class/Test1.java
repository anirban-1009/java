class p
{
	public void sum()
	{
		System.out.println("sum");
	}
}

class q extends p
{
	public void sum1()
	{
		System.out.println("sum1");
	}
}

class r extends p
{
	public void sum2()
	{
		System.out.println("sum2");
	}
}


class Test1
{
	public static void main(String[ ] args)
	{
		r man = new r();
		man.sum();
		man.sum2();
	}
}