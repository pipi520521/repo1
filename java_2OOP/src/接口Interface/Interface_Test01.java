package 接口Interface;

public class Interface_Test01
{

	public static void main(String[] args)
	{
		Inter a=new interImpl();
		a.eat();
		a.save();
		System.out.println(a.nameString);
		
		//接口中都是静态常量
		System.out.println(Inter.nameString);
		
		
	//Inter bInter=new Inter();
	//接口不能被实例化
	}
}

//创建接口  interface相当于特殊类
interface Inter{
	//6、接口中都是静态常量、系统自动添加static final
	// int a; 编译报错
	String nameString="haha";
	
	abstract public	void eat();
//1、接口中全部是抽象方法，abstract public可以省略，只要没有方法体就行！
    void save();
    
 //public void Inter() {}     5、接口里没有构造方法
}

//2、想要使用接口里的功能，创建实现类
//3、作为实现类，有2条路：把全部抽象方法重写+否则就是抽象实现类
 class interImpl implements Inter{
	// 4、必须重写所有抽象方法，去掉abstract+加上方法体，否则就是抽象类
	 @Override
	  public void eat() {
		  System.out.println(" eat()");
	  };
//7、接口中方法重写时必须要有足够的权限，接口中都是public，重写时也必须public修饰符
	  @Override
	  public void save() {
		  System.out.println(" save();");
	  };
	  public void interImpl() {
		
		  System.out.println(" save();");
	  };
}