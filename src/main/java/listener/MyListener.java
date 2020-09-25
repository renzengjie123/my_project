package listener;
/**
 * 事件监听器，监听并负责处理事件的方法
 * @author mw
 *
 */
public interface MyListener {
	void doEat(Event event);
	void doSleep(Event event);
}
