package projecct.test;

public class Nanny {
	
	private int id;//编号
	private String name;//名字
	private String type;//类型
	public Nanny() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nanny(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Nanny [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	

}
