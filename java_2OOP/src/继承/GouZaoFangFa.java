package 继承;

public class GouZaoFangFa
{

	public static void main(String[] args)
	{
		Zi1 a=new Zi1();
	}
}

class Fu1{
	 public Fu1() { System.out.println("父类构造方法"); }
}

class Zi1 extends Fu1{
public Zi1() { 
	//子类无参构造中，赢藏了super();自动找父类的无参构造
	System.out.println("子类构造方法"); }
}