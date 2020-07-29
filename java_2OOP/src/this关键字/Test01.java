package this关键字;
/**
 * 关于java语言当中的关键字
 *  1、this是一个关键字，翻译为：这个
 *  2、this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，
 *     this存储在“JVM堆内存java对象内部”。
 *  3、创建100个java对象，每一个对象都有this，也就说有100个不同的this。
 *  4、this可以出现在“实例方法当中”，this指向当前正在执行这个动作的对象。（this代表当前对象）
 *  5、大多情况下this可以省略不写。
 *  6、this不能使用在带有static的方法中。
 *  7、重要：在带有static中不能直接访问实例变量和实例方法。因为实例变量和实例方法都需要对象存在。
 *         而static的方法中是没有this的，也就是说当前对象不存在的。
 *         自然也是无法访问当前对象的实例变量和实例方法。
 *  8、“this.”什么时候不能省略？   【很重要】
 *    -用来区分局部变量和实例变量的时候，“this.”不能省略
 *  9、this可以用在哪里：  必须学会以下二点！
 *    -1、可以使用在实例方法当中，代表当前对象【语法格式：this.】
 *    -2、可以使用在构造方法中，通过“当前的构造方法调用其它的构造方法”【语法格式：this（实参）；】
 *      重点【记好】：this()只能出现在构造函数第一行。      
 *  10、	this和super的区别
 *     1、this代表本类对象的引用，super代表父类对象的引用。
 *     2、this用于区分局部变量和成员变量【this用在成员变量】
 *     3、super用于区分本类变量和父类变量【super用在父类变量】
 *     4、this.成员变量  this.成员方法()  this(【参数】)代表调用本类内容
 *     5、super.成员变量  super.成员方法()  super(【参数】)，代表调用父类内容
 *     6、this和super不可以同时出现在同一个构造方法里，他们两个只要出现都得放在第一行，同时出现的话，到底第一行放谁呢。。
 */
public class Test01
{
  String name; //实例变量，必须采用“引用.”的方式访问。
      //构造方法
  public  Test01() {}
  //重点：没有static关键字的方法被称为“实例方法”；实例方法怎么访问？“引用.”
  //重点：没有static关键字的变量被称为“实例变量”
  //注意：当一个行为/动作执行的过程当中需要对象参与的，那么这个方法一定要定义为“实例方法”，不要带static关键字。
  public void shopping() {
	  //完整写法，大多情况下this可以省略不写。*/
	System.out.println(this.name+"在购物！");    //完整写法
          }
  
  public static void dosome() {
	  
	      //System.out.println(name);
//编译报错！ 因为修饰符列表上有static，采用“类名.”的方式访问的，所以这个执行过程中没有“当前对象”。
//自然也不存在this(this代表的是当前正在执行这个动作的对象)	    
         }
  public static void doOther() {
	  //想访问name
	  Test01 t=new Test01();
     System.out.println(t.name);
     //这里访问的name是t一弄指向对象的name
     }
}