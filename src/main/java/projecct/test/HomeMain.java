package projecct.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HomeMain {
	
	public static void main(String[] args) {
		System.out.println("1. 使用TreeSet添加员工对象，并按照ID倒序排列");
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		Employee e1 = new Employee(1, "张三", "男", 25, "人事部");
		Employee e2 = new Employee(2, "张三", "男", 26, "人事部");
		Employee e3 = new Employee(3, "张三", "男", 27, "人事部");
		Employee e4 = new Employee(4, "张三", "男", 28, "人事部");
		Employee e5 = new Employee(5, "张三", "男", 29, "人事部");
		//乱序添加
		treeSet.add(e4);
		treeSet.add(e5);
		treeSet.add(e1);
		treeSet.add(e3);
		treeSet.add(e2);
		//根据id在控制台降序打印,需在实体类写compareTo方法,继承Comparable类
		Iterator<Employee> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("2. 使用LinkedHashSet添加10个书籍对象，并循环输出观察顺序");
		//LinkedHashSet便利时根据添加顺序进行打印
		LinkedHashSet<Book> linkedHashSet = new LinkedHashSet<Book>();
		Book b1 = new Book(1, "财运天降", "小说");
		Book b2 = new Book(2, "西游记", "小说");
		Book b3 = new Book(3, "红楼梦", "小说");
		Book b4 = new Book(4, "三国演义", "小说");
		Book b5 = new Book(5, "水浒传", "小说");
		Book b6 = new Book(6, "数学", "教材");
		Book b7 = new Book(7, "语文", "教材");
		Book b8 = new Book(8, "英语", "教材");
		Book b9 = new Book(9, "物理", "教材");
		Book b10 = new Book(10, "生物", "教材");
		linkedHashSet.add(b1);
		linkedHashSet.add(b2);
		linkedHashSet.add(b4);
		linkedHashSet.add(b3);
		linkedHashSet.add(b5);
		linkedHashSet.add(b7);
		linkedHashSet.add(b6);
		linkedHashSet.add(b8);
		linkedHashSet.add(b9);
		linkedHashSet.add(b10);
		Iterator<Book> iterator2 = linkedHashSet.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		System.out.println("3. 掌握TreeSet、LinkedHashSet与HashSet的异同");
		System.out.println("//相同点:元素不能重复,方法大致一样.");
		System.out.println("//不同点:HashSet是无序的,可以添加null元素;LinkedHashSet是有序的,可以添加null元素，顺序是根据你添加的顺序;");
		System.out.println("TreeSet是有序的,不能添加null元素;,默认顺序是根据你添加的顺序,也可以按照指定方式,在添加元素时就进行排序,需在实体类写compareTo方法,继承Comparable类.");
		System.out.println("4. 使用HashTable和ConcurrentHashMap添加10个产品对象，并重写hashCode和equals方法，比较记忆他们余HashMap的异同。");
		//HashTable是倒序的,是线程安全的,ConcurrentHashMap是正序的,线程不安全
		Hashtable<String, Product> hashtable = new Hashtable<String, Product>();
		ConcurrentHashMap<String,Product> concurrentHashMap = new ConcurrentHashMap<String,Product>();
		Product p1 = new Product(1, "苹果", "手机");
		Product p2 = new Product(2, "华为", "手机");
		Product p3 = new Product(3, "三星", "手机");
		Product p4 = new Product(4, "魅族", "手机");
		Product p5 = new Product(5, "小米", "手机");
		Product p6 = new Product(6, "苹果", "电脑");
		Product p7 = new Product(7, "惠普", "电脑");
		Product p8= new Product(8, "联想", "电脑");
		Product p9 = new Product(9, "华硕", "电脑");
		Product p10 = new Product(10, "戴尔", "电脑");
		hashtable.put("a", p1);
		hashtable.put("b", p2);
		hashtable.put("c", p3);
		hashtable.put("d", p4);
		hashtable.put("e", p5);
		hashtable.put("f", p6);
		hashtable.put("g", p7);
		hashtable.put("h", p8);
		hashtable.put("i", p9);
		hashtable.put("j", p10);
		Iterator<String> iterator3 = hashtable.keySet().iterator();
		while(iterator3.hasNext()){
			String key1 = iterator3.next();
			System.out.println(key1+"==="+hashtable.get(key1));
		}
		concurrentHashMap.put("a", p1);
		concurrentHashMap.put("b", p2);
		concurrentHashMap.put("c", p3);
		concurrentHashMap.put("d", p4);
		concurrentHashMap.put("e", p5);
		concurrentHashMap.put("f", p6);
		concurrentHashMap.put("g", p7);
		concurrentHashMap.put("h", p8);
		concurrentHashMap.put("i", p9);
		concurrentHashMap.put("j", p10);
		Iterator<String> iterator4 = concurrentHashMap.keySet().iterator();
		while(iterator4.hasNext()){
			String key2 = iterator4.next();
			System.out.println(key2+"==="+concurrentHashMap.get(key2));
		}
		System.out.println("5. 使用LinkedHashMap添加10个保姆对象，并分别观察使用accessOrder和不使用accessOrder的区别，并掌握这些区别。");
		//LinkedHashMap是顺序的,不使用accessOrder时:对元素进行访问,位置不变;使用accessOrder时:对元素进行访问,该元素位置放到链表末尾.
		LinkedHashMap<String, Nanny> linkedHashMap1 = new LinkedHashMap<String, Nanny>();
		LinkedHashMap<String, Nanny> linkedHashMap2 = new LinkedHashMap<String, Nanny>(4,0.75f,true);
		Nanny n1 = new Nanny(1, "张阿姨", "做饭");
		Nanny n2 = new Nanny(2, "李阿姨", "洗衣服");
		Nanny n3 = new Nanny(3, "王阿姨", "拖地");
		Nanny n4 = new Nanny(4, "赵阿姨", "带小孩");
		Nanny n5 = new Nanny(5, "周阿姨", "暖被窝");
		Nanny n6 = new Nanny(6, "郑阿姨", "陪逛街");
		Nanny n7 = new Nanny(7, "刘阿姨", "赚钱");
		Nanny n8 = new Nanny(8, "孙阿姨", "挡酒");
		Nanny n9 = new Nanny(9, "徐阿姨", "司机");
		Nanny n10 = new Nanny(10, "郭阿姨", "保镖");
		linkedHashMap1.put("a", n1);
		linkedHashMap1.put("b", n2);
		linkedHashMap1.put("c", n3);
		linkedHashMap1.put("d", n4);
		linkedHashMap1.put("e", n5);
		linkedHashMap1.put("f", n6);
		linkedHashMap1.put("g", n7);
		linkedHashMap1.put("h", n8);
		linkedHashMap1.put("i", n9);
		linkedHashMap1.put("j", n10);
		linkedHashMap1.get("a");
		Iterator<String> iterator5 = linkedHashMap1.keySet().iterator();
		while(iterator5.hasNext()){
			String key3 = iterator5.next();
			System.out.println(key3+"==="+linkedHashMap1.get(key3));
		}
		linkedHashMap2.put("a", n1);
		linkedHashMap2.put("b", n2);
		linkedHashMap2.put("c", n3);
		linkedHashMap2.put("d", n4);
		linkedHashMap2.put("e", n5);
		linkedHashMap2.put("f", n6);
		linkedHashMap2.put("g", n7);
		linkedHashMap2.put("h", n8);
		linkedHashMap2.put("i", n9);
		linkedHashMap2.put("j", n10);
		linkedHashMap2.get("a");
		Iterator<String> iterator6 = linkedHashMap2.keySet().iterator();
		while(iterator6.hasNext()){
			String key4 = iterator6.next();
			System.out.println(key4);
		}
		Iterator<Nanny> iterator7 = linkedHashMap2.values().iterator();
		while(iterator7.hasNext()){
			System.out.println(iterator7.next());
		}
		
	}


}
