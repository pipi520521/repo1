package 继承;

public class Test3_UseExtends {
	public static void main(String[] args) {
		//创建对象测试
		Zi4 zi = new Zi4();
		zi.eat();//1、重写前，使用了 从父类的方法体 。 重写后，使用了子类的方法体
		zi.study(); //3、使用了  子类 自己特有的方法
	}
}
//创建父类
class Fu4{
	public void eat() {
		System.out.println("爸爸在吃猪肉");
	}
}
//创建子类
class Zi4 extends Fu4{
	//4、由于子类的实现方式  和  父类不一样，所以我们可能会   需要修改  原来的功能   -- 方法重写！！！
	//5、重写要求：  子类  的 方法声明 和父类一样   
	//6、在工作中，不要擅自打开源代码直接进行修改，可能会引发很多bug。最好继承后重写！！重写并没有影响原有功能！！！
	public void eat() {  //  方法声明一样
//		super.eat();  //7、在子类中，使用父类的功能--想看看对父类的功能有没有影响  -- 没有影响
		System.out.println("儿子在喝汤");
	}
	//2、子类 除了可以继承父类的方法，还可以自己扩展方法
	public void study() {
		System.out.println("我爱java");
	}
}
