package 继承;

public class Test1_Extends {
	public static void main(String[] args) {
		//创建父类对象测试
		Father f = new Father(); 
		f.sleep();
		f.eat();
		System.out.println( f.skin );
		System.out.println( f.country );
		//3、 创建子类对象测试
		
		Son s = new Son();
		//直接使用了爸爸类的功能！！
		s.eat();
		System.out.println( s.skin );
		System.out.println( s.country );
//		System.out.println(s.sifangmoney);//5.1、是父类的私有成员，子类看不见更用不了
		//直接使用了爷爷类的功能！！
		s.sleep();
	}
}
//7、继承可以传递
class Yeye{
	public void sleep() {
		System.out.println("Yeye...sleep()");
	}
}
//创建父类
class Father extends Yeye {
	//5、父类的私有成员  子类 无法 继承
	private  double sifangmoney = 100 ;
	String skin ="黄种人" ; 
	String country = "中国"; 
	
	public void eat() {
		System.out.println("Father...eat()");
	}
}
//1、创建子类，通过extends关键字表示继承
//4、java只支持单继承
class Son extends Father{//6、继承的关系是is a的关系，强制要求子类必须 继承父类，否则一无所有 -- 强耦合性！！
	//2、相当于子类把父类的功能  通通复制过来了
}


