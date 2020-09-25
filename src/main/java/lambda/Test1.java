package lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class Test1 {
	public static void main(String[] args) {
		// 平时的写法
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("线程启动了");
			}
		};
		runnable.run();

		/**
		 * 语法格式一：无参数，无返回值 () -> System.out.println("Hello Lambda!");
		 */
		// “->”左边只有一个小括号，表示无参数，右边是Lambda体(就相当于实现了匿名内部类里面的方法了，(即就是一个可用的接口实现类了。))
		Runnable runnable1 = () -> System.out.println("线程启动了");
		runnable1.run();

		/**
		 * 语法格式二：有一个参数，并且无返回值 (x) -> System.out.println(x)
		 */
		// 这个e就代表所实现的接口的方法的参数，
		Consumer<String> consumer = e -> System.out.println("ghijhkhi" + e);
		consumer.accept("woojopj");

		// 语法格式三：若只有一个参数，小括号可以省略不写 x -> System.out.println(x)</font(第二种方式的一种简化吧)

		// 语法格式四：有两个以上的参数，有返回值，并且 Lambda 体中有多条语句
		// Lambda 体中有多条语句，记得要用大括号括起来
		Comparator<Integer> com = (x, y) -> {
			System.out.println("函数式接口");
			return Integer.compare(x, y);
		};
		int compare = com.compare(100, 244);
		System.out.println(compare);
		
		//语法格式五：若 Lambda 体中只有一条语句， return 和 大括号都可以省略不写 即：Comparator com = (x, y) -> Integer.compare(x, y);
		//语法格式六：Lambda 表达式的参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出，数据类型，即“类型推断”(Integer x, Integer y) -> Integer.compare(x, y);
		
	}

}
