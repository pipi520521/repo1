package 多态;
/**
 *  1、多态：同一对象在不同时刻具有不同形态
 *  2、特点：
 *	-前提： 发生继承关系  +向上造型【方法重写】
 *	-口诀1：父类引用指向子类对象
 *			--Animal a = new Dog();
 *	-口诀2：多态中，编译看左边，运行看右边
 *			--编译看左边：想要保存成功，看父类
 *			--运行看右边：想要结果，找子类
 * 3、多态的好处：
 *  -可以把不同的子类对象都当作父类来看，可以屏蔽不同子类对象之间的差异，
 *   写出通用的代码，做出通用的编程。
 *	-统一调用标准，一切向父类看齐。
 *	-提高了程序的扩展性和可维护性。
 * 4、成员变量：由于不存在重写，所以直接使用父类的
 *	  成员方法：由于存在重写，所以调用了父类的  方法声明  ，使用了  子类的 方法体
 *	  静态资源：由于不存在重写，所以直接使用父类的  方法声明 和方法体
 * 5、向下造型:目的是为了访问子类特有的方法或者属性
 *     if (animal instanceof Cat) {
 *		Cat c = (Cat) animal;}
 */
public class Test01 {

	public static void main(String[] args)
	{     
		Dog d=new Dog();
		System.out.println(d.name); 
		//动物    成员变量不能重写，所以执行的也是父类的
		d.eat();
		// 方法被重写/覆盖了，用的是子对象的方法。
		d.run();
		Dog.haha();  //类名.方法  调用
		
		//父类引用指向子类对象，多态/向上转型
		Animal a=new Dog();  //找的也是Dog()对象，编译看左边，运行看右边
		a.eat();     //狗吃骨头 
		//编译看左边【能否保存】，父类必须有eat()方法
	    //a.run(); 父类中没有run()方法，编译报错
		a.haha();  //动物叫声;  执行的是父类的haha方法，静态方法不能重写  
		
	/*Cat cat=(Cat) a;
	*cat.eat();
	*编译通过，运行异常：java.lang.ClassCastException
	*/
		if (a instanceof Cat) {
			Cat c = (Cat) a;
			System.out.println(c.getName());
		}
		else if (a instanceof Dog) {
			System.out.println(d.name+"haha");      //哈士奇！haha
		}
	}

}

  // 父类
 class Animal{
   private  String name="动物";
   //封装属性
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   //构造方法，包括无参和有参
	public Animal() {}
public Animal(String name) {
	super();
	this.name = name;
}
    //方法
	 public void eat() {
		System.out.println("吃啥都行");
	}
	 
	 //静态方法
	 public static void haha() {
		System.out.println("动物叫声");
	}
 }
 
 
 //创建子类 Dog 继承父类 Animal
 class Dog extends Animal{
	 String name="哈士奇！";  //【成员变量不能重写】
	 public Dog() {}
	//重写父类中的eat方法
	 public void eat() {
			System.out.println("狗吃骨头");
		}
	 
	 public static void haha() {
			System.out.println("小狗叫声");
		}
	 
	   //子类独有的方法
	 public void run() {
			System.out.println("狗跑的快");
		}
 }
 
class Cat extends Animal{
	
}
