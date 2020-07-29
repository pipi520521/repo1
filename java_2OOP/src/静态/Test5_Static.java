package 静态;

public class Test5_Static {
	public static void main(String[] args) {
		//2、静态资源 建议  使用静态方式访问：直接被类名.方法名调用
		//3、静态资源  优先于  对象加载。没有对象时，静态资源也会第一时间加载进内存。
		Person.study();
		//创建对象测试
		Person  p = new Person(); 
		p.name =  "熊大";
		p.study();
		p.coding();
		System.out.println( p.name  );
		System.out.println( p.age  );
		//4、静态资源  是共享资源 。在多个对象间可以共享。
		Person  p1 = new Person();
		System.out.println( p1.name );//熊大
		//5、static不能和this或者super共用，因为加载static时可能还没有对象呢
	}
}
//创建Person类
class Person{
	//提供普通的 成员变量  成员方法
	//1、static 可以修饰成员变量  或者 成员方法
	static String name ; 
	int age ;
	
	static public  void  study() {
		System.out.println("正在学习java");
	}
	public void coding() {
		System.out.println("正在敲代码");
	}
}
