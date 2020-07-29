package final关键字;
/**
 * 关于java语言当中的final关键字
 *  1、final是一个关键字，表示最终的，不可变的
 *  2、final
 *     -修饰的【类】无法被继承
 *     -修饰的【方法】无法被覆盖
 *     -修饰的【变量】一旦赋值之后，不可重新赋值
 *     -修饰的【实例变量】，必须手动赋值，不能采用系统默认值。
 *     -修饰的【引用]
 *     *final修饰的引用，确定了对象的地址是一定的不能修改。
 *     *final修饰的引用，一旦指向某个对象之后，不能再指向其他对象，那么被指向的对象无法被垃圾回收器回收！ 
 *     *final修饰的引用执行某个对象之后不能指向其他对象，但是所指向的的对象内部的内存是可以被修改的
 *  3、final修饰的实例变量是不可变的，这种变量一般和static联合使用，被称为“常量”。
 *     常量的定义语法格式：
 *            public static final 类型  常量名=值；【常量名全部大写】     
 *
 *  eclipse怎么连接源码
 *   -打开某个.class字节码文件，当没有看到源码的时候
 *       点击“Attached Source”：
 *         -Workspace..      【源码在当前的工作区当中】
 *         -External File..  【源码在某个压缩包当中】 
 *         -External Folder..【源码在某个目录当中】
 * 
 *  以后大家学习的类库，一般都是包括三个部分：
 *    -源码       【可以看源码来理解程序】
 *    -字节码   【程序开发的过程中使用的就是这部分】
 *    -帮助文档【对开发提供帮助】
 *
 */
public class Test01{
     //   final int age; 编译报错
	//java语言最终规定实例变量使用final修饰之后，必须手动赋值，不能采用系统赋值
      final int age=10;//第一种
      final int a;     //第一种和第二种本质一样，否是在构造方法执行过程中赋值
      public Test01(){    
    	  this.a=5;
      }
      
	public static void main(String[] args) {
	
		final int i=10;
	  System.out.println(i);
	   // i=20;编译报错！ 修饰的的变量一旦赋值之后，不可重新赋值

	  //创建一个新的User对象
	  User u=new User(100);  // User u=0X1234
	  //又创建一个新的User对象，程序执行此处，表示上面对象已变成垃圾，等待垃圾回收器的回收
	  u=new User(200);       //u=0X4784
	  
	  //创建用户对象
	 final User user=new User(300);
	 //user=new User(200);  编译报错
	 //final修饰的引用，一旦指向某个对象之后，不能再指向其他对象，那么被指向的对象无法被垃圾回收器回收！ 
	 user.id=50;  
	 //final修饰的引用执行某个对象之后不能指向其他对象，但是所指向的的对象内部的内存是可以被修改的
	}
}

  class User { 
	  int id;
   public  User() {
	
}
	public User(int id) {
		super();
		this.id = id;
	}   
	}

 class Zi  extends User{
 
 }
