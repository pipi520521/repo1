package 参数传递;
/**
 * 最终结论："值"和特殊值"址" 传递！
 * 方法调用的时候，涉及到参数传递，
 * java值遵循一种语法机制，就是将变量中保存中的“值”传递过去了，
 * 这个值可能是实际值，也可能是一个java对象的内存地址
 */


public class Test01
{
	public static void main(String[] args) 
	{  //i变量是局部变量，i变量本身战友内存空间，所以也有内存地址，i变量保存的是10这个字面值。
		int i=10;
		add(i);
/**
 *add方法调用的时候，给add方法传递了一个变量i，到底传的是什么？
 *  -参数传递实际上传递的是变量中保存的具体值。
 *  -int i=10
 *  -add(i);  等同于add(10); 
  */		
 
		System.out.println("main-->"+i);  //10
	}
	public static void add(int i) {
		i++;
		System.out.println("Add-->"+i);   //11
	}
}
