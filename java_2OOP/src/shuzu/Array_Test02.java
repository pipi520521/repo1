package shuzu;

import java.util.Arrays;

//这类用来测试 数组工具类Arrays
//sort()为什么没有返回值
//copyOf()为什么有返回值：因为数组一旦创建，长度不能变！！
public class Array_Test02 {
	public static void main(String[] args) {
		// method(); //toString()把数组的数据变成字符串展示
		// method2(); //sort()：把无序数组排序，从小打大
		method3(); // copyOf()：复制数组
	}
	public static void method3() {
		//创建原数组
		int a[] = {1,2,3,4,5,6};
		//copyOf(m,n)--m是原数组名，n是新数组长度
		//其中，第二个参数n，如果新数组的长度>原数组长度，相当于在扩充新位置  ---  扩容
		//如果新数组的长度<原数组的长度，相当于在截取数据  --- 缩容
		int[] b = Arrays.copyOf(a, 10) ;
		int[] c  = Arrays.copyOf(a, 3);
		
		//[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
		System.out.println(   Arrays.toString(b)  );//查看b的数据
		//[1, 2, 3]
		System.out.println(   Arrays.toString(c)  );
	}
	public static void method2() {
		int[] a = { 9, 3, 7, 1, 8 };
		// 自定义排序算法-- 冒泡排序/快速排序/合并排序
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));// [1, 3, 7, 8, 9]
	}
	public static void method() {
		int[] a = { 1, 2, 3, 4, 5 };
		// 以前想看数组里的数据 只能遍历
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// 现在 - 使用数组工具类Arrays.toString(a) -- 把a数组中的所有数据转成字符串展示
		System.out.println(Arrays.toString(a)); // [1, 2, 3, 4, 5]
	}
}
