package 方法重写Override;

/**
 *    @Override  做注解
 *   关于java语言中方法的覆盖
 * 1、方法覆盖又被称为方法重写，英语单词：override【官方的】/overwrite
 * 2、什么时候使用方法重写？
 *    -当继承的父类中的方法已经无法满足当前子类的业务需求
 *     子类有必要将继承的方法重写。。
 * 3、代码满足什么条件之后，就构成方法的覆盖呢？？     【以下几点学会】
 *    *方法重写发生在具有继承关系的父子类之间
 *    *方法重写的时候：   返回值类型相同、方法名相同、形参列表相同
 *    *方法重写的时候：       【访问权限不能更低，可以更高】
 *    *方法重写的时候：        抛出异常不能更多，可以更少【以后讲，讲完异常之后才能解释】
 * 4、建议方法重写的时候尽量工具生成，不要编写，容易出错，导致没有产生覆盖
 * 5、注意：
 *       私有方法不能继承，所以不能覆盖。
 *       构造方法不能继承，所以不能覆盖。
 *       静态方法不存在覆盖。【讲完多态之后解释】
 *       方法只针对方法，跟属性无关。
 * 
 *
 */
public class Override {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.move();
		Bird b=new Bird();
		b.move();
		Cat c=new Cat();
		c.move();
		YingWu d=new YingWu();
		d.move();
	}

}

 class Animal
{
public void move()
   {
	System.out.println("动物在移动！");
   }
}
 class Cat extends Animal {
	public void move()
	   {
		System.out.println("猫在走猫步");
	   }

	public void catchMouse() {
		System.out.println("猫抓老鼠");	
	}
}
 class Bird extends Animal {
	//方法重写
	 
	public void move()
	   { 
		System.out.println("鸟儿在飞翔");
	   }

	public void fly() {
		System.out.println("Bird fly ");
	}
}
 class YingWu extends Bird {

		//这里覆盖的是Bird当中的move方法
		public void move() {
			
			System.out.println("y鹦鹉飞呀呀");
		}

	}

