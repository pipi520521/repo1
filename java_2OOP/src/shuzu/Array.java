package shuzu;

import java.util.Random;

public class Array {
	public static void main(String[] args) {
		method();// 遍历数组，存入1到10
		method2();//创建数组，存入随机数
	}
	public static void method2() {
		// 1、创建数组，动态初始化
		int a[] = new int[5];
		
		// 2、遍历数组，根据下标
		for (int i = 0; i < a.length; i++) {
			// 3、根据下标获取每个数据，修改成1-10
			a[i] = new Random().nextInt(100) ;
		}
		
		// 4、打印数组的数据(还是需要遍历，输出每个数据)
		for (int i = 0; i < a.length; i++) {
			System.out.println( a[i] );
		}
		
	}
	public static void method() {
		// 1、创建数组，动态初始化
		int a[] = new int[10];
		
		// 2、遍历数组，根据下标
		for (int i = 0 ;  i < a.length ; i++) {
			// 3、根据下标获取每个数据，修改成1-10
			a[i] = i+1 ;   //a[i]根据下标i获取a数组里的数据
		}

		// 4、打印数组的数据(还是需要遍历，输出每个数据)
		for (int i = 0 ;  i < a.length ; i++) {
			System.out.println( a[i] );
		}
		
		System.out.println(a);//[I@15db9742地址值
	}
}
