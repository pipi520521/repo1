package 代码块;
/**
 * 执行顺序：静态-构造代码块-构造方法-局部代码块
 *静态代码块:成员位置，作用是优先加载，随着类加载时触发，并且只加载一次；
 *构造代码块:成员位置，作用是提取构造方法的共性，当实例化是被加载
 *局部代码块：在方法里，作用是控制变量的范围，当方法被调用时加载
 */
public class Test01_Block {
	public static void main(String[] args)  {
		// 测试	
		Student  s = new Student();
		s.show();
	
	}
}
//创建Student类
class Student{
	//1、提供静态代码块：位置是在成员位置 +  只会加载一次 + 加载的早
	static {
		System.out.println("静态 代码块");
	}
	//提供构造代码块：位置是在成员位置
	{
		System.out.println("构造  代码块 ");
	}
	//提供构造方法
	public Student() {
		System.out.println("构造方法");
	}
	//提供局部代码块
	public void show() {
		{
			System.out.println("局部 代码块");
		}
	}
}
