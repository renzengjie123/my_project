package listener;
/**
 * 事件，发生事件的组件，也就是被监听的对象
 * @author mw
 *
 */
public class Event {
	private People people;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Event(People people) {
		this.people = people;
	}


}
