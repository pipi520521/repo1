package 构造方法;

//内容有：方法的封装、构造方法、 静态代码块【类加载的时候】、和构造代码块【创建类的时候】和局部代码块
public class ConstuctTest01 {

	public static void main(String[] args) {
		Animal a=new Animal("山羊","白色",110);
		System.out.println(a.getName()+a.getColor()+a.getAge());
		a.eat();
		Animal b=new Animal("喜洋洋","白色",666);
		System.out.println(b.getName()+b.getColor()+b.getAge());
		b.eat();
		Animal c=new Animal();
		System.out.println(c.getName()+c.getColor()+c.getAge());
		b.eat();
	}

}

class  Animal{
private String name;
private	String color;
private	Integer age; 

{System.out.println("构造代码块1");}  
//构造代码块用于抽取对象共有属性
static	{System.out.println("静态代码块1");}
//静态代码块优先于构造代码块优于局部代码块

	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;	}
	public String getColor() {
		return color;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
        //无参构造方法默认存在的前提是：【不提供含参数构造方法！】
	 public Animal() {  //这个无参构造方法，要求任何时候必须手动输入“无参构造方法”
		this("黑山羊","黑色");
	}
 
	  // 有参构造方法
	public Animal(String name) {
		super();
		this.name = name;
		
	}
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println("这是二参构造");
	}
	public Animal(String name, String color, Integer age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		
	}

	public void eat() {  // 没加private的方法可以被继承
		{System.out.println("局部代码块");}
      System.out.println("大部分动物是肉食动物");
      {int a = 3;int b=5;System.out.println(a+"*"+b+"="+a*b);} //局部代码块
	}
	    {System.out.println("构造代码块2");}
static	{System.out.println("静态代码块2");}
}