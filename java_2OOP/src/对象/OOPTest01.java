package 对象;

/* 1、一个.java源文件，可以包含多个类，但是public修饰的类只能有一个，
 *    而且public的雷鸣就是文件名。
 */
public class OOPTest01 {

	public static void main(String[] args) {
		Phone a=new Phone(6600,"华为P40Pro");
		System.out.println(a.brand+a.price);
		a.phone();
		
		//修改属性值
		a.price=8888;
		a.brand="华为mate40pro";
		System.out.println(a.brand+a.price);
		Phone b=new Phone("7.6寸","红色");
		
		//选择构造方法，修改成员变量初始值
		System.out.println(b.size+b.color);
		a.phone();
	}

}
 class Phone{
	 //特征：颜色、尺寸、品牌、价格
	 String color;
	 String size;    
	 String brand;
	 double price;
	 
	 //构造方法赋初始值
	 Phone(double a,String b){   
		 price=a; brand=b;}
	//构造方法赋初始值
	Phone(String a,String c){   
		size=a; color=c;
	 }
	 //行为/方法：打电话、发短信、听音乐 
	 public void mucic() {
		System.out.println("手机听音乐");
	}
	 public void phone() {
			System.out.println("手机可以打电话");
		}
	 public void message() {
			System.out.println("手机可以发短信");
		}

 }