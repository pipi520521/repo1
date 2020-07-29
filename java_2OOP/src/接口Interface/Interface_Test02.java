package 接口Interface;

//介个类用来测试接口的复杂用法：接口的多继承+多实现+继承的同时多实现
public class Interface_Test02 
{
	public static void main(String[] args) 
	{
		
	}
}

//创建接口
interface  Car1{
	void save();
}

//创建接口
interface  Car2{
	void add();
}

//1、让3号接口想要同时使用1号和2号接口的功能； 接口与接口之间的关系是【继承】关系
interface  Car3 extends Car1,Car2{
	void drink();
}

//2、同时实现了3号接口，需要重写3个抽象方法  ：多继承
 //Impl  是一个资源包，用来存接口的实现类
 abstract class xiaocheImpl implements  Car3 {
//必须重写所有抽象方法才能去掉abstract
}

 //3、实现类和接口之间：是实现关系，而且可以多实现
 abstract class Impl2 implements Car1, Car2 {
	//必须重写所有抽象方法才能去掉abstract
 }

 //4、在继承的同时+多实现【一定要先继承 再多实现】
 class Fu{}
 class Zi extends Fu implements Car1, Car2
 {
	public void save(){};
	public void add(){};
	 }


