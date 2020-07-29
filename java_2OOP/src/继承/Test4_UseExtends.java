package 继承;

public class Test4_UseExtends {
	static public  void main(String[] args) {
		//创建对象测试
		Zi3 zi = new Zi3() ;
	}
}
//创建父类
class Fu3{
	//public Fu3( ) {System.out.println("父类 构造方法1"); } // 3、建议，无参构造方法  随时提供
	public Fu3(int a) {
		System.out.println("父类 构造方法2");
	}
}
//创建子类
class Zi3 extends Fu3{
//	public Fu3( ) { }   //  5、构造方法不能被继承！！语法就不对！！
	public Zi3() {
		//1、子类的无参构造中，默认就存在super()，自动找父类的 无参构造
		//super() ;
		super(10) ;
		//2、如果，父类中，根本不存在无参构造了  --只能调用父类  的 含参构造 
//		super(100) ;
		//4、super关键字使用  在  构造方法里  时，必须是一条语句！！！神似this
		System.out.println("子类 构造方法");
	}
}
