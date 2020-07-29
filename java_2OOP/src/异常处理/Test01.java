package 异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 异常捕获+异常抛出   二选一
 *  需要记住的非检查异常 
 * NullPointerException   空指针异常
 * ClassCaseException   类转型异常
 * IndexOutOfBoundsException   下标越界异常
 * IllegalArgumentException   非法参数异常
 * ArithmeticException     算术异常
 */
public class Test01 {
public static void main(String[] args) throws InputMismatchException 
   {
	method1();
	
   }

                 //异常捕获
 public static  void method1() {try { 
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		System.out.println(a/b);
	} 
	catch (Exception b)  
 //变量名可以随意定义；把所有的异常看做子类，Exception为他们共用父类，【多态】
	{  
		System.out.println("请输入正确数字");
	}
	/*catch (ArithmeticException b) {
		System.out.println("第二次不能输入0");
	}
	catch (InputMismatchException a) {
		System.out.println("请输入整数");
	}*/}

              //异常抛出
public static  void method2() throws Exception
//ArithmeticException,InputMismatchException;  
//直接抛出异常的父类Exception。【多态】
    {
	int a=new Scanner(System.in).nextInt();
	int b=new Scanner(System.in).nextInt();
	System.out.println(a/b);
     }
}