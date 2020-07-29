package 程序设计题;
/**
 * 程序设计：
	具体事物：培优班老师，高手班老师     二个子类
	共性：备课，讲课                                    一个父类Teacher：方法备课  讲课
	要求：利用面向接口 面向抽象的思想完成程序设计并测试
 * 
 *
 */
public class Test01 
{
	public static void main(String[] args) 
	{
		Teacher you=new YouTeacher(); 
		//you.age  不能访问age，因为age是子类特有属性
		System.out.println(you.name);  
		you.prepare();
		you.giveLessons();
		
		Teacher gao=new GaoTeacher();
		gao.name="高手老师";
		System.out.println(gao.name);
		gao.prepare();
		gao.giveLessons();
	}
}
//创建抽象Teacher父类
abstract class Teacher{
	String name;
	abstract public void prepare(); 
	abstract public void giveLessons(); 
}

  //子类不可以重写父类成员属性，重写针对的只有方法
class YouTeacher extends Teacher{
	String name="培优老师";  //这是子类自己特有的属性
	Integer age=77;
	 public void prepare() {
		 System.out.println("培优老师备课时间长");} 
	 public void giveLessons(){
		 System.out.println("培优老师授课讲得有激情");
	 }
}

class GaoTeacher extends Teacher{
	 public void prepare(){ 
		 System.out.println("高手老师备课时间短");} 
	public void giveLessons(){
		System.out.println("高手老师授课应该有激情些");}
}