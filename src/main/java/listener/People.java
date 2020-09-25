package listener;
/**
 * 事件源，生成事件的对象，事件源提供了用于为事件注册监听器的方法
 * @author mw
 *
 */
public class People {
	
	String name;
    MyListener myListener;

    public void eat(){
	    System.out.println("吃饭");
	    myListener.doEat(new Event(this));
    }

    public void sleep(){
	    System.out.println("睡觉");
	    myListener.doSleep(new Event(this));
    }

	public People(String name, MyListener myListener) {
		this.name = name;
		this.myListener = myListener;
	}

	public People(String name) {
		this.name = name;
	}

	public void registerMyListener(MyListener myListener){
    	this.myListener = myListener;
	}


}
