package 抽象类Abstract;

/**
 *  关于java中的abstract抽象方法：
 *    没有方法体的方法就是抽象方法！有抽象方法的类就是抽象类
 * 1、抽象方法：方法+abstract关键字，然后去掉大括号，直接分号结束；
 *    例如：public abstract void eat();
 *    
 * 2、抽象方法所在的类一定是抽象类！抽象类：class之前+abstract
 *   例如：public abstract class Animal
 *
 * 3、抽象类中可以定义普通方法。
 * 
 * 4、抽象类、抽象方法的使用。
 *   -1、抽象类不能创建对象，只能通过创建子类。【很重要】
 *   -2、抽象类中，可以有构造方法，以供 【子类创建对象时，初始化父类成员使用的。】
 *       理解：子类的构造方法中，有默认的super(),需要访问父类构造方法
 *   -3、抽象类中，不一定有抽象方法； 但是有抽象方法的，一定是抽象类。
 *   -4、子类必须覆盖重写抽象父类当中的“所有的抽象方法”
 *       覆盖重写（实现）：子类去掉抽象方法中的abstract，然后补上方法体大括号！
 */
public class Abstract_Test01 {
	public static void main(String[] args) 
	{
	Cat cat=new Cat();
	cat.eat();
	cat.name="小猫咪~~~~~";
	System.out.println(cat.AGE);
	System.out.println(cat.name);
  
//因父类是抽象类不能直接new对象，所以通过子类Dog类调用抽象爷爷Animal类中的eat()方法.
	//子类无参构造包含super()无参构造
	Animal D=new Dog(); 
	D.eat();   //爷爷Animal类中的方法

	
	//D.sleep();
	
//Animal nAnimal=new Animal();  抽象类不能创建对象，只能通过创建子类。【很重要】
	}
}

//抽象父类
abstract class Animal
{    //1、抽象类中有成员变量和常量 
	String name;
 final static  int AGE=6666666;
	 //构造方法
	public  Animal() {
		System.out.println("Animal的无参构造方法！");
	}
	//抽象方法
  protected abstract void eat();
  //普通方法
  public void sleep() {
		System.out.println("动物都睡觉！");
	}
}

   //创建子类Dog
class Dog  extends Animal {
	public void sleep() {
		System.out.println("狗狗爱睡觉！");
	}
	   //抽象方法变成普通方法：去掉abstract，增加方法体
	   @Override //重写父类方法
	 public void eat() {     //方法重写，修饰符权限>父类修饰符权限
		 System.out.println("狗爱吃骨头");
	 };
}
  
//创建子类Cat
class Cat extends Animal 
{
	    //无参构造方法
    public Cat() 
    {
		System.out.println("Cat的无参构造方法！");
	}
 public  void eat() 
    {
	 System.out.println("猫吃鱼");
	 }
}