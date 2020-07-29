package private_Test;

public class Test01 {
	public static void main(String[] args) {
		//2、创建对象测试
//		new Student().coding() ; //匿名对象，缺点：使用时这个对象只执行一个任务。优点：节省内存
		Student s = new Student() ;
//		s.coding();  // 3.1、因为coding()被封装了，除了自己类中，别的类里都不能用。
		s.game();
		
//		s.name = "jack";//5.1 设置值失败，因为name被private了
//		System.out.println(s.name);//5.1 获取值失败，因为name被private了
		//7、调用公共的setName()设置值
		s.setName("jack");
		//8.1、调用公共的getName()获取值
		String name = s.getName() ; 
		System.out.println(name);
//		System.out.println(s.age);
//		System.out.println(s.score);
		s.setAge(20);
		s.setScore(99.9);
		System.out.println(  s.getAge() );
		System.out.println(  s.getScore() );
		
	}
}
//创建学生类
class Student{
	//TODO 封装以下属性  +  提供set/get  +  并测试
	private String subject ; 
	private String addr ; 
	private int tall ;
	//右键 - source - setters  and getters - select all - ok
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	
	//5、使用private修饰成员变量，虽然可以提高安全性。但是，外界还想改，还想获取怎么办？
	private String name ;
	
	//6、如果外界想访问私有的成员变量，来访问公共的全局访问点
	//7。1、外界可以访问公共的setXxx() 设置值。
	public void setName(String n) {
		name = n ;//帮name属性设置值
	}
	//8、可以访问公共的getXxx()获取值。
	public String getName(){
		return name  ; //把name属性的值返回给外界调用位置
	}
	//封装以下属性  +  提供set/get  +  并测试
	private int age ;
	private double score ; 
	//set()用来设置值  
	public void setAge(int a) {
		age = a ;
	}
	public void setScore(double d) {
		score = d  ;
	}
	//get()用来获取值
	public int getAge(){
		return age ; 
	}
	public double getScore(){
		return score ;
	}
	
	//3、通过private关键字实现封装，就只能在本类中使用。如果还想使用封装的资源，只能提供间接的访问方法
	private void coding() {
		System.out.println("coding...");
	}
	public void game() {
		coding() ;//4、间接访问private资源
		System.out.println("game...");
	}
	
}
