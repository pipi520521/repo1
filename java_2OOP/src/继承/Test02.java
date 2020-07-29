package 继承;

//super  只能在子类中使用，不能在main方法中使用。   
public class Test02 {
public static void main(String[] args) 
  {
	Zi a=new Zi();
	a.show();
	
	//子类继承了父类的方法。
	a.eat();
	
	
	}
}

class Fu{
	int count=30;
	int sum=55;
	public void eat() 
	{
		System.out.println("爸爸吃猪肉！");
	}
}

class Zi extends Fu{
	int count=20;
	public void show() 
	{
		int count=10;
		//就近原则，不指定用最近的局部count值
		System.out.println(count);        //10
		//用this.表示使用本对象的count值
		System.out.println(this.count);   //20
		//想要用父类中的count值，必须用super关键字表示父类
		System.out.println(super.count);  //30
		//继承了父类sum值
		System.out.println(sum);   //20
		super.eat();
	}
	public void eat() 
	{
		System.out.println("我在吃菠萝！");
	}
}