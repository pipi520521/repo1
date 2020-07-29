package 参数传递;

//参数传递，只能是“值”，这个值可能是实际值，也可能是一个java对象的内存地址
public class Test02 
{
	public static void main(String[] args) 
	{/*u本身有内存地址，是局部变量，u变量中保存的那个值也非常特殊，这个值
	  *是另一个java对象中的内存地址。*/
		User u=new User(20);
		add(u);
		System.out.println("main--->"+u.age);   //21
	}
	//和main中的u不是一个u，内存地址不一样
   public static void add(User u) {
	u.age++;
	System.out.println("add--->"+u.age);       //21
   }
}
class User{
	int age;
	//构造方法
	public User(int i)
	{
		age =i;
	}
}