package 程序设计题;

public class Test02 {
	public static void main(String[] args) 
	{
		Teacher1 you=new YouTeacherImpl(); 
		System.out.println(you.name);  
		you.prepare();
		you.giveLessons();
		
		Teacher1 gao=new GaoTeacherImpl();
		System.out.println(gao.name);
		gao.prepare();
		gao.giveLessons();
	}
}

//创建抽象Teacher父类
interface Teacher1{
String name="java老师";   ///接口常量必须有初始值
void prepare();    //abstract public 可以省略
void giveLessons(); 
}

  //子类不可以重写父类成员属性，重写针对的只有方法
class YouTeacherImpl implements Teacher1{  //implements  手段、工具
	String name="培优老师";  //这是子类自己特有的属性
	Integer age=77;
	 public void prepare() {
		 System.out.println("培优老师备课时间长");} 
	 public void giveLessons(){
		 System.out.println("培优老师授课讲得有激情");
	 }
}

class GaoTeacherImpl implements Teacher1{
	 public void prepare(){ 
		 System.out.println("高手老师备课时间短");} 
	public void giveLessons(){
		System.out.println("高手老师授课应该有激情些");}
}
