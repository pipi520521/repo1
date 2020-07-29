package 继承;

//这个类用来测试  继承的  变量使用
public class Test2_UseExtends {
	public static void main(String[] args) {
		//创建对象测试
		Zi2 zi = new Zi2();
		zi.show();
	}
}
//创建父类
class Fu2{
	int sum = 10 ;
	int count = 30 ; 
}
//创建子类
class Zi2 extends Fu2{
	int count = 20 ; 
	
	public void show() {
		int count = 10 ; 
		System.out.println(count);//10   ，使用了局部变量
		System.out.println( this.count ); //20，使用了成员变量。当成员变量和局部变量同名时，想用成员变量就通过this调用
		
		//1、想要在子类中，使用父类的sum   -- 可以直接用！
		System.out.println(  super.sum  );
		//2、想要在子类中，使用父类的count   -- 由于已经和子类的变量名同名了，如果想用父类的，必须super
		//3、super关键字，用来表示父类对象的引用。可以在子类中使用父类功能。
		System.out.println( super.count  );//30，使用了父类变量
	}
}
