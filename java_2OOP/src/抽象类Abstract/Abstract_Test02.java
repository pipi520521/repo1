package 抽象类Abstract;

public class Abstract_Test02 
{
	public static void main(String[] args) {
		// 创建多态对象测试
		Fu f= new Zi() ; //父类引用  指向 子类对象
		//3、编译看左边，只要想用的功能，必须是父类提供的。
		    //运行看右边，多指发生了方法重写后，使用右边的也就是子类的方法体。
		//1、成语方法的使用，一定是使用父类的(方法声明)，但是，方法体，由于可以重写，所以用子类的方法体。
		f.study();  //我爱java，
		//2、成员变量的使用，一定是使用父类的，由于不存在重写，所以执行的也是父类的。
		System.out.println( f.name  );  // jack，
		//3、静态方法，可以存在重写吗？  --  不可以！！！
		f.play();  //由于静态资源根本不存在重写，所以直接执行父类的方法声明和方法体。即使子类有一个和父类一模一样的方法也不是重写！！！
	}
}
class Fu{
	String name = "jack" ;
	public void study() {
		System.out.println("爸爸正在学习");
	}
	static public void play() {
		System.out.println("爸爸正在玩儿");
	}
}
class Zi extends Fu{
	String name = "xiongda" ;
	//方法重写
	public void study() {
		System.out.println("我爱java");
	}
	static public void play() {//这个是子类特有的，不是重写！
		System.out.println("儿子正在玩儿");
	}
}

