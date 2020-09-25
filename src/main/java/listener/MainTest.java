package listener;

public class MainTest {

	public static void main(String[] args) {
		People people = new People("小红");
		//下面这个调用就是通过实现接口创建了一个接口实现的对象 myListener
		people.registerMyListener(new MyListener() {

			public void doEat(Event event) {
				System.out.println("不让"+event.getPeople().name+"吃饭");
			}

			public void doSleep(Event event) {
				System.out.println("不让"+event.getPeople().name+"睡觉");
			}
		});
		//其实作用等同于
		MyListener myListener = new MyListener() {
			public void doEat(Event event) {
				System.out.println("不让"+event.getPeople().name+"吃饭");
			}

			public void doSleep(Event event) {
				System.out.println("不让"+event.getPeople().name+"睡觉");
			}
		};

		people.eat();
		people.sleep();

		People p = new People("大黄");
		p.registerMyListener(new MyListener() {
			public void doEat(Event event) {
				System.out.println("让"+event.getPeople().name+"吃饭");
			}

			public void doSleep(Event event) {
				System.out.println("让"+event.getPeople().name+"睡觉");
			}
		});

		p.eat();
		p.sleep();

	}

}
